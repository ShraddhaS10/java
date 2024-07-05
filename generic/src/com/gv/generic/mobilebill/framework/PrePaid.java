package com.gv.generic.mobilebill.framework;

public class PrePaid implements Payable, MobileBill<PrePaid> {

		private Integer noOfDays;

		public Integer getNoOfDays() {
			return noOfDays;
		}

		public void setNoOfDays(Integer noOfDays) {
			this.noOfDays = noOfDays;
		}
		
		@Override
		public Float generateBill(PrePaid noOfDays) {
			return noOfDays.getNoOfDays()*10.0F;
		}
	}

