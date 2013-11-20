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
	}

	//The main game loop
	public void play()
	{
	}

	//Take input from player and update the board
	public void makeMove( Symbol player )
	{
		int chosenRow;
		int chosenColumn;
		Scanner in = new Scanner(System.in);

		if(player == Symbol.CIRCLE)
		{
			System.out.print("CIRCLE´S TURN");
			do
			{

			System.out.print("Select row first, column second");
			chosenRow = in.nextInt();
			chosenColumn = in.nextInt();
			chosenRow = chosenRow - 1;
			chosenColumn = chosenColumn - 1;
			System.out.println("Row or column input illegal, must be between 1 and 3. Try again.");
	
			}while(chosenRow < 0 || chosenRow > 2 || chosenColumn < 0 || chosenColumn > 2);
		}
		else // Player symbol is CROSS
		{
                if(player == Symbol.CROSS)
                {
                        System.out.print("CROSS' TURN");
                        do
                        {

                        System.out.print("Select row first, column second");
                        chosenRow = in.nextInt();
                        chosenColumn = in.nextInt();
			chosenRow = chosenRow - 1;
                        chosenColumn = chosenColumn - 1;
                        System.out.println("Row or column input illegal, must be between 1 and 3. Try again.");

                        }while(chosenRow < 0 || chosenRow > 2 || chosenColumn < 0 || chosenColumn > 2);

		}
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
