package com.dstechsupport.game;
import com.dstechsupport.game.*;

/*
*
* Class that updates the cells in tictactoe
*
*/

public class Cell
{
	public Symbol content;
	public int column;
	public int row;

	public Cell( int _row, int _column )
	{
	    content = Symbol.EMPTY;
	    column = _column;
	    row = _row;
	}

	public void updateCell( Symbol newSymbol )
	{
	    content = newSymbol;
	}

	public void draw()
	{
		if( content  == Symbol.CIRCLE )
		{
			System.out.print(" O ");
		}
		else if ( content == Symbol.CROSS )
		{
			System.out.print(" X ");
		}
		else //content is empty
		{
			System.out.print("   ");
		}
	
	}
}
