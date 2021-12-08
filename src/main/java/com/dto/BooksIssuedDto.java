package com.dto;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class BooksIssuedDto {
		private int issueId;
	   		 
		 @Column(name = "issueDate", nullable = false)
		 @NotNull(message = " issueDate Should Not Be Null")
		 @DateTimeFormat(pattern = "yyyy-MM-dd")	
		 private Date issueDate;
		// @Column(name="quantity",nullable=false)
		// @NotNull(message = "quantity Should Not Be Null") 
		// private int quantity;
		 @NotNull(message="duedate cannot be null") 
		 @DateTimeFormat(pattern = "yyyy-MM-dd")
		 private Date dueDate;
		 private Long bookid;
		 private int userid;
		public int getIssueId() {
			return issueId;
		}
		public void setIssueId(int issueId) {
			this.issueId = issueId;
		}
		public Date getIssueDate() {
			return issueDate;
		}
		public void setIssueDate(Date issueDate) {
			this.issueDate = issueDate;
		}
		public Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(Date dueDate) {
			this.dueDate = dueDate;
		}
		public Long getBookid() {
			return bookid;
		}
		public void setBookid(Long long1) {
			this.bookid = long1;
		}
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		

}