/*
*
* This test checks if updates of the game are done and other 
*
*
*/

package com.dstechsupport.game;

import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class GameTest extends TestCase
{
	/*
	public void testPlay()
	{
		Game lol = new Game();


		JSONObject result = new JSONObject();
		result  = lol.Play( 2, 2 );

		String currentGameState =  result.getString( "gameState" );
		String currentPlayer = result.getString( "currentPlayer" );
		String success = result.getString( "success" );

		//checking the player switched
		assertEquals( "after 1 turn current player should be CIRCLE", "CIRCLE", currentPlayer  );
		assertEquals( "after 1 turn current player should be CIRCLE", Symbol.CIRCLE, tester.currentPlayer );

		//gamestate should be playing after only 1 turn
		assertEquals( "gamestate should be PLAYING", "PLAYING", currentGameState );
		assertEquals( "gamestate should be PLAYING", GameState.PLAYING, tester.gameState );

		//success should be true if the play was successful
		assertEquals( "result should be True", "true", success );

	}*/
	// tests wrong player making a move
	public void testMakeMove()
	{
		Game tester = new Game();

		boolean result = tester.makeMove( Symbol.CIRCLE, 2, 2 );

		assertTrue( result  );
	}
	//tests current player making a move
        public void testMakeMove2()
        {
                Game tester = new Game();

                boolean result = tester.makeMove( Symbol.CROSS, 2, 2 );

                assertTrue( result );
		assertEquals( "CROSS should now be in the middle cell", Symbol.CROSS, tester.board.cells[1][1].content );
        }

	//tests making a move to a cell containing a non empty symbol
	public void testMakeMove3()
	{
		Game tester = new Game();
		tester.board.cells[0][0].content = Symbol.CROSS;
		tester.currentPlayer = Symbol.CIRCLE;

		boolean result = tester.makeMove( Symbol.CIRCLE, 1, 1 );

		assertFalse( result );
		assertEquals( " the top left cell should still be CROSS", Symbol.CROSS, tester.board.cells[0][0].content );
	}



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
		
		tester.updateGame( Symbol.CROSS );

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

		tester.updateGame( Symbol.CROSS   );

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

		tester.updateGame( Symbol.CIRCLE );

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

                tester.updateGame( Symbol.CROSS  );

                assertEquals( "Gamestate should be Playing", GameState.PLAYING, tester.gameState );

        }


}
