package appGameUsingSpring2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacMan implements GameConsole {
	@Override  
	public void up() {
		  System.out.println("PACKMAN UP");
	  }
	  
	@Override
	  public void down() {
		  System.out.println("PACKMAN DOWN");
	  }
	 @Override 
	  public void left() {
		  System.out.println("PACKMAN LEFT");
	  }
	 @Override 
	  public void right() {
		  System.out.println("PACKMAN RIGHT");
	  }
	  
	  
}
