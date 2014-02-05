package com.gcit.lms.entities;

// Generated Feb 5, 2014 2:59:14 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblReservationId generated by hbm2java
 */
@Embeddable
public class ReservationId implements java.io.Serializable {

	private int branchId;
	private int bookId;
	private int cardNo;

	public ReservationId() {
	}

	public ReservationId(int branchId, int bookId, int cardNo) {
		this.branchId = branchId;
		this.bookId = bookId;
		this.cardNo = cardNo;
	}

	@Column(name = "branchID", nullable = false)
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	@Column(name = "bookID", nullable = false)
	public int getBookId() {
		return this.bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	@Column(name = "cardNo", nullable = false)
	public int getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ReservationId))
			return false;
		ReservationId castOther = (ReservationId) other;

		return (this.getBranchId() == castOther.getBranchId())
				&& (this.getBookId() == castOther.getBookId())
				&& (this.getCardNo() == castOther.getCardNo());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBranchId();
		result = 37 * result + this.getBookId();
		result = 37 * result + this.getCardNo();
		return result;
	}

}
