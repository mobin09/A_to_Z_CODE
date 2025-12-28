package appGameUsingSpring2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class MarioGame implements GameConsole{
    @Override  
	public void up() {
    	  System.out.println("UP");
      }
      
    @Override
      public void down() {
    	  System.out.println("DOWN");
      }
      
    @Override
      public void left() {
    	  System.out.println("LEFT");
      }
     @Override 
      public void right() {
    	  System.out.println("RIGHT");
      }
      
      
}
