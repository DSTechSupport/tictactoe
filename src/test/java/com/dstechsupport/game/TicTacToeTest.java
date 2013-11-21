package com.dstechsupport.game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TicTacToeTest
    extends TestCase
{
	public void testFindRow()
	{
		TicTacToe tester = new TicTacToe();

		int result = tester.findRow( 1 );

		assertEquals( "this is in row 1", 1, result );
	}

	public void testFindRow2()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findRow( 5 );

                assertEquals( "this is in row 2", 2, result );
        }


	public void testFindRow3()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findRow( 9 );

                assertEquals( "this is in row 3", 3, result );
        }


	public void testFindRow4()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findRow( 6 );

                assertEquals( "this is in row 2", 2, result );
        }

	public void testFindColumn()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findColumn( 6 );

                assertEquals( "this is in column 3", 3, result );
        }

        public void testFindColumn2()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findColumn( 7 );

                assertEquals( "this is in column 1", 1, result );
        }

        public void testFindColumn3()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findColumn( 9 );

                assertEquals( "this is in column 3", 3, result );
        }

        public void testFindColumn4()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findColumn( 2 );

                assertEquals( "this is in column 2", 2, result );
        }

        public void testFindColumn5()
        {
                TicTacToe tester = new TicTacToe();

                int result = tester.findColumn( 1 );

                assertEquals( "this is in column 1", 1, result );
        }



}
