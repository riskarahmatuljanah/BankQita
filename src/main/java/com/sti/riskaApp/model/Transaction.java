package com.sti.riskaApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	
	@Column(name ="transactionnumber")
	private int transactionnumber;
	
	@Column(name="type")
	private String type;
	
	@Column(name="amount")
	private String amount;
	
	@Column(name="amountsign")
	private String amountsign;
	
	@ManyToOne
	@JoinColumn(name="idaccount")
	private Account account;

	public int getTransactionnumber() {
		return transactionnumber;
	}

	public void setTransactionnumber(int transactionnumber) {
		this.transactionnumber = transactionnumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAmountsign() {
		return amountsign;
	}

	public void setAmountsign(String amountsign) {
		this.amountsign = amountsign;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	
}
