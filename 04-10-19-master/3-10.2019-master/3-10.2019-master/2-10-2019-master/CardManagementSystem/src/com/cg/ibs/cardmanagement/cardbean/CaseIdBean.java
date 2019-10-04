package com.cg.ibs.cardmanagement.cardbean;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CaseIdBean {
	private String caseIdTotal;

	private LocalDateTime caseTimeStamp;
	private String statusOfQuery;
	private BigInteger accountNumber;
	private String UCI ;
	private String defineQuery;
	private BigInteger cardNumber;
	

	public BigInteger getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(BigInteger cardNumber) {
		this.cardNumber = cardNumber;
	}

	public CaseIdBean() {
		super();
	}

	public String getDefineQuery() {
		return defineQuery;
	}

	public void setDefineQuery(String defineQuery) {
		this.defineQuery = defineQuery;
	}

	public BigInteger getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(BigInteger accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getUCI() {
		return UCI;
	}

	public void setUCI(String uCI) {
		UCI = uCI;
	}

	public String getCaseIdTotal() {
		return caseIdTotal;
	}

	public void setCaseIdTotal(String caseIdTotal) {
		this.caseIdTotal = caseIdTotal;
	}

	public LocalDateTime getCaseTimeStamp() {
		return caseTimeStamp;
	}

	public void setCaseTimeStamp(LocalDateTime timestamp) {
		this.caseTimeStamp = timestamp;
	}

	public String getStatusOfQuery() {
		return statusOfQuery;
	}

	public void setStatusOfQuery(String statusOfQuery) {
		this.statusOfQuery = statusOfQuery;
	}

}
