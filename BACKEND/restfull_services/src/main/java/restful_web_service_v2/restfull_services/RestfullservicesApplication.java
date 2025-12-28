package restful_web_service_v2.restfull_services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RestfullservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfullservicesApplication.class, args);
	}
	
	// http://localhost:3000/ to 8080 API
	// CORS
	// Allows all request only from http://localhost:3000/
	
//	@Bean
//	public WebMvcConfigurer corsConfigurer() {
//		 return new WebMvcConfigurer() {
//			 public void addCorsMappings(CorsRegistry registry) {
//				 registry.addMapping("/**") // everything maps
//				 .allowedMethods("*") // allowed all methods get, post , .....
//				 .allowedOrigins("http://localhost:3000");
//				 
//			 }
//		 };
//	}

}
