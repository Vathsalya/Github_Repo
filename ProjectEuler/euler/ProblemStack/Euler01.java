package euler.ProblemStack;

import euler.Util.ProjectEulerUtility;

/*If we list all the natural numbers below 10 that are multiples of 3 or 5,
 *we get 3, 5, 6 and 9. The sum of these multiples is 23.
 *Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Euler01 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sumOfmultiples = ProjectEulerUtility.getSumOfMultiples(1000);
		System.out.println("The sum of all the multiples of 3 or 5 below 1000 is "+sumOfmultiples);
	}
}
