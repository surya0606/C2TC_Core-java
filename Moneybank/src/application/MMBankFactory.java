package application;

import framework.BankFactory;
import framework.CurrentAcc;
import framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean isSalary) {
		MMSavingAcc msa = new MMSavingAcc(accNo, accNm, accBal, isSalary);
		return msa;
	}

	@Override
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mca = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return mca;
	}

	
	
}

