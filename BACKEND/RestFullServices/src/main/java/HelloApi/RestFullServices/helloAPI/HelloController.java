package HelloApi.RestFullServices.helloAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
	   @GetMapping("/hello")
	   public User hello() {
		   return new User("Mobin Arshad", "Rahmat Nagar Post Nwalapur", "26");
	   }
	
}
