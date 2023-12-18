package appGameUsingSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
  
	@Bean
	public GameConsole game() {
		return new PacManGame();
	}
	
	@Bean
	public GameRunner runner(GameConsole game) {
		return  new GameRunner(game);
	}
	
}
