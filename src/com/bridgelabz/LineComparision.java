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

		double lenghOfLine = (double) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lenghOfLine;
	}

	public static void checkEquality(double lineOneLength, double lineTwoLength) {
		if (lineOneLength == lineTwoLength) {
			System.out.println("Lines are Equal");
		} else if (lineOneLength > lineTwoLength) {
			System.out.println("Line 1 is greater than Line 2");
		} else {
			System.out.println("Line 1 is less than Line 2");
		}

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation");

		double lineOneLength = coOrdinates();
		System.out.println("Length Of Line 1 is: " + lineOneLength);

		double lineTwoLength = coOrdinates();
		System.out.println("Length Of Line 2 is: " + lineTwoLength);

		checkEquality(lineOneLength, lineTwoLength);

	}

}
