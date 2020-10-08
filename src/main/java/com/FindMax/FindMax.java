package com.FindMax;

import java.util.*;

//UC2 - given 3 float find maximum
public class FindMax {

	public static Scanner sc;

	public static Float Maximum(Float a, Float b, Float c) {
		int x = a.compareTo(b);
		int y = b.compareTo(c);
		int z = c.compareTo(a);
		if (x == 1 && y == 1)
			return a;
		else if (x == -1 && y == 1)
			return b;
		else if (x == -1 && y == -1)
			return c;
		else if (x == -1 && z == -1)
			return c;
		else if (x == 1 && z == -1)
			return c;
		else if (x == 1 && y == -1 && z == 1)
			return c;
		else
			return 0.0f;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Find Maximum program!!");
		System.out.println("---------------------------------");
		sc = new Scanner(System.in);
		System.out.print("Enter first Float integer: ");
		Float a = Float.parseFloat(sc.nextLine());
		System.out.print("Enter second Float integer: ");
		Float b = Float.parseFloat(sc.nextLine());
		System.out.print("Enter third Float integer: ");
		Float c = Float.parseFloat(sc.nextLine());
		Float max = Maximum(a, b, c);
		System.out.println("Maximum is :" + max);
	}
}
