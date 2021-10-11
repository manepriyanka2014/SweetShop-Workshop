package com.bridglabz.sweetshop;
import java.util.ArrayList;
import java.util.List;

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
		
		SweetRepository sweetRepository = new SweetRepository();
		sweetRepository.add(modak);
		sweetRepository.add(shrikhand);
		sweetRepository.add(rasmalai);
		sweetRepository.add(laddu);
		sweetRepository.add(jalebi);
		
		List sweetList = sweetRepository.getSweetList();
		
		UserInterface ui = new UserInterface();
		ui.print(sweetRepository.getSweetList());
		  

	}

}
