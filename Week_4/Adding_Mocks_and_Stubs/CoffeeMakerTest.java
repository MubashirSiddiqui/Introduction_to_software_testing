/*
 * Copyright (c) 2009,  Sarah Heckman, Laurie Williams, Dright Ho
 * All Rights Reserved.
 *
 * Permission has been explicitly granted to the University of Minnesota
 * Software Engineering Center to use and distribute this source for
 * educational purposes, including delivering online education through
 * Coursera or other entities.
 *
 * No warranty is given regarding this software, including warranties as
 * to the correctness or completeness of this software, including
 * fitness for purpose.
 *
 * Modifications
 * 20171113 - Michael W. Whalen - Extended with additional recipe.
 * 20171114 - Ian J. De Silva   - Updated to JUnit 4; fixed variable names.
 */
package edu.ncsu.csc326.coffeemaker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Spy;

import edu.ncsu.csc326.coffeemaker.exceptions.InventoryException;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

/**
 * Unit tests for CoffeeMaker class.
 *
 * @author Sarah Heckman
 *
 * Extended by Mike Whalen
 */
public class CoffeeMakerTest
{

	//-----------------------------------------------------------------------
	//	DATA MEMBERS
	//-----------------------------------------------------------------------

	private Recipe recipe1;

	private Recipe recipe2;
	private Recipe recipe3;
	private Recipe recipe4;
	private Recipe recipe5;

	private Recipe [] stubRecipies;

	private CoffeeMaker coffeeMaker;

	private RecipeBook recipeBookStub;

	@Before
	public void setUp() throws RecipeException
    {
		Inventory inv = new Inventory();
		recipeBookStub = mock(RecipeBook.class);
		coffeeMaker = new CoffeeMaker(recipeBookStub, inv);

		//Set up for recipe1

		recipe1 = spy(new Recipe());
		recipe1.setName("Coffee");
		recipe1.setAmtChocolate("1");
		recipe1.setAmtCoffee("2");
		recipe1.setAmtMilk("3");
		recipe1.setAmtSugar("4");
		recipe1.setPrice("50");

		//Set up for recipe2
		recipe2 = new Recipe();
		recipe2.setName("Mocha");
		recipe2.setAmtChocolate("20");
		recipe2.setAmtCoffee("30");
		recipe2.setAmtMilk("19");
		recipe2.setAmtSugar("18");
		recipe2.setPrice("75");

		//Set up for recipe3
		recipe3 = new Recipe();
		recipe3.setName("Latte");
		recipe3.setAmtChocolate("0");
		recipe3.setAmtCoffee("3");
		recipe3.setAmtMilk("3");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("100");


		stubRecipies = new Recipe [] {recipe1, recipe2, recipe3};
		when(recipeBookStub.getRecipes()).thenReturn(stubRecipies);
		//when(inv.getChocolate()).th

		//  when(stockServiceMock.getPrice(microsoftStock)).thenReturn(1000.00)
	}

	@Test
	public void testAddInventoryWithStringVal()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("sdf", "ifgjdi", "asdf", "sdfdgfgh");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block

			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal1()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("-44", "4", "6", "3");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal2()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("44", "-4", "6", "3");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal3()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("44", "4", "-6", "3");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal4()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("44", "4", "6", "-33");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal5()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("4", "ifgjdi", "asdf", "sdfdgfgh");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block

			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal6()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("4", "4", "asdf", "sdfdgfgh");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block

			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithStringVal7()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("4", "5", "5", "sdfdgfgh");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block

			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithOutOfBound()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "111111111111111111122222222222211111111111111111111111111222222222222222222222", "333333333333333333333333333333333333333333333333333344444444444444444444444444444443");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithWrongVal()
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		try
        {
			coffeeMaker.addInventory("-55", "-10", "-19", "-9");
			assertTrue(true);
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	//ccoff,milk,sugar,choco
	@Test
	public void testAddInventoryWithValCheckCoffe()
    {
		Inventory inv= new Inventory();
		coffeeMaker = new CoffeeMaker(recipeBookStub, inv);

		try
        {
			coffeeMaker.addInventory("4", "9", "5", "3");
			assertEquals(19, inv.getCoffee());
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithValCheckMilk()
    {
		Inventory inv= new Inventory();
		coffeeMaker = new CoffeeMaker(recipeBookStub,inv);

		try
        {
			coffeeMaker.addInventory("4", "10", "5", "3");
			assertEquals(25, inv.getMilk());
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithValCheckSugar()
    {
		Inventory inv= new Inventory();
		coffeeMaker = new CoffeeMaker(recipeBookStub, inv);

		try
        {
			coffeeMaker.addInventory("4", "9", "5", "3");
			assertEquals(20, inv.getSugar());
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testAddInventoryWithValCheckChoco()
    {
		Inventory inv= new Inventory();
		coffeeMaker = new CoffeeMaker(recipeBookStub, inv);

		try
        {
			coffeeMaker.addInventory("4", "9", "5", "3");
			assertEquals(18, inv.getChocolate());
		}
        catch (InventoryException e)
        {
			// TODO Auto-generated catch block
			assertFalse(false);
		}
	}

	@Test
	public void testCheckInventory1()
    {
	}

	@Test
	public	void testPurchaseWithRightAmmountToCheckChange() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());

		assertEquals(0,coffeeMaker.makeCoffee(0, 50));
	}

	@Test
	public	void testPurchaseWithRightAmmountToCheckChange1() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());

		assertEquals(-5,coffeeMaker.makeCoffee(0, -5));
	}

	@Test
	public	void testPurchaseWithRightAmmountToCheckInventoryRemainings() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		//Inventory inv = new Inventory();

		coffeeMaker.makeCoffee(0, 50);
		assertEquals("Coffee: 13\n" +
				     "Milk: 12\n" +
				     "Sugar: 11\n" +
				     "Chocolate: 14\n",coffeeMaker.checkInventory());
	}

	@Test
	public	void testPurchaseWithRightAmmountToCheckInventoryRemainings1() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		//Inventory inv = new Inventory();

		coffeeMaker.makeCoffee(0, -5);
		assertEquals("Coffee: 15\n" +
				     "Milk: 15\n" +
				     "Sugar: 15\n" +
				     "Chocolate: 15\n",coffeeMaker.checkInventory());
	}

	@Test
	public	void testPurchaseToCheckRecipeExists() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		//Inventory inv = new Inventory();
		assertEquals(5,coffeeMaker.makeCoffee(6, 5));
	}

	@Test
	public	void testPurchaseToCheckRecipeExists1() throws RecipeException
    {
		coffeeMaker = new CoffeeMaker(recipeBookStub, new Inventory());
		//Inventory inv = new Inventory();

		assertEquals(5,coffeeMaker.makeCoffee(0, 55));
	}

}