package Assignment13;

public class Rectangle extends Shapes {

	@Override
	void printArea() {
		// TODO Auto-generated method stub
		System.out.println(" ENTER (length, Width) for rectangle ");
		length = scanner.nextInt();
		width = scanner.nextInt();
		System.out.println(" the area of the rectangle is : "+ length * width);
		
	}
	

}
