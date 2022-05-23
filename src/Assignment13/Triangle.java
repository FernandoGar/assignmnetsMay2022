package Assignment13;

public class Triangle extends Shapes{

	@Override
	void printArea() {
		// TODO Auto-generated method stub
		System.out.println(" Enter the length and width of the triangle");
		length = scanner.nextInt();
		width = scanner.nextInt();
		System.out.println(" The area of the triangle is " + ((length*width)/2));
		
	}

}
