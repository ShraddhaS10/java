package com.gvacharya.enumaration.menuprint;

public enum MenuOption {

	ADD(1, "Add Record"), 
	UPDATE(2, "Update Record"), 
	SELECT(3, "Select Record"), 
	SELECT_ALL(4, "Select All Record"),
	DELETE(5, "Delete Record"), 
	SORT(6, "Sort Records"), 
	EXIT(0, "Exit The Program");

	private int serialNo;
	private String menuDescription;

	private MenuOption(int serialNo, String menuDescription) {
		this.serialNo = serialNo;
		this.menuDescription = menuDescription;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

}
