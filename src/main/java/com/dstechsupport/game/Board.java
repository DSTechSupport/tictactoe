package com.dstechsupport.game;

public class Board
{
	public Cell[][] cells;
	public static final int ROWS = 3;
	public static final int COLUMNS = 3;


	public Board()
	{
		cells = new Cell[ROWS][COLUMNS];
		// Initializing Cells
		for(int i = 0; i < ROWS; i++)
			{
				for(int j = 0; j < COLUMNS; j++)
				{
					cells[i][j] = new Cell(i,j);
				}
			}
	}
	
	public void drawBoard()
	{
		System.out.println("    1   2   3");
		System.out.println("  -------------");
		for(int i = 0; i < ROWS; i++)
                {
			System.out.print(i+1 + " ");
			 for(int j = 0; j < COLUMNS; j++)
                                {
					System.out.print("|");
					cells[i][j].draw();
					//if (j < COLUMNS - 1) System.out.print("|");
                                }
				System.out.print("|");
				System.out.print("\n");
                }
		System.out.println("  -------------");

	}

	// Since there are only 8 possible ways of winning we list them all
	public boolean hasWon( Symbol player )
	{
		if( cells[0][0].content == player && cells[1][0].content == player && cells[2][0].content == player )
		{
			return true;
		}
		else if( cells[0][1].content == player && cells[1][1].content == player && cells[2][1].content == player )
		{
			return true;
		}
		else if( cells[0][2].content == player && cells[1][2].content == player && cells[2][2].content == player )
		{
			return true;
		}
		else if( cells[0][0].content == player && cells[0][1].content == player && cells[0][2].content == player )
		{
			return true;
		}
		else if( cells[1][0].content == player && cells[1][1].content == player && cells[1][2].content == player )
		{
			return true;
		}
	        else if( cells[2][0].content == player && cells[2][1].content == player && cells[2][2].content == player )
	        {
			return true;
		}
	        else if( cells[0][0].content == player && cells[1][1].content == player && cells[2][2].content == player )
		{		
			return true;
		}
		else if( cells[2][0].content == player && cells[1][1].content == player && cells[0][2].content == player )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isDrawn()
	{
	// We run through all the board and check indivitual cells if they are empty
	                for( int i = 0; i < ROWS; i++ )
                        {
                                for( int j = 0; j < COLUMNS; j++ )
                                {
					if( cells[i][j].content == Symbol.EMPTY )
					{
						return false;
					}
                                }
                        }
		return true;
		
	}

	public void updateCell( int row, int column, Symbol s )
	{
		cells[row][column].content = s;
	}
}
