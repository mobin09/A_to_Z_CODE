package appGameUsingJava;

public class GameRunner {
	private Games game;
	GameRunner(Games game){
		this.game = game;
	}
	
     public void run() {
    	 System.out.println("Game is running" + game);
    	 game.up();
    	 game.down();
    	 game.left();
    	 game.right();
     }
}
