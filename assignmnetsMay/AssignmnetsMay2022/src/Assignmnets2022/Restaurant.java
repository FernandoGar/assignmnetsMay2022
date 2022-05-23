package Assignmnets2022;

public abstract class Restaurant {
	
	protected double tax = 0.06;
	private String name;
	private String menuItem;
	
	public String getname() 
	{
		return name;
	}
	public void setName() 
	{
		this.name = name;
	}
	
	public abstract double totalPrice(double price, double tax);
	
	
	

}
