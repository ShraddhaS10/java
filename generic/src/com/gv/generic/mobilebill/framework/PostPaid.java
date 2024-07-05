package com.gv.generic.mobilebill.framework;

public class PostPaid implements MobileBill<PostPaid>, Payable {

		private Integer noOfDays;

		public Integer getNoOfDays() {
			return noOfDays;
		}

		public void setNoOfDays(Integer noOfDays) {
			this.noOfDays = noOfDays;
		}
		
		@Override
		public Float generateBill(PostPaid noOfDays) {
			return noOfDays.getNoOfDays()*20.5F;
		}
	}

