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

public class BoardTest extends TestCase
{

	public void testBoard()
	{
	
	    Board tester = new Board();

		for( int i = 0 ; i < tester.ROWS; i++ )	       
		{
			for( int j = 0 ; j < tester.COLUMNS; j++ )
			{
			assertEquals( "check that cell has correct coordinates", i, cells[i][j].row );
			assertEquals( "check that cell has correct coordinates", j, cells[i][j].column );
			assertEquals( "cell is empty", Symbol.EMPTY, cells[i][j].content );
			}
		}
	}

	public void testHasWon1()
	{

	}

	public void testIsDrawn()
	{
	
	}

	public void testUpdateCell()
	{

	}
}


