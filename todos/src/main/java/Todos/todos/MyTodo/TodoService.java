package Todos.todos.MyTodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private Logger logger = LoggerFactory.getLogger(getClass());
	private static List<Todo> todos = new ArrayList<>();
	
	private static int todoCount = 0;

	{
		todos.add(new Todo(++todoCount, "mobink09", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(++todoCount, "mobink09", "Learn React", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(++todoCount, "mobink09", "Learn DevOps", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> findByName(String name) {
		logger.debug("MyTodos are " + todos);
		return todos;
	}

	public void addTodo(String username, String description, LocalDate dt, boolean isDone) {
		todos.add(new Todo(++todoCount, username, description, dt, isDone));
	}
	
	
}
