<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Team Updater</title>
</head>
<body>


<form action="updateTeam.do" method="POST">
	
	<input type = "hidden" name="id" value="${team.id}"/>
	<label for="name">Team Name</label> <input type="text" placeholder="REQUIRED" name="name"/>
	<br>
	<label for="rank">Current Rank</label><input type ="text" placeholder="REQUIRED" name="rank"/>
	<br>
	<label for="averageAge">Average Age</label><input type="text" placeholder="REQUIRED LONG" name="averageAge"/>
	<br>
	<label for="coach">Coach</label><input type="text" name="coach"/>
	<br>
	<label for="starPlayer">Star Player</label><input type="text" name="starPlayer"/>
	
	<input type ="submit" value="Submit">
	
	<div>
		<a href="/"class="btn btn-lg btn-success">Home</a>
	</div>
	
	</form>


</body>
</body>
</html>