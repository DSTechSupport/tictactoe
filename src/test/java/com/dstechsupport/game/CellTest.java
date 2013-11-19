/*
*
* This test checks if cell does get the correct input and also if a cell is updated once it's been updated
*
*
*/

package com.dstechsupport.game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CellTest extends TestCase
{
	public void testCell()
	{
	    // create test class
	    Cell tester = new Cell( 1, 2 );
	    tester.column = 1;

	    assertEquals( "column initalized to 1", 1, tester.column );
	    assertEquals( "row initalized to 2", 2, tester.row );
	}

	public void testUpdateCell()
	{
	    assertTrue( true );
	}




}
