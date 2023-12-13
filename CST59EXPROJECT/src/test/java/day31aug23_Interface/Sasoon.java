package day31aug23_Interface;

import day31aug23AbstractClassInterface.Hospital;

public class Sasoon implements Hospital{

	@Override
	public void disp() {
		System.out.println("disp() method in Sasson hospital called"); 
	}

	@Override
	public void print() {
		System.out.println("print() method in Sasson hospital called"); 
	}

	public static void main(String[] args) {
		Sasoon sasoon = new Sasoon();
		sasoon.disp();
		sasoon.print();
		sasoon.show();
		Hospital.getDetails();
		
		
		
		
	}
}
