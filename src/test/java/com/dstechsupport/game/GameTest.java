/*
*
* This test checks if updates of the game are done and other 
*
*
*/

package com.dstechsupport.game;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameTest extends TestCase
{
	
	public void testGame()
	{
		

	}	

	public void updateGame()
	{
		//Create drawn gameboard
		Game tester = new Game();

                tester.board.cells[0][0].content = Symbol.CROSS;
                tester.board.cells[0][1].content = Symbol.CROSS;
                tester.board.cells[0][2].content = Symbol.CIRCLE;
                tester.board.cells[1][0].content = Symbol.CIRCLE;
                tester.board.cells[1][1].content = Symbol.CIRCLE;
                tester.board.cells[1][2].content = Symbol.CROSS;
                tester.board.cells[2][0].content = Symbol.CROSS;
                tester.board.cells[2][1].content = Symbol.CIRCLE;
                tester.board.cells[2][2].content = Symbol.CROSS;
		
		assertEquals( "Gamestate should be draw", GameState.DRAW, tester.gameState );

	}

}
