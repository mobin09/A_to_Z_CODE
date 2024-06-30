package junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class AssertEqualsTest {

	private List<String> list = Arrays.asList("JUnit", "Mockito", "DevOps", "AWS", "Redish", "Kafka");
	private String name = null;
	
	@Test
	void testAssert() {
		boolean isContainJunit = list.contains("JUnit");
		boolean isContainDocker = list.contains("Docker");
		assertEquals(true, isContainJunit);
		assertEquals(6, list.size());
		assertTrue(isContainJunit);
		
		assertFalse(isContainDocker);
		assertNull(name);
		
		assertNotNull(list);
		
		assertEquals(6, list.size(), "If this fails then this errormessage will appear");
		
		assertArrayEquals(new int[] {1,2}, new int[] {1,2});
		
	}

}
