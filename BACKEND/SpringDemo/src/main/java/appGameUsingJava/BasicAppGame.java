package appGameUsingJava;

public class BasicAppGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MarioGame mario = new MarioGame();
          SuperContra supGame = new SuperContra();
          PacMan pacMan = new PacMan();
         GameRunner gameRunner =  new GameRunner(pacMan);
         gameRunner.run();
	}

}
