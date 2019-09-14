package client;

import com.abstracfactory.interfaces.Cam;
import com.abstracfactory.interfaces.Lastik;

import factory.AbstractFactory;
import producer.FactoryProducer;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
	
		AbstractFactory cam = FactoryProducer.getFactory("cam");
		Cam fcam = cam.getCam("sunroofcam");
		fcam.CamUret();
		
		
		AbstractFactory lastik = FactoryProducer.getFactory("lastik");
		Lastik normal = lastik.getLastik("normalcaplastik");
		normal.LastikUret();
	}
}
