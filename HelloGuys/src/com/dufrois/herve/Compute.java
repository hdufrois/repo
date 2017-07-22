package com.dufrois.herve;

public class Compute {
	public static float square(float f){
		System.out.println("public method called!");
		return f*f;
	}
	private static int twice (int i) {
		System.out.println("private method called!");
		return 2*i;
	}
}
