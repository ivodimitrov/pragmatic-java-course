package com.pragmatic.homework;

public class CameraDemo {
	public static void main(String[] args) {
		Camera genericCamera = new Camera();
		genericCamera.setHasStabilization(false);
		genericCamera.setColor("blue");
		genericCamera.takePhoto();
		genericCamera.turnOn();
		System.out.println(genericCamera);
		
		System.out.println();
		
		Camera canon = new CanonCamera("black" , 30, false, 15);
		canon.takePhoto();
		canon.takePhoto();
		canon.turnOff();
		System.out.println(canon);
		
		System.out.println();
		
		Camera fuji = new FujiCamera("silver", 100, true, 20);
		fuji.takePhoto();
		fuji.takePhoto();
		fuji.turnOff();
		System.out.println(fuji);
		
		System.out.println();
		
		Camera nikon = new NikonCamera("black", 100, false, 5);
		nikon.turnOn();
		nikon.takePhoto();
		System.out.println(nikon);
		
		for (int i = 0; i < 5; i++) {
			nikon.takePhoto();
		}
		System.out.println(nikon);
	}
}
