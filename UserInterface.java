package com.bridglabz.sweetshop;

//import java.util.ArrayList;
import java.util.Set;

//import java.util.List;
public class UserInterface {
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
