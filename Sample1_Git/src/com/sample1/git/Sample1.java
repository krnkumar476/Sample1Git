package com.sample1.git;

public class Sample1 {

	private static void displayGreeting() {
		System.out.println("Hello welcome to Git");
		System.out.println("Thank you");
		
		System.out.println("Thank you so much for teaching me this Git");
	}

	public static void main(String[] args) {

		SalesData data = new SalesData();
		displayGreeting();
		data.display();

	}

}
