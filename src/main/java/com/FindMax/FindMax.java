package com.FindMax;

import java.util.*;

//UC3 - - given 3 Strings find maximum
public class FindMax {

	public static Scanner sc;

	public static String Maximum(String a, String b, String c) {
		String max = a;
		if (b.compareTo(max) > 0)
			max = b;
		if (c.compareTo(max) > 0)
			max = c;
		return max;

	}

	public static void main(String[] args) {
		System.out.println("Welcome to Find Maximum program!!");
		System.out.println("---------------------------------");
		sc = new Scanner(System.in);
		System.out.print("Enter first String: ");
		String a = sc.nextLine();
		System.out.print("Enter second String: ");
		String b = sc.nextLine();
		System.out.print("Enter third String: ");
		String c = sc.nextLine();
		System.out.println("Maximum is :" + Maximum(a, b, c));
	}
}
