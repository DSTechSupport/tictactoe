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
	return true;
	}
	
	public boolean isDrawn()
	{
	return true;
	}

	public void updateCell( int row, int column, Symbol s )
	{

	}
}
