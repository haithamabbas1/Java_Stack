package Pythagoreantheorem;
import java.lang.*;

public class pythagreantheorm {

	public static double calculateHypotenuse(int legA, int legB) {
	double c;
	c= Math.sqrt(Math.pow(legA, 2)+ Math.pow(legB,2));
	System.out.println(c);
	return c;
	}
	public static void main (String []args) {
		calculateHypotenuse(4,5);
	}

}
