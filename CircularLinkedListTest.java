package cs146F19.Bedi.project1;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class CircularLinkedListTest {

	@Test
	public void test() {
		
		LinkedList prisoners = new LinkedList();
		
		assertTrue(prisoners.isEmpty()); 
		
		assertEquals(0, prisoners.size());
		
		prisoners.add(5);
		
		assertFalse(prisoners.isEmpty());
		
		assertEquals(1,prisoners.size());
		
		
	}

}
