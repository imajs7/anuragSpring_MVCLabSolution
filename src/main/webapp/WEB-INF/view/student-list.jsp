<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Student List</title>
<link rel="stylesheet" 
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
			crossorigin="anonymous">
</head>
<body>

	<div class="container mt-3">
	
		<h3>Student List</h3>
		<a href="addstudent" class="btn btn-primary btn-sm mb-3">Add Student</a>
		
		<table class="table table-bordered table-striped">
		
			<thead class="thead-dark">
				<tr>
					<th>Id</th>
					<th>Name</th>
					<th>Department</th>
					<th>Country</th>
					<th>Action</th>
				</tr>
			</thead>
			
			<tbody>
			
				<c:forEach items="${students}" var = "student">
				
					<tr>
						<td><c:out value="${student.id}"></c:out></td>
						<td><c:out value="${student.name}"></c:out></td>
						<td><c:out value="${student.department}"></c:out></td>
						<td><c:out value="${student.country}"></c:out></td>
						<td>
							<a href="edit/${student.id}" class="btn btn-info btn-sm">Edit</a>
							<a href="delete/${student.id}" onclick="if (!(confirm('Are you sure you want to delete this student?'))) return false" class="btn btn-danger btn-sm">Delete</a>
						</td>
					</tr>
				
				</c:forEach>
				
			</tbody>
		
		</table>
	
	</div>

</body>
</html>