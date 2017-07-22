package com.dufrois.herve;

import java.lang.reflect.Method;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Calling a public method:");
		float f = 5.4F;
		System.out.println("The square of " + f + " is: " + Compute.square(f));
		System.out.println("\nCalling a private method:");
		Compute computer = new Compute();
		Class<? extends Compute> clazz = computer.getClass();
		for (Method method : clazz.getDeclaredMethods()) {
			    if ("twice".equals(method.getName())) {
			    	method.setAccessible(true);
			    	try {
			    		int i = 2;
	 			    	Integer result = (Integer)method.invoke(computer, i);
			    		System.out.println("2 times " + i + " is " + result);
			    	} catch (Exception ex) {
			    		System.out.println("Exception " + ex);
			    	}
			    }
			}
	}

}
