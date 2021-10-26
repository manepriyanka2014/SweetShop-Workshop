package com.bridglabz.sweetshop;

import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Set;

//import java.util.List;
public class UserInterface {
	public int showUserMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 to add the Sweet\n" + "Enter 2 to remove the Sweet\n"
				+ "Enter 3 to Edit the Sweet\n" + "Enter 4 to print all the sweets\n" + "Enter 5 to print Diet Sweet\n"
				+ "Enter 6 to print Normal Sweets\n" + "Enter 7 to Exit from the menue");
	 return scanner.nextInt();
	}
	
	public void print(Set<Sweet> set) {
//		for(int i=0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
		for (Sweet sweet : set) {
			System.out.println(sweet);
		}
	}

	public void printIDietSweet(Set<Sweet> set) {
		for (Sweet sweet : set) {
			if (sweet instanceof IDiet) {
				System.out.println(sweet);
			}
		}
	}

	public void printINormalSweet(Set<Sweet> set) {
		for (Sweet sweet : set) {
			if (sweet instanceof INormal) {
				System.out.println(sweet);
			}
		}
	}
}
