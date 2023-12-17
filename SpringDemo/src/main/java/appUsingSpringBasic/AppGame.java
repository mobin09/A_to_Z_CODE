package appUsingSpringBasic;

import appGameUsingJava.PacMan;
import appGameUsingJava.GameRunner;

public class AppGame {

	public static void main(String[] args) {
		PacMan game = new PacMan();
		GameRunner gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
