package com.crud;

import java.util.Scanner;

public class MobileStore {

	static int mcount = 0;

	static Scanner sc = new Scanner(System.in);

	private static String mbrand;

	public static void addMobile(Mobile m) {

		System.out.println("Enter mobile id");
		m.setId(sc.nextInt());

		System.out.println("Enter mobile name");
		m.setName(sc.next());

		System.out.println("Enter mobile brand");
		m.setBrand(sc.next());

		System.out.println("Enter mobile price");
		m.setPrice(sc.nextFloat());

	}

	public static void deleteMobile(Mobile m[], int rid) {
		boolean flag = false;

		for (int i = 0; i < mcount; i++) {
			if (m[i].getId() == rid) {
				flag = true;
				System.out.println(m[i].getName());

				for (int j = 0; j < mcount - 1; j++) {
					m[j] = m[j + 1];
				}
				m[mcount - 1] = null;
				mcount = mcount - 1;
				System.out.println("Mobile deleted");
				break;

			}
		}
		if (!flag) {
			System.out.println("Mobile not found");
		}
	}

	public static void updateMobilePrice(Mobile m[], int rid) {
		boolean flag = false;

		for (int i = 0; i < mcount; i++) {
			if (m[i].getId() == rid) {
				System.out.println("Enter Updated price");
				m[i].setPrice(sc.nextFloat());
				System.out.println(m[i]);
				System.out.println("updated mobile sucessfully");
				break;
			}
		}

	}

	public static void veiwByBrand(Mobile m[], String mbrand) {
		boolean flag = false;

		for (int i = 0; i < mcount; i++) {
			if (m[i].getBrand().equals(mbrand)) {
				flag = true;
				System.out.println("Mobile details are");
				System.out.println(m[i]);

			}
		}

	}

	public static void veiwAllMobile(Mobile m[]) {
		System.out.println("--------------------------------------");

		System.out.println("------mobile list--------");

		for (int i = 0; i < mcount; i++) {
			System.out.println(m[i]);
		}
	}

	public static void main(String[] args) {

		Mobile m1[] = new Mobile[3];

		int choice;
		String ch;
		do {
			System.out.println("--------mobile store--------");
			System.out.println("1.Add a mobile");
			System.out.println("2.Delete a mobile");
			System.out.println("3.Update a mobile");
			System.out.println("4.View mobile by brands");
			System.out.println("5.View All mobiles");
			System.out.println("0.Exit");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				if (mcount < 3) {
					m1[mcount] = new Mobile();
					addMobile(m1[mcount]);
					mcount++;
				} else {
					System.out.println("No more mobile");
				}
				break;

			case 2:
				System.out.println("Enter mobile to be deleted");
				int rid = sc.nextInt();
				deleteMobile(m1, rid);
				break;

			case 3:
				System.out.println("Enter the mobile id to be updated");
				rid = sc.nextInt();
				updateMobilePrice(m1, rid);
				break;

			case 4:
				System.out.println("view mobile by brand");
				String mbrand = sc.next();
				veiwByBrand(m1, mbrand);
				break;

			case 5:
				veiwAllMobile(m1);
				break;

			default:
				System.out.println("Please input valid case");
			}

			System.out.println("Do you want to perform more operation(yes/no)");
			ch = sc.next();
		} while (ch.equalsIgnoreCase("yes"));
		while (ch.equalsIgnoreCase("No")) {
			System.out.println("Thank you");
			break;
		}
	}
}
