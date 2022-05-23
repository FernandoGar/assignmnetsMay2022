package Assignmnet11;

public class WaterBIll extends Bill {

	@Override
	void printBill() {
		// TODO Auto-generated method stub
		System.out.println(" Enter the amount for water bill");
		calcBill = scanner.nextDouble();
		System.out.println(" the water bill total is" + calcBill);
	}

}
