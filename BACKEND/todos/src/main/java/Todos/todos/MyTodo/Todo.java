package Todos.todos.MyTodo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;

@Entity
public class Todo {
    /* id
     * userName
     * description
     * targetDone
     * done
     */
	@Id
	@GeneratedValue
	private int id;
	private String userName;
	
	@Size(min=10, message="Please enter at least 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean isDone;
	
	public Todo() {
		
	}
	
	public Todo(int id, String userName, String description, LocalDate targetDate, boolean isDone) {
		super();
		this.id = id;
		this.userName = userName;
		this.description = description;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean getIsDone() {
		return isDone;
	}
	public LocalDate getTargetDate() {
		return targetDate;
	}


	public void setTargetDate(LocalDate targetDate) {
		this.targetDate = targetDate;
	}


	public void setIsDone(boolean isDone) {
		this.isDone = isDone;
	}


	@Override
	public String toString() {
		return "Todo [id=" + id + ", userName=" + userName + ", description=" + description + ", targetDate="
				+ targetDate + ", isDone=" + isDone + "]";
	}
	
	
		
}
