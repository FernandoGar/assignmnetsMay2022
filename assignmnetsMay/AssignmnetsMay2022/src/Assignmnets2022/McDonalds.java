package Assignmnets2022;

import java.util.Scanner;

public class McDonalds extends Restaurant {
private String name;
private int price;
Scanner input = new Scanner(System.in);


	@Override
	public double totalPrice(double price, double tax) {
		// TODO Auto-generated method stub
		return 0;
	}
	
public McDonalds (String name, int price) {
    setName(name);
    setPrice(price);
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}

public int getPrice() {
    return price;
}
public void setPrice(int price) {
    this.price= price;
}

public void totalPrice() {
    double totalPrice = 0;
    double tax = 0.06;
    totalPrice += (totalPrice * tax);       
}

public void menuItems() {
    
	double mcChicken = 2.99;
	double fries = 1.75;
	double soda = 2.05;
	double bigMC = 7.34;
	double chNuggets = 5.78;
	
	}

}
	
	


