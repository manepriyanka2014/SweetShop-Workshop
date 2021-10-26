package com.bridglabz.sweetshop;

import java.util.ArrayList;
//import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.List;

public class SweetRepository {
	private Set<Sweet> sweetList = new HashSet();
	
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
