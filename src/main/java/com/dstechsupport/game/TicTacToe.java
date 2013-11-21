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
	//game.play();



        get(new Route("/hello") {
                @Override
                public Object handle(Request request, Response response) {
                return "Hello World!";
                }
        });

	
        post(new Route("/play") {
            	@Override
            	public Object handle(Request request, Response response) {
                	String cell  = request.queryParams("cell");
                	return cell;
            	}
        });
       // System.out.println( "Welcome to this game of Tic Tac Toe!" );




    }
}
