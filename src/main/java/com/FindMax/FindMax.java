package com.FindMax;

import java.util.*;

//UC4 - Extend the max method to take more than 3 parameters
public class FindMax<E extends Comparable<E>> {
	public static Scanner sc;
	E max;

	public FindMax() {
	}

	public E maximum() {
		return this.max;
	}

	public E findMaximum(E... args) {
		Arrays.sort(args);
		this.max = args[args.length - 1];
		return max;
	}

	// uc4 - to take variable arguments and use arrays.sort method for find maximum
	public void printMax() {
		System.out.println("Maximum is : " + maximum());
	}

	// uc5 - to print maximum
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
				System.out.print("Enter fourth integer: ");
				Integer d = Integer.parseInt(sc.nextLine());
				FindMax<Integer> obj = new FindMax<Integer>();
				obj.findMaximum(a, b, c, d);
				obj.printMax();
				break;
			case 2:
				System.out.print("Enter first Float integer: ");
				Float x = Float.parseFloat(sc.nextLine());
				System.out.print("Enter second Float integer: ");
				Float y = Float.parseFloat(sc.nextLine());
				System.out.print("Enter third Float integer: ");
				Float z = Float.parseFloat(sc.nextLine());
				System.out.print("Enter fourth Float integer: ");
				Float w = Float.parseFloat(sc.nextLine());
				System.out.print("Enter fifth Float integer: ");
				Float v = Float.parseFloat(sc.nextLine());
				FindMax<Float> obj2 = new FindMax<Float>();
				obj2.findMaximum(x, y, z, w, v);
				obj2.printMax();
				break;
			case 3:
				System.out.print("Enter first String: ");
				String i = sc.nextLine();
				System.out.print("Enter second String: ");
				String j = sc.nextLine();
				System.out.print("Enter third String: ");
				String k = sc.nextLine();
				System.out.print("Enter fourth String: ");
				String l = sc.nextLine();
				System.out.print("Enter fifth String: ");
				String m = sc.nextLine();
				System.out.print("Enter sixth String: ");
				String n = sc.nextLine();
				FindMax<String> obj3 = new FindMax<String>();
				obj3.findMaximum(i, j, k, l, m, n);
				obj3.printMax();
				break;
			}
			System.out.println("Do you wish to continue?(y/n)");
			flag = sc.nextLine();
		}
		System.out.println("Thanks for using application!");
	}
}
