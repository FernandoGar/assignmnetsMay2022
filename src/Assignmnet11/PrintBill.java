package Assignmnet11;

public abstract class PrintBill extends Bill {
	public void main(String[] args) 
	{
		PowerBill power = new PowerBill();
		power.printBill();
		WaterBIll water = new WaterBIll();
		water.printBill();
	}
	

}
