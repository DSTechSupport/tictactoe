var gameState = "playing";
var currentPlayer = "X";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
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
				alert( "filling cell" );
				$( cell ).html( currentPlayer );
				currentPlayer = results[1];
			}
			else
			{
				alert( "you fucked up" );
			}
			

		});
		
	});
});
