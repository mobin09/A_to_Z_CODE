package learn.spring.week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YourBusinessClass {
	//FIELD injection start
//	@Autowired
//      private Dependency1 dependency1;
//	@Autowired
//      private Dependency2 dependency2;
    //FIELD INJECTION end
	private Dependency1 dependency1;
	private Dependency2 dependency2;
	
	// constructor injection
	@Autowired // in constructor injection Autowired is not mandatory
	public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	
	
	
	//SETTER INJECTION start
	
//     @Autowired 
//     public void setDependency1(Dependency1 dependency1) {
//		this.dependency1 = dependency1;
//	}
//
//   @Autowired
//	public void setDependency2(Dependency2 dependency2) {
//		this.dependency2 = dependency2;
//	}

// SETTER INJECTION end

	public StringBuffer printDepency() {
    	  
    	  return new StringBuffer().append("Using ").append(dependency1).append(" and ").append(dependency2);
      }
      
}
