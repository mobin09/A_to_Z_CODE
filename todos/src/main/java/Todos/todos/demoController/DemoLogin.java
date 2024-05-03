package Todos.todos.demoController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoLogin {
    private Logger logger = LoggerFactory.getLogger(getClass());
	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String sayHi() {
		logger.debug("Web requeested at the /hi");
		return  "Hello";
	}
	
}
