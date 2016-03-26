package com.project.model;

// Generated 26 Mar, 2016 2:28:40 PM by Hibernate Tools 4.0.0

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

/**
 * Price generated by hbm2java
 */
@Entity
@Table(name = "price", catalog = "awsmaven_db")
public class Price implements java.io.Serializable {

	private Integer id;
	private int amount;
	private Set<AngBook> angBooks = new HashSet<AngBook>(0);

	public Price() {
	}

	public Price(int amount) {
		this.amount = amount;
	}

	public Price(int amount, Set<AngBook> angBooks) {
		this.amount = amount;
		this.angBooks = angBooks;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "amount", nullable = false)
	public int getAmount() {
		return this.amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "price")
	public Set<AngBook> getAngBooks() {
		return this.angBooks;
	}

	public void setAngBooks(Set<AngBook> angBooks) {
		this.angBooks = angBooks;
	}

}
