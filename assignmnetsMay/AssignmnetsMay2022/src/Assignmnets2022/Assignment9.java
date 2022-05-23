package Assignmnets2022;

public class Assignment9 {
	public static void main(String args[]) {

		BankA a = new BankA();

		BankB b = new BankB(); BankC c = new BankC();

		System.out.println("Balance $" +a.getBalance(1000));

		System.out.println("Balance $" +b.getBalance(1500));

		System.out.println("Balance $" +c.getBalance(2000));

		}

}
