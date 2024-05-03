package Todos.todos.MyTodo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
    @Autowired
	private TodoService todos;
	@RequestMapping(value = "/list-todos", method=RequestMethod.GET)
	public String allTodos(ModelMap model) {
		
		List<Todo> td = todos.findByName("mobink09");
		model.addAttribute("todos", td);
		
		return "ListTodos";
	}
	
}
