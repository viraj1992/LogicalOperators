package com.viraj.LogicalOperators;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean amiHealthy;
		int power = 70;
		amiHealthy = (power > 70);

		if(amiHealthy) {
			System.out.println("I am healthy");
		} else if(!amiHealthy) {
			System.out.println("I am not healthy!");
		}
	}
}
