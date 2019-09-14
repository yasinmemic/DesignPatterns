package com.abstractfactory.properties;

import com.abstracfactory.interfaces.Cam;

public class SunroofCam implements Cam{

	@Override
	public void CamUret() {
		System.out.println("Sunroof cam üretildi! ");
	}
}
