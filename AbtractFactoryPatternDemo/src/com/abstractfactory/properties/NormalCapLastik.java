package com.abstractfactory.properties;
import com.abstracfactory.interfaces.*;
public class NormalCapLastik implements Lastik {
	@Override
	public void LastikUret() {
		System.out.println("Normal çaplý lastik üretildi! ");	
	}
}
