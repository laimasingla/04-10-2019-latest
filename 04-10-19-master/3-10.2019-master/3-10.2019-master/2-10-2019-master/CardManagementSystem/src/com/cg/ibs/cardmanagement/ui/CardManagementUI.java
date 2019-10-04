
package com.cg.ibs.cardmanagement.ui;

import java.util.*;

import com.cg.ibs.cardmanagement.service.CustomerServiceImpl;
import com.sun.xml.internal.ws.api.pipe.NextAction;
import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;

import java.io.*;
import java.math.BigInteger;
enum CardMenu {
	
	LIST_EXISTING_DEBIT_CARDS,LIST_EXISTING_CREDIT_CARDS,
    APPLY_NEW_DEBIT_CARD, APPLY_NEW_CREDIT_CARD, 
	UPGRADE_EXISTING_DEBIT_CARD,UPGRADE_EXISTING_CREDIT_CARD,
	RESET_DEBIT_CARD_PIN,RESET_CREDIT_CARD_PIN,
	REPORT_DEBIT_CARD_LOST,REPORT_CREDIT_CARD_LOST, 
	REQUEST_DEBIT_CARD_STATEMENT,REQUEST_CREDIT_CARD_STATEMENT,
	REPORT_DEBITCARD_STATEMENT_MISMATCH,REPORT_CREDITCARD_STATEMENT_MISMATCH,QUIT;
}
public class CardManagementUI

{

	public static void main(String args[]) throws Exception{
		
		
		 
		
		BigInteger accountNumber;
		Scanner scan = new Scanner(System.in);
		 CardManagementUI obj = new CardManagementUI();
		 CustomerServiceImpl  customService=new CustomerServiceImpl();
		System.out.println("Welcome to card management System");
		System.out.println("Enter 1 to login as a customer");
		System.out.println("Enter 2 to login as a bank admin");
		int userInput = scan.nextInt();
		if(userInput==1){
			System.out.println("You are logged in as a customer");
			CardMenu choice = null;
			while (choice != CardMenu.QUIT) {
				System.out.println("Menu");
				System.out.println("--------------------");
				System.out.println("Choice");
				System.out.println("--------------------");
				for (CardMenu menu : CardMenu.values()) {
					System.out.println(menu.ordinal() + "\t" + menu);
				}
				System.out.println("Choice");
				int ordinal = scan.nextInt();
				if (ordinal >= 0 && ordinal < CardMenu.values().length) {
					choice = CardMenu.values()[ordinal];

					switch (choice) {
					
					case LIST_EXISTING_DEBIT_CARDS:
						List<DebitCardBean> debitCardBeans= customService.viewAllDebitCards();
						for(DebitCardBean debitCardBean: debitCardBeans){
							System.out.println("Account Number:"+debitCardBean.getAccountNumber()+"  Debit Card number :"+debitCardBean.getDebitCardNumber()+" Debit Card Status :"+debitCardBean.isDebitCardStatus()+"  Name on Card:" + debitCardBean.getNameOnDebitCard()+"  CVV:"+debitCardBean.getDebitCvvNum()+"  Current Pin:"+debitCardBean.getDebitCurrentPin()+"  Date of Expiry:" +debitCardBean.getDebitDateOfExpiry()+" Unique Customer ID:"+debitCardBean.getUCI()+"  Card Type:"+debitCardBean.getDebitCardType());}
						break;
						
					case LIST_EXISTING_CREDIT_CARDS:
						
						List<CreditCardBean> creditCardBeans = customService.viewAllCreditCards();
						for(CreditCardBean creditCardBean: creditCardBeans){
							System.out.println("  Credit Card number :"+creditCardBean.getCreditCardNumber()+" Credit Card Status :"+creditCardBean.isCreditCardStatus()+"  Name on Card:" + creditCardBean.getNameOnCreditCard()+"  CVV:"+creditCardBean.getCreditCvvNum()+"  Current Pin:"+creditCardBean.getCreditCurrentPin()+"  Date of Expiry:" +creditCardBean.getCreditDateOfExpiry()+" Unique Customer ID: "+creditCardBean.getUCI()+"  Card Type:"+creditCardBean.getCreditCardType() +" Credit Score:"+creditCardBean.getCreditScore()+"  Credit Limit: "+ creditCardBean.getCreditLimit()+"  Income Tax Return :"+ creditCardBean.getIncomeTaxReturn());}
						
						break;
						
					case APPLY_NEW_DEBIT_CARD:
						System.out.println("You are applying for a new Debit Card");
						System.out.println("Enter Account Number you want to apply debit card for :");
						accountNumber = scan.nextBigInteger();
					
						customService.applyNewDebitCard(accountNumber);
						break;
					case APPLY_NEW_CREDIT_CARD:
						
						System.out.println("You are applying for a new Credit Card");
						
						customService.applyNewCreditCard();
						
						break;
					case UPGRADE_EXISTING_DEBIT_CARD:
						break;
					case UPGRADE_EXISTING_CREDIT_CARD:
						break;
					case RESET_DEBIT_CARD_PIN:
						break;
					case RESET_CREDIT_CARD_PIN:
						break;
					case REPORT_DEBIT_CARD_LOST:
						System.out.println("Enter your Debit Card Number: ");
						BigInteger debitCardNumber;
						debitCardNumber=scan.nextBigInteger();
						customService.requestDebitCardLost(debitCardNumber);
						break;
					case REPORT_CREDIT_CARD_LOST:
						System.out.println("Enter your Credit Card Number: ");
						BigInteger creditCardNumber;
						creditCardNumber=scan.nextBigInteger();
						customService.requestCreditCardLost(creditCardNumber);
						break;
					case REQUEST_DEBIT_CARD_STATEMENT:
						break;
					case REQUEST_CREDIT_CARD_STATEMENT:
						break;
					case REPORT_DEBITCARD_STATEMENT_MISMATCH:
						break;
					case REPORT_CREDITCARD_STATEMENT_MISMATCH:
						break;
					case QUIT:
						System.out.println("App Closed.");
						break;
					}
				} else {
					System.out.println("Invalid Option!!");
					choice = null;
				}
			}			
		
		

		

	
		

	}
				}
				}
