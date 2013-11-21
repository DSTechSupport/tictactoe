package com.dstechsupport.game;

import static spark.Spark.*;
import spark.*;

/**
 *
 * Hello world!
 *
 */
public class TicTacToe
{
    	public static void main( String[] args )
    	{
		staticFileLocation("/public");

        	setPort(Integer.valueOf(System.getenv("PORT")));

      		Game game = new Game();

		//this is called when a cell is clicked
        	post(new Route("/play") 
		{
            		@Override
            		public Object handle(Request request, Response response) 
			{
				String element = request.queryParams("cell");
				String s;
				s = "" + element.charAt(4);
				int cellNumber = Integer.parseInt(s);
                		return "hello " +  cellNumber;

				// feed the co-ordinates of the cell that was clicked
				// to the game instance			
            		}
        	});
       // System.out.println( "Welcome to this game of Tic Tac Toe!" );
    	}
	// helper function to find the row of the cell
	public int findRow( int cellNumber )
	{
        	if( cellNumber < 4 )
               	{
                        return 1;
               	}
		else if( cellNumber < 8 )
		{
			return 2;
		}
		else
		{
			return 3;
		}
	}

	// helper function to find the row of the cell
	public int findColumn( int cellNumber )
	{
		if( ( cellNumber % 3 ) == 1 )
		{
			return 1;
		}
		else if( ( cellNumber % 3 ) == 2 )
                {
                        return 2;
                }
		else
                {
                        return 3;
                }
	}
}
