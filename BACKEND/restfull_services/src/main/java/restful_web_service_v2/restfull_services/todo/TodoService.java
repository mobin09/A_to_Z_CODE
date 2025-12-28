package restful_web_service_v2.restfull_services.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
   
	private static List<Todo> todos = new ArrayList<>();
	private static Integer count = 0;
	static {
		todos.add(new Todo(++count, "dummy", "Learn Microservices in depth", LocalDate.now().plusYears(1),false ));
		todos.add(new Todo(++count, "dummy", "Learn Data Structure in depth in depth", LocalDate.now().plusYears(1),false ));
		todos.add(new Todo(++count, "dummy", "Learn System Design in depth", LocalDate.now().plusYears(1),false ));
		todos.add(new Todo(++count, "dummy", "Learn AWS in depth", LocalDate.now().plusYears(1),false ));
		todos.add(new Todo(++count, "dummy", "Learn React in depth", LocalDate.now().plusYears(1),false ));
	}
	
	
	public List<Todo> findByUserName(String username){
		return  todos.stream().filter(todo -> todo.getUsername().equals(username)).collect(Collectors.toList());
	}
	
	public Todo addTodo(String username, String description, LocalDate date,  boolean isDone) {
		Todo todo = new Todo(++count, username, description, date, isDone);
		todos.add(todo);
		return todo;
	}
	
	public void deleteById(Integer id) {
		todos.removeIf(todo -> todo.getId().equals(id));
		
	}
	
	public Todo findById(Integer id) {
		return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
	}
	
	public void updateTodo(Todo todo) {
		deleteById(todo.getId());
		todos.add(todo);
	}
	
	
}
