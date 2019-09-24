
public class Main {
	
	public static void main(String[] args) {
		//Singleton singleton = new Singleton(); This pattern can't work. 
		//Because constructor is private. 
		
		Singleton.instanceCreator(); // Object was created
		Singleton.instanceCreator(); // Object not created. The existing object will be used.
	}
	
}
