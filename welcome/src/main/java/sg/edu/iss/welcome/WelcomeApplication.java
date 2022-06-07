package sg.edu.iss.welcome;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import sg.edu.iss.welcome.model.Lecturer;
import sg.edu.iss.welcome.model.Student;
import sg.edu.iss.welcome.repo.LecturerRepository;
import sg.edu.iss.welcome.repo.StudentRepository;

@SpringBootApplication
public class WelcomeApplication {
	
	@Autowired
	StudentRepository srepo;

	@Autowired
	LecturerRepository lrepo;
	
	public static void main(String[] args) {

		SpringApplication.run(WelcomeApplication.class, args);
		
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			
		System.out.println("Inside the command line");
		Student s = new Student("Aye Mya Phoo", "Brilliant Colors!", 5.0);
		Student s1 = new Student("Gabriel Chua Reyes", "Black is cool!", 5.0);
		Student s2 = new Student("Jithin Krishnan", "Hidden Dragon!", 5.0);
		Student s3 = new Student("ZHAO ZIYOU", "Quiet!", 5.0);
		ArrayList<Student> solist = new ArrayList<Student>();
		solist.add(s);solist.add(s2);solist.add(s3);solist.add(s1);
		//System.out.println(s.toString());
        srepo.saveAllAndFlush(solist);
        ArrayList<Student> srlist  = srepo.funnyNameOne("Quiet!");
        for (Student current : srlist) {
        	System.out.println(current.toString());
		}
        
        Lecturer l = new Lecturer("Suria", "Cranky", 100.00);
        Lecturer l1 = new Lecturer("Tin", "Friendly", 100.00);
        Lecturer l2 = new Lecturer("Esther", "Bossy", 100.00);
        Lecturer l3 = new Lecturer("Cher Wah", "Sweet", 100.00);
        Lecturer l4 = new Lecturer("Yuen Kwan", "Cheers", 100.00);
        lrepo.save(l);lrepo.save(l1);lrepo.save(l2);lrepo.save(l3);lrepo.save(l4);
        ArrayList<Lecturer> list = lrepo.queryByNickname("Cranky");
        for (Lecturer current : list) {
			System.out.println(current.toString());
		}
		};
	}

}
