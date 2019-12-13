package org.login;

public class Desktop implements Hardware {
	@Override
	public void hardwareResources() {
		System.out.println("Hardware Resources are..");
	}
	
	public void softwareResources() {
		System.out.println("Software Resources are..");
	}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.hardwareResources();
	d.softwareResources();
}
}
