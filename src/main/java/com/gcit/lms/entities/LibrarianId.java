package com.gcit.lms.entities;

// Generated Feb 5, 2014 2:59:14 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TblLibrarianId generated by hbm2java
 */
@Embeddable
public class LibrarianId implements java.io.Serializable {

	private int librarianId;
	private int branchId;

	public LibrarianId() {
	}

	public LibrarianId(int librarianId, int branchId) {
		this.librarianId = librarianId;
		this.branchId = branchId;
	}

	@Column(name = "librarianId", nullable = false)
	public int getLibrarianId() {
		return this.librarianId;
	}

	public void setLibrarianId(int librarianId) {
		this.librarianId = librarianId;
	}

	@Column(name = "branchId", nullable = false)
	public int getBranchId() {
		return this.branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LibrarianId))
			return false;
		LibrarianId castOther = (LibrarianId) other;

		return (this.getLibrarianId() == castOther.getLibrarianId())
				&& (this.getBranchId() == castOther.getBranchId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getLibrarianId();
		result = 37 * result + this.getBranchId();
		return result;
	}

}