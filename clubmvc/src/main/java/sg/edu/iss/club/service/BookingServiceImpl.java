package sg.edu.iss.club.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sg.edu.iss.club.domain.Booking;
import sg.edu.iss.club.domain.BookingStatus;
import sg.edu.iss.club.repo.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	BookingRepository brepo;
	
	@Transactional
	public void addBooking(Booking booking) {
		 brepo.save(booking);
	}

	@Transactional
	public boolean checkAvailability(Booking booking) {
		boolean bookingstatus =true;
		Date current = booking.getStartDate();
		while (current.before(booking.getEndDate()) || current.equals(booking.getEndDate()) ) {
		    List<Booking> blist = brepo.findBooking(current, booking.getFacility().getFacilityId());
		    for (Iterator<Booking> iterator = blist.iterator(); iterator.hasNext();) {
				Booking booking2 = (Booking) iterator.next();
				if (booking2.getStatus().equals(BookingStatus.BOOKED)) {
			    	bookingstatus = false;
			    }
			}
		    Calendar c = Calendar.getInstance();
	        c.setTime(current);
	        c.add(Calendar.DATE, 1);
	        current = c.getTime();
		} 
		return bookingstatus;
	}

	@Transactional
	public void cancelBooking(Booking booking) {
		booking.setStatus(BookingStatus.CANCELED);
		brepo.save(booking);
		
	}
	
	@Transactional
	public List<Booking> listBooking() {
		return brepo.findAll();
	}	

	@Transactional
	public Booking findBookingById(Integer id) {
		 return brepo.findById(id).get();
		 
	}	

}
