package edu.najah.csp.coffeemaker;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class getRecipeTest {
	//create a recipe object
	RecipeBook res=new RecipeBook();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testGetRecipes() {
	int expected=4;	
	Recipe[] actual=res.getRecipes();
	assertEquals(expected,actual.length);
}

	

}
