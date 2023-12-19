package appGameUsingSpring2;

import org.springframework.stereotype.Component;

@Component
public class GameRunner {
     private GameConsole game;
     
     public GameRunner(GameConsole game) {
    	 this.game = game;
     }
     
     public void run() {
    	 game.up();
    	 game.down();
    	 game.left();
    	 game.right();
     }
     
}
