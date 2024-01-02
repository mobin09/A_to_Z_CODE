package businessCalculation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MongoDBDataService implements DataService{
   public int[] retriveData() {
	   return new int[] {40,50,60};
   }
}
