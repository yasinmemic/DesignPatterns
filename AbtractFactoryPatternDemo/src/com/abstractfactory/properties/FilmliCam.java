package com.abstractfactory.properties;

import com.abstracfactory.interfaces.Cam;

public class FilmliCam implements Cam{
	@Override
	public void CamUret() {
		System.out.println("Filmli cam üretildi! ");

	}
}
