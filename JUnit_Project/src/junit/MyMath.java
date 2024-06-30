package junit;

import java.util.Arrays;

public class MyMath {
        
	public long getValue(int[] arr) {	
		return Arrays.stream(arr).reduce(0, (a, b) -> a +b);
	}
}
