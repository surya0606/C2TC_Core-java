package client;

	import application.MMBankFactory;
	import application.MMCurrentAcc;
	import application.MMSavingAcc;
	import framework.BankFactory;
	import framework.CurrentAcc;
	import framework.SavingAcc;

	public class Client {

		public static void main(String[] args) {
			BankFactory bf = new MMBankFactory();
			SavingAcc sa = new MMSavingAcc(10001, "Surya", 250.6f, true);
			sa.withdraw(sa.getAccBal());
			sa.toString();
			CurrentAcc ca = new MMCurrentAcc(11001, "Raina", 20000f, 1000f);
			ca.withdraw(ca.getCreditLimit());
			ca.toString();
		}

	}



