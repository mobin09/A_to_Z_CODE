package restful_web_service_v2.restfull_services.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class HelloWorldController {
	
	  
	
	@CrossOrigin(origins="http://localhost:3000")
	   @GetMapping(path = "/hello-world")
	   public String helloworld() {
		   return "Learning the full stack java application";
	   }
	
	  @CrossOrigin(origins="http://localhost:3000")
	   @GetMapping(path="/hello-world-bean")
	   public HelloWorldBean helloworldBean() {
		   return new HelloWorldBean("Mobin Arshad");
	   }
	   
	   @GetMapping(path="/hello-world/path-variable/{name}")
	   public HelloUser helloUser(@PathVariable String name) {
		   return new HelloUser(String.format("Hello, %s", name));
	   }
	
}
