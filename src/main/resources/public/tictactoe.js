var gameState = "playing";
var currentPlayer = "X";

$(document).ready(function() {
        $( "#tictactoe tr td" ).click(function ()
        {
                var cell = this
                var cellid =  $(this).attr( 'id' );
                $.ajax({
                  type: "post",
                  url: "/play",
                  data: 'cell=' + cellid
                }).done( function( data ) {
                        alert( data );
                        var results = data.split(",");

                        //if the move happened
                        //draw the current player
                        if( results[0] == 'done' )
                        {
                                console.log( "filling cell" );
                                $( cell ).children().html( currentPlayer );
                                currentPlayer = results[1];
                        }
                        else
                        {
                                console.log( "illegal move" );
                        }

                        if( results[3] != "playing" )
                        {
                                if( results[3] == "xwins" )
                                {
                                        alert( "CROSS WINS" );
                                }
                                else if( results[3] == "owins" )
                                {
                                        alert( "CIRCLE WINS" );
                                }
                                else if( results[3] == "draw" )
                                {
                                        alert( "GAME IS DRAWN" );
                                }
                        }
                });
                
        });

	$( "#newgame" ).click( function ()
        {
                $.ajax({
                  type: "post",
                  url: "/newgame",
                  data: ""
                }).done( function( data ) {
                        alert( data );
                                                
                });                
        });
});
