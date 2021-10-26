package com.bridglabz.sweetshop;

import java.util.Scanner;
//import java.util.ArrayList;
import java.util.Set;

//import java.util.List;
public class Application {
	SweetRepository sweetRepository = new SweetRepository();
	UserInterface userInterface = new UserInterface();

	public void addSweet() {
		Modak modak = new Modak();
		modak.id = "M001";
		modak.price = 20;
		Shrikhand shrikhand = new Shrikhand();
		shrikhand.id = "S001";
		shrikhand.price = 30;
		Rasmalai rasmalai = new Rasmalai();
		rasmalai.id = "R001";
		rasmalai.price = 100;
		Laddu laddu = new Laddu();
		laddu.id = "J001";
		laddu.price = 10;
		Jalebi jalebi = new Jalebi();
		jalebi.id = "J001";
		jalebi.price = 10;
		Jalebi jalebi1 = new Jalebi();
		jalebi1.id = "J1001";
		jalebi1.price = 110;
		DatesBarfi barfi = new DatesBarfi();
		barfi.id = "1001";
		barfi.price = 110;

//		sweetRepository = new SweetRepository();
		sweetRepository.add(modak);
		sweetRepository.add(modak);
		sweetRepository.add(rasmalai);
		sweetRepository.add(laddu);
		sweetRepository.add(jalebi);
		sweetRepository.add(jalebi1);
		sweetRepository.add(barfi);
		sweetRepository.add(modak);

//		UserInterface userintrface = new UserInterface(); // List sweetList =
//		sweetRepository.getSweetList();
//		Set sweetList = sweetRepository.getSweetList();
//		userintrface.print(sweetList);
//
//		System.out.println("\nPrinting IDietSweet\n");
//		userintrface.printIDietSweet(sweetList);
//		System.out.println("\nPrinting INormalSweet\n");
//		userintrface.printINormalSweet(sweetList);
//
//		System.out.println(" After Delition Sweet List :");
//
//		sweetRepository.remove(jalebi);
//		sweetRepository.remove(modak);
//		sweetRepository.remove(rasmalai);
//		userintrface.print(sweetList);

	}

	public static void main(String args[]) {
		int option = 0;
		System.out.println("Welcome to Sweet Shop Management System");
		// UserInterface userInterface = new UserInterface();
		Application application = new Application();
		while (option != 7) {
			option = application.userInterface.showUserMenu();
			application.handleUserSelection(option);
		}
		System.out.println("Good Bye");
	}

	public void handleUserSelection(int option) {
		// UserInterface userInterface = new UserInterface();
		switch (option) {
		case 1:
			addSweet();
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			Set sweetList = sweetRepository.getSweetList();
			userInterface.print(sweetList);
			break;
		case 5:
			System.out.println("Diet Sweet");
			Set dietSweetList = sweetRepository.getSweetList();
			userInterface.printIDietSweet(dietSweetList);
			break;
		case 6:
			System.out.println("Normal Sweet");
			Set normalSweetList = sweetRepository.getSweetList();
			userInterface.printIDietSweet(normalSweetList);
			break;
		case 7:
			break;
		default:
			break;
		}
	}

	/*
	 * Modak modak = new Modak(); modak.id = "M001"; modak.price = 20; Shrikhand
	 * shrikhand = new Shrikhand(); shrikhand.id = "S001"; shrikhand.price = 30;
	 * Rasmalai rasmalai = new Rasmalai(); rasmalai.id = "R001"; rasmalai.price =
	 * 100; Laddu laddu = new Laddu(); laddu.id = "J001"; laddu.price = 10; Jalebi
	 * jalebi = new Jalebi(); jalebi.id = "J001"; jalebi.price = 10; Jalebi jalebi1
	 * = new Jalebi(); jalebi1.id = "J1001"; jalebi1.price = 110; DatesBarfi barfi =
	 * new DatesBarfi(); barfi.id = "1001"; barfi.price = 110;
	 * 
	 * SweetRepository sweetRepository = new SweetRepository();
	 * sweetRepository.add(modak); sweetRepository.add(modak);
	 * sweetRepository.add(rasmalai); sweetRepository.add(laddu);
	 * sweetRepository.add(jalebi); sweetRepository.add(jalebi1);
	 * sweetRepository.add(barfi); sweetRepository.add(modak);
	 * 
	 * 
	 * UserInterface userintrface = new UserInterface(); //List sweetList =
	 * sweetRepository.getSweetList(); Set sweetList =
	 * sweetRepository.getSweetList(); userintrface.print(sweetList);
	 * 
	 * System.out.println("\nPrinting IDietSweet\n");
	 * userintrface.printIDietSweet(sweetList);
	 * System.out.println("\nPrinting INormalSweet\n");
	 * userintrface.printINormalSweet(sweetList);
	 * 
	 * System.out.println(" After Delition Sweet List :");
	 * 
	 * sweetRepository.remove(jalebi); sweetRepository.remove(modak);
	 * sweetRepository.remove(rasmalai); userintrface.print(sweetList);
	 * 
	 * }
	 */

}
