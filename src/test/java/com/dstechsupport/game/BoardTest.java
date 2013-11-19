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
	
		//Testing winning conditions for horizontal row
		Board tester = new Board();

		tester.cells[0][0].content = Symbol.CROSS;
		tester.cells[0][1].content = Symbol.CROSS;
		tester.cells[0][2].content = Symbol.CROSS;

		assertTrue( tester.hasWon( Symbol.CROSS ));		
	}

        public void testHasWon2()
        {

		//Testing winning conditions for diagonal row
                Board tester = new Board();

                tester.cells[0][0].content = Symbol.CROSS;
                tester.cells[1][1].content = Symbol.CROSS;
                tester.cells[2][2].content = Symbol.CROSS;

                assertTrue( tester.hasWon( Symbol.CROSS ));
        }

        public void testHasWon3()
        {

		//Testing winning conditions for vertical row
                Board tester = new Board();

                tester.cells[0][1].content = Symbol.CROSS;
                tester.cells[1][1].content = Symbol.CROSS;
                tester.cells[2][1].content = Symbol.CROSS;

                assertTrue( tester.hasWon( Symbol.CROSS ));
        }


	public void testIsDrawn()
	{
	
		Board tester = new Board();

		tester.cells[0][0].content = Symbol.CROSS; 
		tester.cells[0][1].content = Symbol.CROSS;
		tester.cells[0][2].content = Symbol.CIRCLE;
		tester.cells[1][0].content = Symbol.CIRCLE;
		tester.cells[1][1].content = Symbol.CIRCLE;
		tester.cells[1][2].content = Symbol.CROSS;
		tester.cells[2][0].content = Symbol.CROSS;
		tester.cells[2][1].content = Symbol.CIRCLE;
		tester.cells[2][2].content = Symbol.CROSS;

		assertTrue ( tester.isDrawn() );

	}

 	public void testIsDrawn2()
        {

                Board tester = new Board();

                tester.cells[0][0].content = Symbol.CROSS;
                tester.cells[0][1].content = Symbol.CROSS;
                tester.cells[0][2].content = Symbol.CIRCLE;
                tester.cells[1][0].content = Symbol.CIRCLE;
                tester.cells[1][1].content = Symbol.CIRCLE;
                tester.cells[1][2].content = Symbol.CROSS;
                tester.cells[2][0].content = Symbol.EMPTY;
                tester.cells[2][1].content = Symbol.EMPTY;
                tester.cells[2][2].content = Symbol.EMPTY;

                assertFalse ( tester.isDrawn() );

        }


	public void testUpdateCell()
	{

	}
}


