
/* Create the application class “Bank” which will have the main method. 
First the application will require the user to create an account. So, you have to ask for user name, what type
of account he wants to open and what would be the initial balance. The system will create the account
(SavingsAccount or CurrentAccount object) with a randomly generated 5 digit account number.
After creating the account, you have to provide a menu on the console. It will take user input to decide what
action to take
 */
package q3;

import java.util.*;

class Account {

	private String memberName;
	private String accountNumber;
	private double accountBalance;

	Account(double initialBalance, String memberName) {
		Random rand = new Random();
		String num = 10000 + rand.nextInt(89999) + "";
		accountNumber = num;
		this.accountBalance = initialBalance;
		this.memberName = memberName;
	}

	protected double getAccountBalance() {
		return accountBalance;
	}

	protected void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void deposit(double amount) {
		this.accountBalance += amount;
	}

}

class SavingsAccount extends Account {
	double minimumBalance = 500.0;
	int interest;
	double maxWithdrawLimit;

	SavingsAccount(double initialBalance, String memName, double maxWithdrawLimit) {
		super(initialBalance, memName);
		interest = 5;
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	@Override
	protected double getAccountBalance() {
		double totalBalance = (super.getAccountBalance() + (interest * super.getAccountBalance() / 100.0));

		return totalBalance;
	}

	public void withDraw(double amount) {
		if (amount < this.maxWithdrawLimit && ((this.getAccountBalance() - amount) >= 500)) {
			this.setAccountBalance(this.getAccountBalance() - amount);
			System.out.println(" Total amount withdrawn from account :" + amount);
		}

		else {

			System.out.println("Not enough balance in account");
		}

	}
}

class CurrentAccount extends Account {
	String tradeLicenceNumber;

	CurrentAccount(double initialBalance, String memName, String tradeLicenseNumber) {
		super(initialBalance, memName);
		this.tradeLicenceNumber = tradeLicenseNumber;
	}

	public double getBalance() {
		return this.getAccountBalance();
	}

	public void withDraw(double amount) {
		System.out.println("amount: " + amount + " balance:" + this.getAccountBalance());
		if (amount > this.getAccountBalance()) {
			System.out.println(" Total amount withdrawn from account :" + amount);
			this.setAccountBalance(this.getAccountBalance() - amount);
		} else {
			System.out.println("Not enough balance in account");
		}
	}

}

public class BankingSystem {
	public static void main(String[] args) {

		System.out.println("Follow the instruction to create an account");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name");
		String mName = sc.next();
		System.out.println("Enter '1' for saving account and '2' for current account");
		int choice = sc.nextInt();
		Account a = null;

		System.out.println("Enter your initial balance");
		double initialBalance = sc.nextDouble();
		if (choice == 1) {
			double maxWithdrawLimit = 500;
			a = new SavingsAccount(initialBalance, mName, maxWithdrawLimit);

		} else if (choice == 2) {
			System.out.println("Enter your trade license number");
			String tln = sc.next();
			a = new CurrentAccount(initialBalance, mName, tln);
		}

		System.out.println("Account Created Successfully ");

		do {
			System.out.println("1. Deposit Money");
			System.out.println("2. Withdraw Money");
			System.out.println("3. Display Balance");
			System.out.println("4. Exit");
			System.out.print("Enter your choice: ");
			int ch = sc.nextInt();
			if (ch == 1) {

				System.out.println("Enter the amount of money to be deposit");
				double amountDeposited = sc.nextDouble();
				a.setAccountBalance(a.getAccountBalance() + amountDeposited);
				System.out.println("Enter Yes to check the balance/ Enter No to skip");
				String ch1 = sc.nextLine();
				if (ch1.equals("Yes")) {
					System.out
							.println("Account balance before depositing: " + (a.getAccountBalance() - amountDeposited));
					System.out.println("Account balance after depositing: " + a.getAccountBalance());
				}
			} else if (ch == 2) {

				System.out.println("Enter the amount of money to be withdrawn");
				double moneyToBeWithdrawn = sc.nextDouble();
				if (choice == 1) {
					SavingsAccount sa = (SavingsAccount) a;
					sa.withDraw(moneyToBeWithdrawn);
				} else {
					CurrentAccount ca = (CurrentAccount) a;
					ca.withDraw(moneyToBeWithdrawn);
				}
				System.out.println("Enter Yes to check the balance/ Enter No to skip");
				sc.nextLine();
				String ch2 = sc.nextLine();
				if (ch2.equals("Yes")) {
					System.out.println(
							"Account balance before withdrawing: " + (a.getAccountBalance() + moneyToBeWithdrawn));
					System.out.println("Account balance after withdrawing: " + a.getAccountBalance());
				}
			}

			else if (ch == 3) {
				System.out.println("Balance in account " + a.getAccountBalance());

			} else if (ch == 4) {
				System.out.println("Thank you for using our service ");
				System.exit(0);
			}
		} while (true);

	}

}

