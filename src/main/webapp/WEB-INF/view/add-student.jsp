<%@page import="com.springfest.model.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Save Student</title>
<link rel="stylesheet" 
			href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
			integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
			crossorigin="anonymous">
</head>
<body>

	<div class="container mt-3">
	
		<h3>Save Student</h3>
		
		<form action="${pageContext.request.contextPath }/save" method="POST">
			<input type="hidden" name ="id" value="${student.id}" />
			<div class="form-inline">
				<input type="text" name ="name" value="${student.name}" placeholder="Student name" class="form-control mb-4 col-4" />
			</div>
			<div class="form-inline">
				<input type="text" name ="department" value="${student.department}" placeholder="Department name" class="form-control mb-4 col-4" />
			</div>
			<div class="form-inline">
				<input type="text" name ="country" value="${student.country}" placeholder="Student country" class="form-control mb-4 col-4" />
			</div>
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		
		<a href="home">Back to Student list</a>
		
	</div>

</body>
</html>