package com.gvacharya.enumeration.demo;

public class MainEnumDemo {

	enum UserAccess{
		ACTIVE(1,"Active User","All Access"),
		INACTIVE(2,"Inactive User","No Access at All"),
		SUSPENDED(3,"Suspended User","Login Access for Particular");
		
		UserAccess(int srNo, String description, String Access) {
			this.setDescription(description);
			this.setAccess(Access);
			this.setSrNo(srNo);
		}
		public int getSrNo() {
			return srNo;
		}
		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getAccess() {
			return Access;
		}
		public void setAccess(String access) {
			Access = access;
		}
		private int srNo;
		private String description;
		private String Access;
		
		
	}
	public static void main(String[] args) {
		System.out.println(UserAccess.ACTIVE);
		System.out.println(UserAccess.ACTIVE.getAccess());
		for(UserAccess userAccess:UserAccess.values()) {
			System.out.println(userAccess.getSrNo()+"."+userAccess.name()
								+ " " + userAccess.description);
		}
		
		
		
	}
}
// Advantages of Enumeration
//Maintainability
//readability
//reusability


