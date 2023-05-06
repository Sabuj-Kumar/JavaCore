package com.demo.birdInterface;

public class Pelican implements FlyingBird,SwimmingBird{

	@Override
	public void swimmingSpeed() {
		 
		System.out.println("SwimmingSpeed is 10 km/hr. ");
		System.out.println("The Bird has "+numberOfLeg + " Legs");
	}

	@Override
	public void flyingBirdSpeed() {
		
		System.out.println("FlyingSpeed is 10 km/hr. ");
		System.out.println("The Bird has "+numberOfWings + " Wings");
		
	}

}
