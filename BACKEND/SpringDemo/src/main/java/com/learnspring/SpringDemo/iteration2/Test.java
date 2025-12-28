package com.learnspring.SpringDemo.iteration2;

public class Test {
    public static void main(String[] args) {
    	Mario m = new Mario();
    	PacMan p = new PacMan();
    	GameRunner game = new GameRunner(p);
    	game.run();
    }
}
 