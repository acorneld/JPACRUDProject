<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Details</title>
</head>

<body>

	<div class="container-fluid">
		<h1>Team Details</h1>

		<div>
			<h4>${team.name}(${team.rank})</h4>
			<p>
				Average Age: ${team.averageAge} <br> Coach: ${team.coach} <br>
				Star Player: ${team.starPlayer}
			</p>
		</div>

	</div>
	
	<div>
		<a href="/"class="btn btn-lg btn-success">Home</a>
	</div>
	
</body>
</html>