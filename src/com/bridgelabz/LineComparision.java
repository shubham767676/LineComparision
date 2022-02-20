package com.bridgelabz;

import java.util.Scanner;

public class LineComparision {
	public static double coOrdinates() {
		Scanner sc = new Scanner(System.in);

		double x1, x2, y1, y2;

		System.out.println("Enter Co-ordinates of First Point");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();

		System.out.println("Enter Co-ordinates of Second Point");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();

		double lengthOfLine = (double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation ");
		double lengthOfLine = coOrdinates();
		System.out.println("Length Of Line is: " + lengthOfLine);

	}
}
