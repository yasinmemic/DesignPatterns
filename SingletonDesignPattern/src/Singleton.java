
public class Singleton {
	
	private static Singleton instance = null;
	private Singleton() {
		System.out.println("Singleton init()");
	}
	
	
	public static Singleton instanceCreator() {
		
		 Object lock = new Object();
		
		if(instance == null) {
			//double checked locking
			synchronized (lock) {
				if(instance == null) {
					instance = new Singleton();
					System.out.println("Object was created!");
				}
			}
			
		}
		else
			System.out.println("Object wasn't created!");
		return instance;
	}
	

}
