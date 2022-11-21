
public class Computer {
	/**
	 * This methods will compute the months left in the year or weeks left in the program
	 * based on the number passed as parameter. If number is positive then  it'll compute months left in the year
	 * or else it'll compute weeks left in the program.
	 * @param number is the studentNumber entered by the user
	 * @return the computed result of months left or weeks left
	 */
	public int compute(long number)
	{
		int result;
		int weeks=12;
		int terms=4;
		int total_months=12;
		int current_month=9;
		if(number%2==0)
			result=total_months-current_month+1;
		else
			result=(terms*weeks)-weeks;
		return result;
	}
}
