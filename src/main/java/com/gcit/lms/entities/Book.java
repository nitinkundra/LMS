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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TblBook generated by hbm2java
 */
@Entity
@Table(name = "tbl_book", catalog = "library")
public class Book implements java.io.Serializable {

	private Integer bookId;
	private Author tblAuthor;
	private Publisher tblPublisher;
	private String title;
	private Set<BookLoans> tblBookLoanses = new HashSet<BookLoans>(0);
	private Set<BookCopies> tblBookCopieses = new HashSet<BookCopies>(0);
	private Set<Reservation> tblReservations = new HashSet<Reservation>(0);
	private Set<BookRequests> tblBookRequestses = new HashSet<BookRequests>(
			0);

	public Book() {
	}

	public Book(String title) {
		this.title = title;
	}

	public Book(Author tblAuthor, Publisher tblPublisher,
			String title, Set<BookLoans> tblBookLoanses,
			Set<BookCopies> tblBookCopieses,
			Set<Reservation> tblReservations,
			Set<BookRequests> tblBookRequestses) {
		this.tblAuthor = tblAuthor;
		this.tblPublisher = tblPublisher;
		this.title = title;
		this.tblBookLoanses = tblBookLoanses;
		this.tblBookCopieses = tblBookCopieses;
		this.tblReservations = tblReservations;
		this.tblBookRequestses = tblBookRequestses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "bookId", unique = true, nullable = false)
	public Integer getBookId() {
		return this.bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "authId")
	public Author getTblAuthor() {
		return this.tblAuthor;
	}

	public void setTblAuthor(Author tblAuthor) {
		this.tblAuthor = tblAuthor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pubId")
	public Publisher getTblPublisher() {
		return this.tblPublisher;
	}

	public void setTblPublisher(Publisher tblPublisher) {
		this.tblPublisher = tblPublisher;
	}

	@Column(name = "title", nullable = false, length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBook")
	public Set<BookLoans> getTblBookLoanses() {
		return this.tblBookLoanses;
	}

	public void setTblBookLoanses(Set<BookLoans> tblBookLoanses) {
		this.tblBookLoanses = tblBookLoanses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBook")
	public Set<BookCopies> getTblBookCopieses() {
		return this.tblBookCopieses;
	}

	public void setTblBookCopieses(Set<BookCopies> tblBookCopieses) {
		this.tblBookCopieses = tblBookCopieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBook")
	public Set<Reservation> getTblReservations() {
		return this.tblReservations;
	}

	public void setTblReservations(Set<Reservation> tblReservations) {
		this.tblReservations = tblReservations;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tblBook")
	public Set<BookRequests> getTblBookRequestses() {
		return this.tblBookRequestses;
	}

	public void setTblBookRequestses(Set<BookRequests> tblBookRequestses) {
		this.tblBookRequestses = tblBookRequestses;
	}

}
