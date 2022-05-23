package Assignment13;

public class Circle extends Shapes {

	@Override
	void printArea() {
		// TODO Auto-generated method stub
		System.out.println(" Enter the radius of a circle to find the area");
		radius = scanner.nextInt();
		System.out.println(" The area of the circle is " + (radius* radius * 3.14));
	}
	

}
