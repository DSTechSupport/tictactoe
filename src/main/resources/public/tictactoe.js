var gameState = "playing";
var currentPlayer = "cross";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.getJSON( "play/", 'cell' + cell, function( data ) {
  			//data contains the JSON object
			alert( data.gameState );
		});
		
	});
  });
