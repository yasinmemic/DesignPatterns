package com.abstractfactory.properties;
import com.abstracfactory.interfaces.*;
public class DarCapLastik implements Lastik{
	@Override
	public void LastikUret() {
		System.out.println("Dar çaplý lastik üretildi!");
	}
}
