package com.learnspring.SpringDemo.iteration2;

public class PacMan implements GameConsole{
	@Override
     public void up() {
    	 System.out.println("Packman up it2");
     }
	@Override
     public void down() {
    	 System.out.println("Packman down it2");
     }
	@Override
     public void left() {
    	 System.out.println("Packman left it2");
     }
	@Override
     public void right() {
    	 System.out.println("Packman right it2");
     }
}
