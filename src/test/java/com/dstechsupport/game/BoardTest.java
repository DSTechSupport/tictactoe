/*
*
* This test checks are supposed to test the Tic Tac Toe Board
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
				Cell current = new Cell(i,j);
				assertEquals( "check that cell has correct coordinates", i, tester.cells[i][j].row  );
				assertEquals( "check that cell has correct coordinates", j, tester.cells[i][j].column );
				assertEquals( "cell is empty", Symbol.EMPTY, tester.cells[i][j].content );
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


