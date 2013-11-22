package com.dstechsupport.game;
import com.dstechsupport.game.*;

import java.util.Scanner;
import java.lang.*;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

public class Game 
{
	public Board board;
	public Symbol currentPlayer;
	public GameState gameState;

	public Game()
	{
		board = new Board();
		currentPlayer = Symbol.CROSS;
		gameState = GameState.PLAYING;
	}

	//The main game loop
	public String play( int row, int column )
	{
		StringBuilder data = new StringBuilder();

		//game loop
		//have current player make a move
		boolean success = makeMove( currentPlayer, row, column );

		//draw the board
		board.drawBoard();

		//update gamestate
		updateGame( currentPlayer );


		//switch player
		//append if move is successful and current player to string
		if( success )
		{
			data.append( "done" );
			if( currentPlayer == Symbol.CROSS )
			{
				currentPlayer = Symbol.CIRCLE;
				data.append( ",O" );
			}
			else
			{
				currentPlayer = Symbol.CROSS;
				data.append( ",X" );
			}
		}
		else
		{
			data.append( "not,E" );
		}

		//append gamestate to string
		if( gameState == GameState.PLAYING )
		{
			data.append( ",playing" );
		}
		else if( gameState == GameState.CROSS_WON )
		{
			data.append( ",xwins" );
		}
		else if( gameState == GameState.CIRCLE_WON )
                {
                        data.append( ",owins" );
                }
		else //( gameState == GameState.DRAW )
                {
                        data.append( ",draw" );
                }


		//json object to display the game

		return data.toString();
	}

	//Take input from player and update the board
	//updates the cell and returns true if the cell is empty
	//returns false otherwise
	public boolean makeMove( Symbol player, int row, int column )
	{
		int chosenRow = row - 1;
		int chosenColumn = column - 1;
		//Checking if the user input is correct and if the cell he picked is available
		if( chosenRow < 0 || chosenRow > 2 || chosenColumn < 0 || chosenColumn > 2 )
		{
			return false;
		}
		else if( !( board.cells[chosenRow][chosenColumn].content == Symbol.EMPTY ) )
		{
			return false;
		}
		else
		{
			if( currentPlayer == Symbol.CROSS )
			{ 
				board.updateCell( chosenRow, chosenColumn, Symbol.CROSS  );
			}
			else
			{
				board.updateCell(chosenRow,chosenColumn, Symbol.CIRCLE );
			}
			return true;
		}

	}

	//Check for win/draw conditions and update the gamestate
	public void updateGame( Symbol player )
	{
		if( board.hasWon( player ) )
		{
			if( player == Symbol.CIRCLE )
			{
				gameState = GameState.CIRCLE_WON;
			}
			else // (player == Symbol.CROSS)
			{
				gameState = GameState.CROSS_WON;
			}
		}
		else if( board.isDrawn() )
		{
			gameState = GameState.DRAW;
		}
		else
		{
			return;
		}
	}	
}
