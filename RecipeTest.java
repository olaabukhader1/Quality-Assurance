package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest {
	Recipe recipes=new Recipe();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetAmtChocolate() throws RecipeException {
		int expected =0;
		int actual=recipes.getAmtChocolate();
		recipes.setAmtChocolate("0");
		System.out.println(actual);
		assertTrue(expected== actual);
		
	}

	@Test
	public void testGetAmtCoffee() throws RecipeException {
		int expected=0;
		recipes.setAmtMilk("0");
		int actual=recipes.getAmtCoffee();
		System.out.println(actual);
		assertTrue(expected==actual);
	}

	@Test
	public void testGetAmtMilk() throws RecipeException {
		int expected=1;
		recipes.setAmtMilk("1");
		int actual=recipes.getAmtMilk();
		assertTrue(expected==actual);
}

	@Test
	public void testGetAmtSugar() {
		int expected=0;
		int actual=recipes.getAmtSugar();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetName() {
		String expected="";
		String actual=recipes.getName();
		assertTrue(expected==actual);
	
	}

	@Test
	public void testGetPrice() {
		int expected=0;
        int actual=recipes.getPrice();
         assertEquals(expected,actual);
	
	}

}
