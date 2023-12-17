package appUsingSpringBasic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class HelloWorldConfiguration {
    
	@Bean
	public String name() {
    	return "Mobin Arshad";
    }
	
	
	@Bean
	public int age() {
		return 24;
	}
	
	@Bean
	public int age1() {
		return 25;
	}
	@Bean
	public int age2() {
		return 26;
	}
	
	@Bean
	public Person person() {
		Person p1 = new Person();
		p1.setAge(26);
		p1.setName("Mohit");
		return p1;
	}
	
	@Bean
	@Primary
	public Person person2() {
		Person p1 = new Person();
		p1.setAge(26);
		p1.setName("Mohit");
		return p1;
	}
	
	
	@Bean(name ="addr")
	public Address address() {
		Address ad = new Address();
		ad.setCity("Salempur");
		ad.setState("Uttar Pradesh");
		ad.setColony("Rahmat Nagar");
		return ad;
	}
	
	
	
	@Bean
	public String studyIn() {
		return "X11";
	}
	
	@Bean
	public Student student(String name, String studyIn, int age) {
		Student st1 = new Student();
		st1.setName(name);
		st1.setSudyIn(studyIn);
		st1.setAge(age);
		return st1;
	}
	
	@Bean
	public Student student2(String name, String studyIn, int age) {
		Student st1 = new Student();
		st1.setName(name);
		st1.setSudyIn(studyIn);
		st1.setAge(age);
		return st1;
	}
	
	
	@Bean
	@Primary
	public Student student3(String name, String studyIn, int age) {
		Student st = new Student();
		st.setName(name);
		st.setAge(age);
		st.setSudyIn(studyIn);
		return st;
		
	}
	
	@Bean
	public String color() {
		return "Black";
	}
	
	@Bean
	public LaptopConfig config1() {
		LaptopConfig lpc = new LaptopConfig();
		lpc.setGeneration("12th Generation");
		lpc.setVersion("5.0");
		lpc.setYearRelease("2022");
		return lpc;
	}
	
	@Bean
	@Qualifier("Abcd")
	public LaptopConfig config2() {
		LaptopConfig lpc = new LaptopConfig();
		lpc.setGeneration("10th Generation");
		lpc.setVersion("4.0");
		lpc.setYearRelease("2020");
		return lpc;
	}
	
	@Bean
	public Laptop laptop(String color, String name, @Qualifier("Abcd") LaptopConfig config ) {
		Laptop lp = new Laptop();
		lp.setColor(color);
		lp.setName(name);
		lp.setConfig(config);
		return lp;
	}
	
}
