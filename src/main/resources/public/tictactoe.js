var gameState = "playing";
var currentPlayer = "cross";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.post("play/", 'cell' + cell, function( data, textStatus ) {
  			//data contains the JSON object
  			//textStatus contains the status: success, error, etc
			alert( data.gameState );
		}, "json");
		
	});
  });
