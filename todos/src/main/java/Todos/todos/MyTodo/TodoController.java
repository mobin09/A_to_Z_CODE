package Todos.todos.MyTodo;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
	private TodoService todos;
	@RequestMapping(value = "/list-todos", method=RequestMethod.GET)
	public String allTodos(ModelMap model) {
		
		List<Todo> td = todos.findByName("mobink09");
		model.addAttribute("todos", td);
		
		return "ListTodos";
	}
	
	@RequestMapping(value = "add-todo", method = RequestMethod.GET)
	public String showNewTodo(ModelMap model) {
		String username = (String)model.get("name");
	   Todo todo = new Todo(0, username, "",LocalDate.now().plusYears(1), false);	
	   model.put("todo", todo);
	   return "Todo";
	}
	@RequestMapping(value = "add-todo", method = RequestMethod.POST)
	public String addTodo (ModelMap model, Todo todo) {
		logger.debug("Description of todo::" +  todo.getDescription());
		String username = (String)model.get("name");
		todos.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
		return "redirect:list-todos";
	}
	
	
	
}
