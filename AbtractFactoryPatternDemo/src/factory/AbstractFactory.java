package factory;

import com.abstracfactory.interfaces.Cam;
import com.abstracfactory.interfaces.Lastik;

public abstract class AbstractFactory {

	public abstract Cam getCam(String cam);
	public abstract Lastik getLastik(String lastik);
}
