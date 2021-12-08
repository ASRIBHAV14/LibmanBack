package com.dto;


	import java.util.Date;

	public class BooksReturnedDto {
		private int id;
		private Date returnedDate;
		private int delayedDays;
//		private double penalty;
//		private String penaltyStatus;
		private int userid ;
		private Long bookid;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public Date getReturnedDate() {
			return returnedDate;
		}
		public void setReturnedDate(Date returnedDate) {
			this.returnedDate = returnedDate;
		}
		public int getDelayedDays() {
			return delayedDays;
		}
		public void setDelayedDays(int delayedDays) {
			this.delayedDays = delayedDays;
		}
//		public double getPenalty() {
//			return penalty;
//		}
//		public void setPenalty(double penalty) {
//			this.penalty = penalty;
//		}
//		
//		public String getPenaltyStatus() {
//			return penaltyStatus;
//		}
//		public void setPenaltyStatus(String penaltyStatus) {
//			this.penaltyStatus = penaltyStatus;
//		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public Long getBookid() {
			return bookid;
		}
		public void setBookid(Long bookid) {
			this.bookid = bookid;
		}

	}
