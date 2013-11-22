var gameState = "playing";
var currentPlayer = "cross";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.ajax({
       	   	type: "post",
          	url: "/play",
          	data: 'cell=' + cell
        	}).done( function( result ) {
			alert( result );

		});
		
	});
});
