package com.tns.client;

import com.tns.application.MMBankFactory;
import com.tns.application.MMCurrentAcc;
import com.tns.application.MMSavingAcc;
import com.tns.framework.BankFactory;
import com.tns.framework.CurrentAcc;
import com.tns.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(01,"Rizwan",54000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca =new MMCurrentAcc(10,"khan",54000,70000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}
