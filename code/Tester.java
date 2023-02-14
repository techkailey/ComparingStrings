/**
*
*Tester file used to test Recursion methods
*
* @author Kailey Bergeron
* @version 11.0.8
*
*/

// imports 
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class Tester{

	private Recursion string;
	private ArrayList<String> array = new ArrayList<String>();

	// initialize strings to compare
	String string2 = "Kailey";
	String string3 = "homework";

	/*
	* tester method for compare method
	* compares two strings
	*/
	@Test
	public void TestCompare(){
		assertEquals(-1,Recursion.compare(string2,string3));
		assertEquals(1, Recursion.compare(string3,string2));
	}

	/*
	* tester method for findMinimim method
	* adds strings to the array to compare
	*/
	@Test
	public void TestMin(){
		array.add("Summa");
		array.add("Panta");
		assertEquals("Panta",Recursion.findMinimum(array));
	}
} // end of Tester