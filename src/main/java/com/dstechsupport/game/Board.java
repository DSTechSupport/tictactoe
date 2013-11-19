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

	}

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
	return true;
	}

	public void updateCell( int row, int column, Symbol s )
	{

	}
}
