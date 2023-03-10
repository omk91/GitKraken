package main;

public class Rectangle {

	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		if (width < 0 || height < 0) {
			return 0;
		}
		return width * height;
	}
}
