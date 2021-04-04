package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest2 {
	Recipe output=new Recipe();

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetAmtChocolateEqual() throws RecipeException {
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setAmtChocolate(newValue);
		actual=output.getAmtChocolate();
		assertTrue(expected==actual);
	}
	@Test
	public void testSetAmtChocolateBigger() throws RecipeException {
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setAmtChocolate(newValue);
		actual=output.getAmtChocolate();
		assertTrue(expected==actual);
	}

	@Test
	public void testSetAmtChocolateMines() throws RecipeException {
		int expected=-1;
		int actual=0;
		String newValue="0";
		output.setAmtChocolate(newValue);
		actual=output.getAmtChocolate();
		assertFalse(expected==actual);
	}
	@Test
	public void testSetAmtCoffee()  throws RecipeException{
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setAmtCoffee(newValue);
		actual=output.getAmtCoffee();
		assertTrue(expected==actual);
	}
	@Test
	public void testSetAmtCoffeeMines()  throws RecipeException{
		int expected=-1;
		int actual=0;
		String newValue="0";
		output.setAmtCoffee(newValue);
		actual=output.getAmtCoffee();
		assertFalse(expected==actual);
	}

	@Test
	public void testSetAmtMilk() throws RecipeException{
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setAmtMilk(newValue);
		actual=output.getAmtMilk();
		assertTrue(expected==actual);
	}
	
	@Test
	public void testSetAmtMilkMines() throws RecipeException{
		int expected=-1;
		int actual=0;
		String newValue="0";
		output.setAmtMilk(newValue);
		actual=output.getAmtMilk();
		assertFalse(expected==actual);
	}

	@Test
	public void testSetAmtSugar() throws RecipeException{
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setAmtSugar(newValue);
		actual=output.getAmtSugar();
		assertTrue(expected==actual);
		
	}
	@Test
	public void testSetAmtSugarMines() throws RecipeException{
		int expected=-1;
		int actual=0;
		String newValue="0";
		output.setAmtSugar(newValue);
		actual=output.getAmtSugar();
		assertFalse(expected==actual);
		
	}
	

	@Test
	public void testSetName() {
		String expected="";
		String actual=output.getName();
		String newValue="";
		output.setName(newValue);
		assertTrue(expected==actual);
	}

	@Test
	public void testSetPricePositive() throws RecipeException{
		int expected=0;
		int actual=0;
		String newValue="0";
		output.setPrice(newValue);
		actual=output.getPrice();
		assertTrue(expected==actual);
	}
	
	
	@Test
	public void testSetPriceMines() throws RecipeException{
		int expected=-1;
		int actual=0;
		String newValue="0";
		output.setPrice(newValue);
		actual=output.getPrice();
		assertFalse(expected==actual);
	}

	@Test
	public void testToString() {
		String expected="";
		String actual=output.getName();
		assertTrue(expected==actual);
	}

	@Test
	public void testEqualsObject() {
		
		boolean expected =true;
		boolean actual =true;
		//String value="rice";
		if (output.getName()==null) expected=false;
		//if(output.setName(value)) // false;
			//expected false;
		
		
		assertTrue(expected==actual);
		
	}

}
