var gameState = "playing";
var currentPlayer = "X";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.ajax({
       	   	type: "post",
          	url: "/play",
          	data: 'cell=' + cell
        	}).done( function( data ) {
			alert( data );
			var results = data.split(",");

			//if the move happened
			//draw the current player
			if( results[0] == 'done' )
			{
				alert( "filling cell" );
				$( "#" + cell + " " +  button ).html( currentPlayer );
				currentPlayer = results[1];
			}
			else
			{
				alert( "you fucked up" );
			}
			

		});
		
	});
});
