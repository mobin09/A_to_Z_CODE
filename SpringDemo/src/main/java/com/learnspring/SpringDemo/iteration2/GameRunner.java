package com.learnspring.SpringDemo.iteration2;

public class GameRunner {
    private GameConsole console;
    
    public GameRunner(GameConsole console) {
    	this.console= console;

    }
    
    public void run() {
    	console.down();
    	console.up();
    	console.left();
    	console.right();
    }
    
}
