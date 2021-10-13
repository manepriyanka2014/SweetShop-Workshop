package com.bridglabz.sweetshop;
//import java.util.ArrayList;
import java.util.Set;
//import java.util.List;
public class Application {

	public static void main(String args[]) {
		System.out.println("Welcome to Sweet Shop Management System");
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
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(modak);
		sweetRepository.add(modak);
		sweetRepository.add(rasmalai);
		sweetRepository.add(laddu);
		sweetRepository.add(jalebi);
		sweetRepository.add(jalebi1);
		sweetRepository.add(barfi);
		sweetRepository.add(modak);
		
		
		UserInterface userintrface = new UserInterface();
		//List sweetList = sweetRepository.getSweetList();
		Set sweetList = sweetRepository.getSweetList();
		userintrface.print(sweetList);

	        System.out.println("\nPrinting IDietSweet\n");
	        userintrface.printIDietSweet(sweetList);
	        System.out.println("\nPrinting INormalSweet\n");
	        userintrface.printINormalSweet(sweetList);
	   
		System.out.println(" After Delition Sweet List :");

		sweetRepository.remove(jalebi);
		sweetRepository.remove(modak);
		sweetRepository.remove(rasmalai);
		userintrface.print(sweetList);
		
	}            

}
