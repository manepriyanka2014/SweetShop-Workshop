package com.bridglabz.sweetshop;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class SweetRepository {
	//private List sweetList = new ArrayList();
	private Set<Sweet> sweetList = new HashSet();
	
//	public List getSweetList() {
//	return sweetList;
//	}
	
	public Set getSweetList() {
		return sweetList;
		}
	
		public void add(Sweet sweet) {
		sweetList.add(sweet);
		}
		
	public void remove(Sweet sweet) {
		sweetList.remove(sweet);
		
	
	}

}
