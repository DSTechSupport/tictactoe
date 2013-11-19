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
	    // create test instance
	    Cell tester = new Cell( 1, 2 );

	    // 

	    assertEquals( "column initalized to 1", 1, tester.column );
	    assertEquals( "row initalized to 2", 2, tester.row );
	}

	public void testUpdateCellToCircle()
	{
	    // create test instance
	    Cell tester = new Cell( 1, 1 );

	    // change symbol to circle
	    tester.updateCell( Symbol.CIRCLE );

	    assertEquals( "cell's symbol should be circle", Symbol.CIRCLE, tester.content );
	}




}
