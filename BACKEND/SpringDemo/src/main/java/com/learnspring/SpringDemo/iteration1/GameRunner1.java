package com.learnspring.SpringDemo.iteration1;

public class GameRunner1 {
    private PackMan pac;
    public GameRunner1(PackMan pac) {
    	this.pac = pac;
    }
    
    public void run() {
    	pac.up();
    	pac.right();
    	pac.left();
    	pac.down();
    }
    
}
