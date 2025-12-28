package com.learnspring.SpringDemo.iteration2;

public class Mario implements GameConsole{

	@Override
	public void up() {
		System.out.println("Mario is up");
		
	}

	@Override
	public void down() {
		System.out.println("Mario is down");
		
	}

	@Override
	public void left() {
		System.out.println("Mario is left");
		
	}

	@Override
	public void right() {
		System.out.println("Mario is right");
		
	}

}
