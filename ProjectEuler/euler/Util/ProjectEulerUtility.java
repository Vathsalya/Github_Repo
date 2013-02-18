package euler.Util;

public class ProjectEulerUtility {
	/*
	 * This method generates the multiples of 3 or 5 for a given number range.
	 * and return the sum of the mutiples.
	 */
	public static int getSumOfMultiples(int range) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 0;i<1000;i++){
			if(i%3==0 || i%5==0){
				sum = sum+i;
			}
		}
		return sum;
	}
}
