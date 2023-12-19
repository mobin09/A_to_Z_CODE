package appGameUsingSpring2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("appGameUsingSpring2")
public class GameLauncher4 {
	
	
//	 @Bean
//	  public GameRunner runner(GameConsole game) {
//		 return new GameRunner(game);
//	 }
      public static void main(String[] args) {
    	 
    	  try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameLauncher4.class)){
    		  GameRunner gameRunner =  context.getBean(GameRunner.class);
    		  gameRunner.run();
    		  
    	  }
    	  
    	 
      }
}
