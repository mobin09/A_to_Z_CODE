package Todos.todos.login;

import org.springframework.security.core.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
	public String goToWelcomePage(ModelMap model) {
		model.put("name", getLoggedInUser());
    	return "Welcome";
    }
	
	private String getLoggedInUser() {
	 Authentication authentication =  SecurityContextHolder.getContext().getAuthentication();
	 return authentication.getName();
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
