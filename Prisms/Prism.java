/* Write this abstract class called Prism.  It has one private field (height) and a constructor.  
 * It contains the methods calcAreaOfBase, calcPerimeter, calcVolume, and calcSA.
 * None of these methods require parameters.   
 * A couple are abstract (An abstract method is a method that is declared, but contains no implementation. Abstract classes may not be instantiated, 
 * and require subclasses to provide implementations for the abstract methods.) - can you tell which ones and why?
 * 
 * Math note:
 * The volume of any prism can be found by multiplying the area of the base by the height.
 * The surface area of any prism can be found by multiplying the perimeter of the base by the height
 *   and then adding on the areas of the 2 bases.
 */


public class Prism {
	private int height;
		
	//constructor
	public Prism(int height) {
		this.height = height;
		
	}
	
	//Method
	public double calcAreaOfBase() {
		return 4.0; //temporary return
	}
	
	public double calcPerimeter() {
		return 5.0; //temporary retun
	}
	public double calcVolume() {
		return calcAreaOfBase() * height;
	
	}
	public double calcSA() {
		return ((calcPerimeter() * height) + (calcAreaOfBase() * 2));
	
	}
	
}
	