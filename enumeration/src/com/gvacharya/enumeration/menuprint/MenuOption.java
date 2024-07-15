package com.gvacharya.enumeration.menuprint;

public enum MenuOption {

	ADD(1,"Add Data"),
	UPDATE(2,"Update Recore"),
	SELECT(3,"Select Record"),
	SELECT_ALL(4,"Select All Record"),
	DELETE(5,"Delete the Record"),
	EXIT(0,"Exit the Program");
	
	MenuOption(int serialNo, String menuDescription) {
		this.setMenuDescription(menuDescription);
		this.setSerialNo(serialNo);
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public String getMenuDescription() {
		return menuDescription;
	}
	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
	private int serialNo;
	private String menuDescription;
	
	
	
}
