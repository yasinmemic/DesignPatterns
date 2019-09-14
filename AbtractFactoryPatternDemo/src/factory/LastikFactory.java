package factory;

import com.abstracfactory.interfaces.Cam;
import com.abstracfactory.interfaces.Lastik;
import com.abstractfactory.properties.DarCapLastik;
import com.abstractfactory.properties.GenisCapLastik;
import com.abstractfactory.properties.NormalCapLastik;

public class LastikFactory extends AbstractFactory{
@Override
public Cam getCam(String cam) {

	return null;
}
@Override
	public Lastik getLastik(String lastik) {
		if(lastik.equalsIgnoreCase("geniscaplastik")) {
			return new GenisCapLastik();
		}
		else if (lastik.equalsIgnoreCase("darcaplastik")) {
			return new DarCapLastik();
		}
		else if (lastik.equalsIgnoreCase("normalcaplastik")) {
			return new NormalCapLastik();
		}
		
		return null;
	}
}
