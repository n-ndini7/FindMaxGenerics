package com.FindMax;

import java.util.*;

//UC4 - refactor all the previous 3 ucs to one generic method
public class FindMax {

	public static Scanner sc;

	public static <E extends Comparable<E>> E Maximum(E a, E b, E c) {
		E max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Find Maximum program!!");
		System.out.println("---------------------------------");
		System.out.println("1.Integer \n2.Float integer \n3.String");
		sc = new Scanner(System.in);
		String flag = "y";
		while (flag.equalsIgnoreCase("y")) {
			System.out.println("Enter your choice: ");
			int ch = Integer.parseInt(sc.nextLine());
			switch (ch) {
			case 1:
				System.out.print("Enter first integer: ");
				Integer a = Integer.parseInt(sc.nextLine());
				System.out.print("Enter second integer: ");
				Integer b = Integer.parseInt(sc.nextLine());
				System.out.print("Enter third integer: ");
				Integer c = Integer.parseInt(sc.nextLine());
				Integer max = Maximum(a, b, c);
				System.out.println("Maximum is :" + max);
				break;
			case 2:
				System.out.print("Enter first Float integer: ");
				Float x = Float.parseFloat(sc.nextLine());
				System.out.print("Enter second Float integer: ");
				Float y = Float.parseFloat(sc.nextLine());
				System.out.print("Enter third Float integer: ");
				Float z = Float.parseFloat(sc.nextLine());
				Float m = Maximum(x, y, z);
				System.out.println("Maximum is :" + m);
				break;
			case 3:
				System.out.print("Enter first String: ");
				String i = sc.nextLine();
				System.out.print("Enter second String: ");
				String j = sc.nextLine();
				System.out.print("Enter third String: ");
				String k = sc.nextLine();
				System.out.println("Maximum is :" + Maximum(i, j, k));
				break;
			}
			System.out.println("Do you wish to continue?(y/n)");
			flag = sc.nextLine();
		}
		System.out.println("Thanks for using application!");
	}
}
