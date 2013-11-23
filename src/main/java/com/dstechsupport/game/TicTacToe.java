package com.dstechsupport.game;

import static spark.Spark.*;
import spark.*;

/**
 *
 * Hello world! Gary Busey
 *
 */
public class TicTacToe
{
	public static Game game;

    	public static void main( String[] args )
    	{
		staticFileLocation("/public");

        	setPort(Integer.valueOf(System.getenv("PORT")));

      		game = new Game();

		//this is called when a cell is clicked
        	post(new Route( "/play" ) 
		{
            		@Override
            		public Object handle(Request request, Response response) 
			{
				String element = request.queryParams("cell");
				String s = "" + element.charAt(4);
				int cellNumber = Integer.parseInt(s);
				int row = findRow( cellNumber );
				int column = findColumn( cellNumber );
				return game.play( row, column );	
            		}
        	});

		post(new Route( "/newgame" )
                {
                        @Override
                        public Object handle(Request request, Response response)
                        {
				game = new Game();
				return "new game started";
                        }
                });

       // System.out.println( "Welcome to this game of Tic Tac Toe!" );
    	}
	// helper function to find the row of the cell
	public static int findRow( int cellNumber )
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
	public static int findColumn( int cellNumber )
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
