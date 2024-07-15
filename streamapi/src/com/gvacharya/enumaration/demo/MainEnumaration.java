package com.gvacharya.enumaration.demo;

public class MainEnumaration {

	enum UserAccess{
		ACTIVE(1, "Active User", "All Access"),
		INACTIVE(2, "Inactive User", "No Access at All"),
		SUSPENDED(3, "Suspended User", "Login Access for Particular Time"),
		BLOCK(4, "Blocked User", "No Acces at All");
		
		private int srNo;
		private String description;
		private String access;
		
		private UserAccess(int srNo, String description, String access) {
			this.srNo=srNo;
			this.description=description;
			this.access=access;
		}

		public int getSrNo() {
			return srNo;
		}

		public String getDescription() {
			return description;
		}

		public String getAccess() {
			return access;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(UserAccess.ACTIVE);
		
		System.out.println(UserAccess.INACTIVE.getSrNo());
		
		System.out.println(UserAccess.ACTIVE.getDescription());
		
		
		for(UserAccess userAccess:UserAccess.values()) {
			System.out.println(userAccess.getSrNo() 
					+ "." + 
					userAccess.name()
					+ " " + userAccess.getDescription()
					+ "(" + userAccess.getAccess()  + ")"
					);
			
		}
		
//		switch(UserAccess.ACTIVE.getSrNo()) {
//		
//		}
		
	}
}
