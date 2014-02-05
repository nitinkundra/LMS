package com.gcit.lms.entities;

// Generated Feb 5, 2014 2:59:14 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TblBookLoans generated by hbm2java
 */
@Entity
@Table(name = "tbl_book_loans", catalog = "library")
public class BookLoans implements java.io.Serializable {

	private BookLoansId id;
	private Borrower tblBorrower;
	private LibraryBranch tblLibraryBranch;
	private Book tblBook;
	private Date dateOut;
	private Date dueDate;

	public BookLoans() {
	}

	public BookLoans(BookLoansId id, Borrower tblBorrower,
			LibraryBranch tblLibraryBranch, Book tblBook) {
		this.id = id;
		this.tblBorrower = tblBorrower;
		this.tblLibraryBranch = tblLibraryBranch;
		this.tblBook = tblBook;
	}

	public BookLoans(BookLoansId id, Borrower tblBorrower,
			LibraryBranch tblLibraryBranch, Book tblBook, Date dateOut,
			Date dueDate) {
		this.id = id;
		this.tblBorrower = tblBorrower;
		this.tblLibraryBranch = tblLibraryBranch;
		this.tblBook = tblBook;
		this.dateOut = dateOut;
		this.dueDate = dueDate;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "bookId", column = @Column(name = "bookId", nullable = false)),
			@AttributeOverride(name = "branchId", column = @Column(name = "branchId", nullable = false)),
			@AttributeOverride(name = "cardNo", column = @Column(name = "cardNo", nullable = false)) })
	public BookLoansId getId() {
		return this.id;
	}

	public void setId(BookLoansId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cardNo", nullable = false, insertable = false, updatable = false)
	public Borrower getTblBorrower() {
		return this.tblBorrower;
	}

	public void setTblBorrower(Borrower tblBorrower) {
		this.tblBorrower = tblBorrower;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId", nullable = false, insertable = false, updatable = false)
	public LibraryBranch getTblLibraryBranch() {
		return this.tblLibraryBranch;
	}

	public void setTblLibraryBranch(LibraryBranch tblLibraryBranch) {
		this.tblLibraryBranch = tblLibraryBranch;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookId", nullable = false, insertable = false, updatable = false)
	public Book getTblBook() {
		return this.tblBook;
	}

	public void setTblBook(Book tblBook) {
		this.tblBook = tblBook;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateOut", length = 19)
	public Date getDateOut() {
		return this.dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dueDate", length = 19)
	public Date getDueDate() {
		return this.dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

}