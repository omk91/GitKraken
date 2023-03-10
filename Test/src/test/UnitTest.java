package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import main.Rectangle;

class UnitTest {

	private static Rectangle rectangle;
	
	@Test
	public void testGetArea() {
		rectangle = new Rectangle(2,3);
		int expectedArea = 6;
		int actualArea = rectangle.getArea();
		assertEquals(expectedArea, actualArea);
	}
	
	@Test
	public void testGetAreaNegative() {
		rectangle = new Rectangle(-1,3);
		int expectedArea = 0;
		int actualArea = rectangle.getArea();
		assertEquals(expectedArea, actualArea);
	}

}
