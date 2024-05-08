package Todos.todos.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
//    @Autowired
//	private LoginAuthService loginService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String loginbyGet(ModelMap model) {
		model.put("name", "Mobin Arshad");
    	return "Welcome";
    }
	
//	@RequestMapping(value = "/login", method=RequestMethod.POST)
//	public String loginbyPost(@RequestParam String name,  @RequestParam String password, ModelMap model) {
//		
//		if(loginService.isValidUser(name, password)) {
//			model.put("name", name);
//			return "Welcome";
//		}
//		model.put("message", "Please Enter the right credentials");
//		return "Login";
//		
//		
//	}
	
}
