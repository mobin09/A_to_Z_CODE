package businessCalculation;

import org.springframework.stereotype.Component;

@Component
public class MySqlDataService implements DataService{
    public int[] retriveData() {
    	return new int[] {10, 20,30, 50};
    }
}
