<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>User Management Application</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>

	<header>
		<nav class="navbar navbar-expand-md navbar-dark"
			style="background-color: blue">
			<div>
				<a href="#
				" class="navbar-brand"> User Management Application </a>
			</div>

			<ul class="navbar-nav">
				<li><a href="<%=request.getContextPath()%>/list"
					class="nav-link">Users</a></li>
			</ul>
		</nav>
	</header>
	<br>
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${member != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${member == null}">
					<form action="insert" method="post">
				</c:if>

				<caption>
					<h2>
						<c:if test="${member != null}">
            			Edit User
            		</c:if>
						<c:if test="${member == null}">
            			Add New User
            		</c:if>
					</h2>
				</caption>

				<c:if test="${member != null}">
					<input type="hidden" name="id" value="<c:out value='${member.id}' />" />
				</c:if>

				<fieldset class="form-group">
					<label>User Name</label> <input type="text"
						value="<c:out value='${member.uname}' />" class="form-control"
						name="uname" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Password</label> <input type="password"
						value="<c:out value='${member.password}' />" class="form-control"
						name=password required="required">
				</fieldset>				

				<fieldset class="form-group">
					<label>Email</label> <input type="text"
						value="<c:out value='${member.email}' />" class="form-control"
						name="email" required="required">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Address</label> <input type="text"
						value="<c:out value='${member.address}' />" class="form-control"
						name="address" required="required">
				</fieldset>
				<fieldset class="form-group">
					<label>Phone</label> <input type="text"
						value="<c:out value='${member.phone}' />" class="form-control"
						name="phone" required="required">
				</fieldset>

				<button type="submit" class="btn btn-success">Save</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>