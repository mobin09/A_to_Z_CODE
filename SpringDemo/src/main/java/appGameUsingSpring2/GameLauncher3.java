package appGameUsingSpring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameLauncher3 {
//	@Bean
//	 GameConsole game() {
//		return new MarioGame();
//	}
//	
//	@Bean
//	 GameRunner runner(GameConsole game) {
//		return new GameRunner(game);
//	}
	
       public static void main(String[] args) {
    	   try(AnnotationConfigApplicationContext context =  new AnnotationConfigApplicationContext(GameLauncher3.class)){
    		    GameRunner gameRunner =  context.getBean(GameRunner.class);
    		    gameRunner.run();
    	   }
    	   	
       }
}
