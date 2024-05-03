package Todos.todos.MyTodo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	private static List<Todo> todos = new ArrayList<>();

	{
		todos.add(new Todo(1, "mobink09", "Learn AWS", LocalDate.now().plusYears(1), false));
		todos.add(new Todo(2, "mobink09", "Learn React", LocalDate.now().plusMonths(6), false));
		todos.add(new Todo(1, "mobink09", "Learn DevOps", LocalDate.now().plusYears(2), false));
	}

	public List<Todo> findByName(String name) {
		return todos;
	}

}
