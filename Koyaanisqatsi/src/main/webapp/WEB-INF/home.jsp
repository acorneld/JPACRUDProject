<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CSGO Teams</title>
</head>
<body>


	<main class="container-fluid"></main>
	<h1>Welcome to the CSGO Team Database</h1>

	<form action="getTeam.do" method="GET">
		Search Team ID <input type="text" name="id" /> <input type="submit"
			value="Show Team" />
	</form>
	
	<form action="update.do" method="GET">
	Enter Team ID to Update <input type="text" name="id" /> <input type="submit"
			value="Update Team" />
	</form>
	
	<br>

	<div>
		<button class="button" onclick="document.location = 'addteam.html'">Add
			A New Team</button>
	</div>
	
	<div>
		<button class="button" onclick="document.location = 'deleteteam.html'">Delete
			Team</button>
	</div>
	
	<!-- <div>
		<button class="button" onclick="document.location = 'updateteam.html'">Update
			Team</button>
	</div> -->
	
	





	<table class="table table-striped">
			<thead class="table-dark">
				<tr>
					<th>ID</th>
					<th>Name</th>
				<!-- 	<th>Rank</th>
					<th>Average Age</th>
					<th>Coach</th>
					<th>Star Player</th> -->
				</tr>
			</thead>
			<tbody>
				<c:forEach var="t" items="${teams}">
					<tr>
						<td>${t.id}</td>
						<td><a href="getTeam.do?id=${t.id}">${t.name}</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</main>

</body>
</html>