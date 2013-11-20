package com.dstechsupport.game;
import static spark.Spark.*;
import spark.*;
/**
 *
 *
 */
public class TicTacToe
{
    public static void main( String[] args )
    {
	staticFileLocation("/public");
        
        setPort(Integer.valueOf(System.getenv("PORT")));

        get(new Route("/hello") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World!";
            }
        });
        
        post(new Route("/add") {
            @Override
            public Object handle(Request request, Response response) {
                Integer a = Integer.valueOf(request.queryParams("a"));
                Integer b = Integer.valueOf(request.queryParams("b"));
                return a + b;
            }
        });


        System.out.println( "Welcome to this game of Tic Tac Toe!" );

	Game game = new Game();

	game.play();


    }
}
