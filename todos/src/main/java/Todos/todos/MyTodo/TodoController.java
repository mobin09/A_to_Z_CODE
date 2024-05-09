package Todos.todos.MyTodo;

import java.time.LocalDate;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
	private TodoService todos;
	@RequestMapping(value = "/list-todos", method=RequestMethod.GET)
	public String allTodos(ModelMap model) {
		String username = (String)model.get("name");
		List<Todo> td = todos.findByName(username);
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
	public String addTodo (ModelMap model,@Valid Todo todo ,BindingResult result) {
		if(result.hasErrors()) {
			logger.debug("\n \nErorr in binding:::::::::::" + result);
			return "Todo";
		}
		
		logger.debug("Description of todo::" +  todo.getDescription());
		String username = (String)model.get("name");
		todos.addTodo(username, todo.getDescription(), todo.getTargetDate(), false);
		return "redirect:list-todos";
	}
	
	@RequestMapping(value = "delete-todo", method=RequestMethod.GET)
	public String deleteTodo(@RequestParam int id) {
		todos.deleteTodo(id);
		return "redirect:list-todos";
	}
	@RequestMapping(value ="update-todo", method=RequestMethod.GET)
	public String showUpdateTodo(@RequestParam int id, ModelMap model) {
		Todo updateTd = todos.findByID(id);
		model.put("todo", updateTd);
		return "Todo";
	}
	
	@RequestMapping(value = "update-todo", method=RequestMethod.POST)
	public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
		if(result.hasErrors()) {
			return "Todo";
		}
		todos.updateTodo(todo);
		return "redirect:list-todos";
	}
}
