<html>
<head>
	<title>bl</title>
	<style type="text/css">
		div{
		position: absolute;
		left: 100px;
		top: 200px;
		background-color: #f1f1f1;
		width: 180px;
		padding: 10px;
		color: black;
		border: #0000cc 2px dashed;
		display: none;
		}
	</style>
	<script>
		function setVisibility(id, visibility){
			document.getElementById(id).style.display = visibility;
		}
	</script>
</head>
<body>

<input type=button name=type value='Show Layer' onclick="setVisibility('sub3', 'inline'); setVisibility('sub4', 'none');">
<input type=button name=type value='Hide Layer' onclick="setVisibility('sub3', 'none'); setVisibility('sub4', 'inline');">

<div id="sub3">Message Box</div>
<div id="sub4">blass</div>

<h2>Hello World!</h2>
</body>
</html>
