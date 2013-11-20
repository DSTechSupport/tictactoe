package com.dstechsupport.game;
import java.util.Scanner;


public class Game 
{
	Board board;
	Symbol currentPlayer;
	GameState gameState;

	public Game()
	{
		board = new Board();
		currentPlayer = Symbol.CROSS;
		gameState = GameState.PLAYING;
	}

	//The main game loop
	public void play()
	{
		//draw initial board
		board.drawBoard();

		//game loop
		while( gameState == GameState.PLAYING  )
		{
			//have current player make a move
			makeMove( currentPlayer  );

			//draw the board
			board.drawBoard();

			//update gamestate
			updateGame( currentPlayer );

			//output message if victory or draw has occured

			if( gameState == GameState.DRAW )
			{
				System.out.println( "The game is drawn! Thanks for playing" );
			}
			else if( gameState == GameState.CROSS_WON  )
			{
				System.out.println( "Cross has won! Thanks for playing"  );
			}
			else if( gameState == GameState.CIRCLE_WON  )
			{
				System.out.println( "Circle has won! Thanks for playing"  );
			}

			//switch player
			if( currentPlayer == Symbol.CROSS )
			{
				currentPlayer = Symbol.CIRCLE;
			}
			else
			{
				currentPlayer = Symbol.CROSS;
			}
		}
	}

	//Take input from player and update the board
	public void makeMove( Symbol player )
	{
		int chosenRow = 0;
		int chosenColumn = 0;
		boolean wrongInput = true;
		Scanner in = new Scanner(System.in);
		do
		{
			if(player == Symbol.CIRCLE)
			{
				System.out.println("CIRCLE´S TURN");
			}
			else
			{
				System.out.println("CROSS' TURN");
			}

			System.out.print("Select row first, column second\n");
			System.out.print("Row: ");
			chosenRow = in.nextInt() - 1;
			System.out.print("Column: ");
			chosenColumn = in.nextInt() - 1;
			System.out.println();

			//Checking if the user input is correct and if the cell he picked is available
			if( chosenRow < 0 || chosenRow > 2 || chosenColumn < 0 || chosenColumn > 2 )
			{
				System.out.println("Row or column input illegal, must be between 1 and 3. Try again.");
			}
			else if( !( board.cells[chosenRow][chosenColumn].content == Symbol.EMPTY ) )
			{
				System.out.println( "The cell you chose already contains a symbol, please select another." );
			}
			else
			{
				board.cells[chosenRow][chosenColumn].content = player; //Update the cell
                                wrongInput = false;
			}

		}while(wrongInput == true);
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
