package com.FindMax;

import java.util.*;

//Master branch - welcome message
public class FindMax {

	public static Scanner sc;

	public static Integer Maximum(Integer a, Integer b, Integer c) {
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
			return 0;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Find Maximum program!!");
		System.out.println("---------------------------------");
		sc = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		Integer a = Integer.parseInt(sc.nextLine());
		System.out.print("Enter second integer: ");
		Integer b = Integer.parseInt(sc.nextLine());
		System.out.print("Enter third integer: ");
		Integer c = Integer.parseInt(sc.nextLine());
		Integer max = Maximum(a, b, c);
		System.out.println("Maximum is :" + max);
	}
}
