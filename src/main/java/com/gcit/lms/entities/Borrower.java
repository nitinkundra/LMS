package com.gcit.lms.entities;

// Generated Feb 5, 2014 2:59:14 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TblBorrower generated by hbm2java
 */
@Entity
@Table(name = "tbl_borrower", catalog = "library", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Borrower implements java.io.Serializable {

	private Integer cardNo;
	private String name;
	private String address;
	private String phone;
	private String email;
	private String password;
	private Set<Reservation> tblReservations = new HashSet<Reservation>(0);
	private Set<BookLoans> tblBookLoanses = new HashSet<BookLoans>(0);

	public Borrower() {
	}

	public Borrower(String password) {
		this.password = password;
	}

	public Borrower(String name, String address, String phone, String email,
			String password, Set<Reservation> tblReservations,
			Set<BookLoans> tblBookLoanses) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.tblReservations = tblReservations;
		this.tblBookLoanses = tblBookLoanses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cardNo", unique = true, nullable = false)
	public Integer getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(Integer cardNo) {
		this.cardNo = cardNo;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "address", length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", length = 45)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", unique = true, length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 45)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBorrower")
	public Set<Reservation> getTblReservations() {
		return this.tblReservations;
	}

	public void setTblReservations(Set<Reservation> tblReservations) {
		this.tblReservations = tblReservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBorrower")
	public Set<BookLoans> getTblBookLoanses() {
		return this.tblBookLoanses;
	}

	public void setTblBookLoanses(Set<BookLoans> tblBookLoanses) {
		this.tblBookLoanses = tblBookLoanses;
	}

}
