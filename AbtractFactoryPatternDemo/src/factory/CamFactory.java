package factory;

import com.abstracfactory.interfaces.Cam;
import com.abstracfactory.interfaces.Lastik;
import com.abstractfactory.properties.FilmliCam;
import com.abstractfactory.properties.KursunGecirmezCam;
import com.abstractfactory.properties.SunroofCam;

public class CamFactory extends AbstractFactory{
	@Override
	public Cam getCam(String cam) {

		if(cam.equalsIgnoreCase("kursungecirmezcam")) {
			return new KursunGecirmezCam();
		}
		else if(cam.equalsIgnoreCase("filmlicam")) {
			return new FilmliCam();
		}
		else if(cam.equalsIgnoreCase("sunroofcam")) {
			return new SunroofCam();
		}
		else
			return null;

	}@Override
	public Lastik getLastik(String lastik) {
		// TODO Auto-generated method stub
		return null;
	}
}
