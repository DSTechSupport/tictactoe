package com.dstechsupport.game;

public class Cell
{
	public Symbol content;
	public int column;
	public int row;

	public Cell( int _column, int _row )
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
			System.out.println(" O ");
		}
		else if ( content == Symbol.CROSS )
		{
			System.out.println(" X ");
		}
		else //content is empty
		{
			System.out.println("   ");
		}
	
	}
}
