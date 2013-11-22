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
	public JSONObject play( int row, int column )
	{

		//game loop
		//have current player make a move
		boolean success = makeMove( currentPlayer, row, column );

		//draw the board
		board.drawBoard();

		//update gamestate
		updateGame( currentPlayer );


		//switch player
		if( currentPlayer == Symbol.CROSS )
		{
			currentPlayer = Symbol.CIRCLE;
		}
		else
		{
			currentPlayer = Symbol.CROSS;
		}

		//json object to display the game
		JSONObject data = new JSONObject();
		data.put( "currentPlayer", currentPlayer );
		data.put( "gameState", gameState );
		data.put( "success", success );

		return data;

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
