package com.bridglabz.sweetshop;
import java.util.ArrayList;
import java.util.List;

public class SweetRepository {
	private List sweetList = new ArrayList();
	public List getSweetList() {
	return sweetList;
	}
	public void add(Modak modak) {
		sweetList.add(modak);
	}

	public void add(Jalebi jalebi) {
		sweetList.add(jalebi);

	}
	public void add(Shrikhand shrikhand) {
		sweetList.add(shrikhand);
	}
	
	public void add(Laddu laddu) {
		sweetList.add(laddu);
	}
	
	public void add(Rasmalai rasmalai) {
		sweetList.add(rasmalai);
	}

}
