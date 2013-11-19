package com.dstechsupport.game;

public class Cell
{
	Symbol content;
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
	
	}
}
