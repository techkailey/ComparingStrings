/**
*
Class Recursion has a recursive method to compare two strings using 
alphabetical order and another recursive method to find the minimum
String in an array of Strings.
*
* @author Kailey Bergeron
* @version 11.0.8
*
*/
import java.util.ArrayList;

public class Recursion{

	/**
	* compares two strings
	* @param s1 String being compared
	* @param s2 String being compared
	* @return 1 if s1 comes after s2
	* @return -1 if s1 comes before s2
	* @return 0 if the strings are equal 
	*/  
	public static int compare(final String s1, final String s2){
		// convert strings to lowercase
		String string1 = s1.toLowerCase();
		String string2 = s2.toLowerCase();

		for(int i = 0; i < s1.length() && i < s1.length(); i++){
			// s1 comes after s2 return 1
			if( s1.charAt(i) > s2.charAt(i)){
				return 1;
			
			} // s1 comes before s2 returns -1
			else if(s1.charAt(i) < s2.charAt(i)){
				return -1;
			
			} // s1 is equal to s2 return 0
			else if(s1.charAt(i) == s2.charAt(i)){
				return 0;
			}
		} 
		return compare(s1,s2);
	} // end of compare method

	/**
	* method used to find the minumum of an array of strings
	* @param stringArray the array of strings being compared 
	* @return the minimum string of the string array
	*/

	public static String findMinimum(final ArrayList<String> stringArray){
		// initialize int i to 0
		// initialize String min
		int i = 0;
		String min = "";
		// if string array is empty 
		if(stringArray.size() == 1){
			min = stringArray.get(0);
		} 
		else{
			// use compare method to compare Strings in stringArray
			int index = compare(stringArray.get(0), stringArray.get(stringArray.size()-1));
			// if compare method returns a -1
			if(index == -1) {
				stringArray.remove(stringArray.size()-1);
				return findMinimum(stringArray);
			}
			// if compare method returns a 1
			else if (index == 1) {
				stringArray.remove(0);
				return findMinimum(stringArray);
			}
			else{
				stringArray.remove(0);
				return findMinimum(stringArray);
			} 
		} return min;
	} // end of findMinimum method
} // end of Recursion class
