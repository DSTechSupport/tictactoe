var gameState = "playing";
var currentPlayer = "X";

$(document).ready(function() {
        $( "#tictactoe tr td" ).click(function ()
        {
		if( gameState == "playing" )
		{
                var cell = this
                var cellid =  $(this).attr( 'id' );
		console.log( "sending cell: " + cellid );
                $.ajax({
                  type: "post",
                  url: "/play",
                  data: 'cell=' + cellid
                }).done( function( data ) {
                        console.log( data );
                        var results = data.split(",");
			console.log( results);

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

                        if( results[2] != "playing" )
                        {
                                if( results[2] == "xwins" )
                                {
                                        alert( "CROSS WINS" );
                                }
                                else if( results[2] == "owins" )
                                {
                                        alert( "CIRCLE WINS" );
                                }
                                else if( results[2] == "draw" )
                                {
                                        alert( "GAME IS DRAWN" );
                                }
                        }
			//update gamestate
			gameState = results[2];
			console.log( gameState );
                });
		}
                
        });
	

	$( "#newgame" ).click( function ()
        {
                $.ajax({
                  type: "post",
                  url: "/newgame",
                  data: ""
                }).done( function( data ) {
			gameState = "playing";
			currentPlayer = "X";
                        alert( data );
			$( "#tictactoe tr td" ).children().html( "" );
                                                
                });                
        });
});
