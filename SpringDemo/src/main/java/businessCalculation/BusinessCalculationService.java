package businessCalculation;

import java.util.Arrays;
import java.util.OptionalInt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class BusinessCalculationService {
	private DataService dataService;
	
	@Autowired
	public BusinessCalculationService(DataService dataService){
		this.dataService = dataService;
	}
	
	public int findMax() {
		return Arrays.stream(dataService.retriveData()).max().orElse(0);
	}
	
}
