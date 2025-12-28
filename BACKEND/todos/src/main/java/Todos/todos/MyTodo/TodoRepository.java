package Todos.todos.MyTodo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


public interface TodoRepository extends JpaRepository<Todo, Integer>{
    public List<Todo> findByuserName(String userName);
}
