package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeBookTest {
Recipe recipe=new Recipe();
RecipeBook book=new RecipeBook();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddRecipe() throws RecipeException {
		
		boolean expected=true;
		String newValue="1";
		recipe.setAmtChocolate(newValue);
		recipe.setAmtCoffee(newValue);
		recipe.setAmtMilk(newValue);
		recipe.setAmtSugar(newValue);
		recipe.setName(newValue);
		recipe.setPrice(newValue);		
		boolean actual=book.addRecipe(recipe);
		assertTrue(expected==actual);}

	@Test
	public void testDeleteRecipe() {
	String expected=null;
	int newValue=0;
	String actual =book.deleteRecipe(newValue);
	assertTrue(expected==actual);
		
	}

	@Test
	public void testEditRecipe() {
		int expected=0;
		int actual =0;
		book.editRecipe(0,recipe);
		assertTrue(expected==actual);	
		
		
	}

}
