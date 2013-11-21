package com.dstechsupport.game;

import static spark.Spark.*;
import spark.*;

/**
 * Hello world!
 *
 */
public class TicTacToe
{
    public static void main( String[] args )
    {
        get(new Route("/hello") {
                @Override
                public Object handle(Request request, Response response) {
                return "Hello World!";
                }
        });
        System.out.println( "Welcome to this game of Tic Tac Toe!" );

        Game game = new Game();

        game.play();


    }
}
