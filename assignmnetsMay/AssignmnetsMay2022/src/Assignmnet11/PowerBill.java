package Assignmnet11;

public class PowerBill extends Bill{

	@Override
	public void printBill() {
		// TODO Auto-generated method stub
		System.out.println(" Enter the amount for power bill");
		calcBill = scanner.nextDouble();
		System.out.println(" the power bill total is" + calcBill);
		
		
	}

}
