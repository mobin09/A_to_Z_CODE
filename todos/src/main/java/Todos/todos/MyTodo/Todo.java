package Todos.todos.MyTodo;

import java.time.LocalDate;

public class Todo {
    /* id
     * userName
     * description
     * targetDone
     * done
     */
	
	private int id;
	private String userName;
	private String description;
	private LocalDate targetDate;
	private boolean isDone;
	
	
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
	public LocalDate getTargetDone() {
		return targetDate;
	}
	public void setTargetDone(LocalDate targetDate) {
		this.targetDate = targetDate;
	}
	public boolean getIsDone() {
		return isDone;
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
