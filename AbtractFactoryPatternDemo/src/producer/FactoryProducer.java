package producer;

import factory.AbstractFactory;
import factory.CamFactory;
import factory.LastikFactory;

public class FactoryProducer {
	
	public static AbstractFactory getFactory(String factory) {
		
		if(factory.equalsIgnoreCase("cam")) {
			return new CamFactory();
		}
		else if (factory.equalsIgnoreCase("lastik")) {
			return new LastikFactory();
		}
		else
		return null;
	}

}
