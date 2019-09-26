/*
 * IS4010 Fal 2019
 * Assignment 05
 * COURTNEY JO YOUNG
 * young2cj@mail.uc.edu
 */
package footballFun;


public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed");
		}
	}
	
	/**
	 * Tally score
	 * @param score
	 * @return  if all tests were passed
	 */
	public static String translateScore (int score) {

		if (score == 2)
		{
			return "Safety";
		}
		if (score == 3)
		{
			return "Field Goal";
		}
		if (score == 6)
		{
			return "Touchdown";
		}
		if (score == 7)
		{
			return "Touchdown and Extra Point";
		}
		if (score == 8)
		{
			return "Touchdown and 2-point conversion";
	}
	
		return " ";
}
	
}
