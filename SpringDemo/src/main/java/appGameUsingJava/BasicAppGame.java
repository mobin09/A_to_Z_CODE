package appGameUsingJava;

public class BasicAppGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          MarioGame mario = new MarioGame();
          SuperContra supGame = new SuperContra();
         GameRunner gameRunner =  new GameRunner(supGame);
         gameRunner.run();
	}

}
