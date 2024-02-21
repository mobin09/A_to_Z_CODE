package course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springBoot.learnjpahibernate.course.Course;

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner{
    @Autowired
	private courseJdbcRepository repository;
	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Run Method is called");
//		
//		repository.insert(new Course(1, "Full Stack java developers", "From iNuerons"));
//		repository.insert(new Course(2, "Full Stack java developers", "From in28Minutes"));
//		repository.insert(new Course(3, "Microservices in Java", "From in28Minutes"));
//		repository.insert(new Course(4, "Data Engineering", "From META"));
//		repository.insert(new Course(5, "DSA", "500 Questions"));
//		repository.insert(new Course(6, "AWS", "From in28Minutes"));
//		repository.insert(new Course(7, "Azure", "From Microsoft"));
//		
//		repository.delete(7);
//		
//		System.out.println(repository.getRecordsById(1));
//		System.out.println(repository.getRecordsById(3));
		
	}

}
