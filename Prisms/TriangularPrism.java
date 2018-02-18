/* Write this concrete (non-abstract) class called TriangularPrism.  
 * It has 3 private fields (sideA, sideB, and sideC).
 * It inherits its height from its superclass, Prism (because all prisms have a height).
 * Provide a constructor and the methods required by its abstract superclass.  
 * 
 * Math Note:
 * Perimeter refers to the perimeter of the base - the sum of all the sides.
 * To find the area of a triangle given 3 side lengths, look up Heron's formula.  
 * It uses half the perimeter.  (Why might you want to use 0.5 instead of 1/2?)
 */


public class TriangularPrism extends Prism{
	private int sideA;
	private int sideB;
	private int sideC;
	
	public TriangularPrism(int height, int sideA, int sideB, int sideC ) {
		super(height);
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}	
	public double calcAreaOfBase() { //area of base of triangle Heron's formula
		double S = calcPerimeter();
		return Math.sqrt(S * (S - sideA) * (S - sideB) * (S - sideC));
	}
	public double calcPerimeter() {
		return(sideA + sideB + sideC) * .5;
	}
}