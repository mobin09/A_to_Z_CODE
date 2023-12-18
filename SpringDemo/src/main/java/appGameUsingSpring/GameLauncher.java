package appGameUsingSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GameLauncher {
	public static void main(String[] args) {
		
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class)){
			 context.getBean(GameRunner.class).run();
		}
	}
}
