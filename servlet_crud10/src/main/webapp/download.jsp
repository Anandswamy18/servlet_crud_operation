<%@page import="servlet_crud10.dto.Dto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<form>

		<%
		List<Dto> std = (List<Dto>) request.getAttribute("objects");
		%>

		<table border="">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
				<th>phone</th>
				<th>country</th>
				<th>gender</th>
				<th>dob</th>
				<th>checkbox</th>
				<th>delete</th>
				<th>edit</th>
			</tr>


			<tr>
				<%
				for (Dto l : std) {
				%>
				<td><%=l.getId()%></td>
				<td><%=l.getName()%></td>
				<td><%=l.getEmail()%></td>
				<td><%=l.getPhone()%></td>
				<td><%=l.getCountry()%></td>
				<td><%=l.getGender()%></td>
				<td><%=l.getDob()%></td>
				<td><%=l.getCheckbox()%></td>
				<td><a href="delete?id=<%=l.getId()%>">delete</a></td>
				<td><a href="update.jsp?newid=<%=l.getId()%>&&name=<%=l.getName()%>&&gender=<%=l.getGender()%>&&email=<%=l.getEmail()%>&&phone=<%=l.getPhone()%>&&country=<%=l.getCountry()%>&&dob=<%=l.getDob()%>&&checkbox=<%=l.getCheckbox()%>">update</a></td>
			</tr>
			<%
			}
			%>
		</table>
	</form>
</body>
</html>