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
		Game tester = new Game();

		assertEquals( "Gamestate should be Playing", GameState.PLAYING, tester.gameState );
		assertEquals( "Current player should be Cross", Symbol.CROSS, tester.currentPlayer );

	}	

	public void testUpdateGame()
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
		
		tester.updateGame( tester.currentPlayer );

		assertEquals( "Gamestate should be draw", GameState.DRAW, tester.gameState );

	}

        public void testUpdateGame2()
        {
                //Create gameboard where CROSS is the winner
                Game tester = new Game();

                tester.board.cells[0][0].content = Symbol.CROSS;
                tester.board.cells[0][1].content = Symbol.CROSS;
                tester.board.cells[0][2].content = Symbol.CROSS;
                tester.board.cells[1][0].content = Symbol.CIRCLE;
                tester.board.cells[1][1].content = Symbol.CIRCLE;
                tester.board.cells[1][2].content = Symbol.CROSS;
                tester.board.cells[2][0].content = Symbol.CIRCLE;
                tester.board.cells[2][1].content = Symbol.CIRCLE;
                tester.board.cells[2][2].content = Symbol.CROSS;

		tester.updateGame( tester.currentPlayer );

                assertEquals( "Gamestate should be Cross won", GameState.CROSS_WON, tester.gameState );

        }

        public void testUpdateGame3()
        {
                //Create gameboard where Circle is winner
                Game tester = new Game();

                tester.board.cells[0][0].content = Symbol.CROSS;
                tester.board.cells[0][1].content = Symbol.CROSS;
                tester.board.cells[0][2].content = Symbol.CIRCLE;
                tester.board.cells[1][0].content = Symbol.EMPTY;
                tester.board.cells[1][1].content = Symbol.CIRCLE;
                tester.board.cells[1][2].content = Symbol.CROSS;
                tester.board.cells[2][0].content = Symbol.CIRCLE;
                tester.board.cells[2][1].content = Symbol.CIRCLE;
                tester.board.cells[2][2].content = Symbol.CROSS;

		tester.updateGame( tester.currentPlayer );

                assertEquals( "Gamestate should be Circle won", GameState.CIRCLE_WON, tester.gameState );

        }

	        public void testUpdateGame4()
        {
                //Create gameboard where gamestate is Playing
                Game tester = new Game();

                tester.board.cells[0][0].content = Symbol.EMPTY;
                tester.board.cells[0][1].content = Symbol.EMPTY;
                tester.board.cells[0][2].content = Symbol.EMPTY;
                tester.board.cells[1][0].content = Symbol.EMPTY;
                tester.board.cells[1][1].content = Symbol.CROSS;
                tester.board.cells[1][2].content = Symbol.CIRCLE;
                tester.board.cells[2][0].content = Symbol.EMPTY;
                tester.board.cells[2][1].content = Symbol.EMPTY;
                tester.board.cells[2][2].content = Symbol.EMPTY;

                tester.updateGame( tester.currentPlayer );

                assertEquals( "Gamestate should be Playing", GameState.PLAYING, tester.gameState );

        }


}
