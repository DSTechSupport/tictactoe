$(document).ready(function() {
	$("#tictactoe tr td").click(function ()
	{
		var cell = $(this).attr( 'id' );
		$.ajax(
		{
			type: "GET",
			url: "/play",
			data: 'cell=' + cell
        	}).done( function( data ) 
		{
			$('#cell').html( data );
        	});
		alert(cell);
	});
  });
