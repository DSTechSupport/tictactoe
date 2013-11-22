var gameState = "playing";
var currentPlayer = "cross";

$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.ajax(
		{
			type: "POST",
			url: "/play",
			data: 'cell=' + cell
			dataType: 'json'
        	}).done( function( data ) 
		{
			$('#cell').html( "12" );
			alert( data[0].gameState );
        	});
		
	});
  });
