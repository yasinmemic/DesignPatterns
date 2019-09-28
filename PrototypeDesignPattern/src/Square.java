public class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}
	
	public Square() {
		type = "Square";
	}
}
