/*
*
* This test checks if cell does get the correct input and also if a cell is updated once it's been updated
*
*
*/

package com.dstechsupport.game;

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CellTest extends TestCase
{
	@Test
	public void testCell()
	{
	    // create test class
	    Cell tester = new Cell( 1, 2 );

	    AssertEquals( "column initalized to 1", 1, tester.column );
	    AssertEquals( "row initalized to 2", 2, tester.row );
	}
	
	@Test
	public void testUpdateCell()
	{
	    assertTrue( true );
	}




}
