package com.gv.generic.classes;

import java.util.List;

public class ObjectBox<Z> {

	private List<Z> zList;
	
	public void setlist(List<Z> zList) {
		this.zList = zList;
	}
	
	public List<Z> getList() {
		return zList;
	}
	
	public boolean addElement(Z z) {
		return zList.add(z);
		
	}
}
