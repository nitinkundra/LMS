package com.gcit.lms.entities;

// Generated Feb 5, 2014 2:59:14 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * TblLibrarian generated by hbm2java
 */
@Entity
@Table(name = "tbl_librarian", catalog = "library", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Librarian implements java.io.Serializable {

	private LibrarianId id;
	private LibraryBranch tblLibraryBranch;
	private String name;
	private String email;
	private String password;

	public Librarian() {
	}

	public Librarian(LibrarianId id, LibraryBranch tblLibraryBranch,
			String password) {
		this.id = id;
		this.tblLibraryBranch = tblLibraryBranch;
		this.password = password;
	}

	public Librarian(LibrarianId id, LibraryBranch tblLibraryBranch,
			String name, String email, String password) {
		this.id = id;
		this.tblLibraryBranch = tblLibraryBranch;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "librarianId", column = @Column(name = "librarianId", nullable = false)),
			@AttributeOverride(name = "branchId", column = @Column(name = "branchId", nullable = false)) })
	public LibrarianId getId() {
		return this.id;
	}

	public void setId(LibrarianId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "branchId", nullable = false, insertable = false, updatable = false)
	public LibraryBranch getTblLibraryBranch() {
		return this.tblLibraryBranch;
	}

	public void setTblLibraryBranch(LibraryBranch tblLibraryBranch) {
		this.tblLibraryBranch = tblLibraryBranch;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

}