package sg.edu.nus.cats.services;

import java.util.ArrayList;

import sg.edu.nus.cats.model.Course;

public interface CourseService {

	ArrayList<Course> findAllCourses();

	Course findCourse(Integer ceid);

	Course createCourse(Course course);

	Course changeCourse(Course course);

	void removeCourse(Course course);

	ArrayList<Course> findCoursesByEID(String eid);

	ArrayList<Course> findPendingCoursesByEID(String eid);

}