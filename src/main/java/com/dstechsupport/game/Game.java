package com.dstechsupport.game;

public class Game 
{
	Board board;
	Symbol currentPlayer;
	GameState gameState;

	public Game()
	{
		board = new Board();
	}

	//The main game loop
	public void  play()
	{
	}

	//Take input from player and update the board
	public void makeMove( Symbol player )
	{

	}

	//Check for win/draw conditions and update the gamestate
	public void updateGame( Symbol player )
	{
		if( board.hasWon( player ) )
		{
			if( player == Symbol.CIRCLE )
			{
				gameState = GameState.CIRLCE_WON;
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
