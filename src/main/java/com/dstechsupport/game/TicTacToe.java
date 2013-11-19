package com.dstechsupport.game;

/**
 * Hello world!
 *
 */
public class TicTacToe
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome to this game of Tic Tac Toe!" );
	Board board = new Board();
	board.drawBoard();
    }
}
