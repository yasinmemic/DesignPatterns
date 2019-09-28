public class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

	public Rectangle() {
		type = "Rectangle";
	}
}
