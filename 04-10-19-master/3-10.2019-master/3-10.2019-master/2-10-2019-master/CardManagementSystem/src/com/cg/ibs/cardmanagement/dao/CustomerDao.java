package com.cg.ibs.cardmanagement.dao;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;

public interface CustomerDao {
	
	void newDebitCard(CaseIdBean caseIdObj,BigInteger accountNumber);
	
	void newCreditCard(CaseIdBean caseIdObjId);
	
	List <DebitCardBean> viewAllDebitCards();

	List<CreditCardBean> viewAllCreditCards();

	void requestDebitCardLost(CaseIdBean caseIdObj, BigInteger debitCardNumber);

	void requestCreditCardLost(CaseIdBean caseIdObj, BigInteger creditCardNumber);

	boolean verifyAccountNumber(BigInteger accountNumber);

	boolean verifyDebitCardNumber(BigInteger debitCardNumber);
	boolean verifyCreditCardNumber(BigInteger creditCardNumber);
	

}
