public class Main {

	public static void main(String[] args) {
		
		ShapeCache.loadCache();
				
		Shape circle = ShapeCache.getShape("1");
		System.out.println("Shape Type: "+ circle.getType());
		
		Shape rectangle = ShapeCache.getShape("3");
		System.out.println("Shape Type: "+rectangle.getType());
		
		Shape square = ShapeCache.getShape("2");
		System.out.println("Shape Type: "+square.getType());	
	}
}
