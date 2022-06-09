package sg.edu.iss.club.domain;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@Entity
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookingId;
	@OneToOne
    private Member member;
	@OneToOne
    private Facility facility;
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
    private LocalDate  startDate;
	@FutureOrPresent
	@DateTimeFormat (pattern="dd-MM-yyyy")
    private LocalDate  endDate;
	
    private String comments;
    private BookingStatus status;
	public Booking(int bookingId, @NotEmpty Member member, @NotEmpty Facility facility, @FutureOrPresent LocalDate startDate,
			@FutureOrPresent LocalDate endDate, String comments, BookingStatus status) {
		super();
		this.bookingId = bookingId;
		this.member = member;
		this.facility = facility;
		this.startDate = startDate;
		this.endDate = endDate;
		this.comments = comments;
		this.status = status;
	}
	public Booking(@FutureOrPresent LocalDate startDate, @FutureOrPresent LocalDate endDate, String comments,
			BookingStatus status) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.comments = comments;
		this.status = status;
	}
   
    

}
