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

      	//Game game = new Game();


        post(new Route("/play") {
            	@Override
            	public Object handle(Request request, Response response) {
			String element = request.queryParams("cell");
			String s;
			s = "" + element.charAt(4);
			int cellNumber = Integer.parseInt(s);
                	return "hello " +  cellNumber;
            	}
        });
       // System.out.println( "Welcome to this game of Tic Tac Toe!" );




    }
}
