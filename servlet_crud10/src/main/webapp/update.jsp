<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="update" method="post">

id:<input type="number" name="newid" value="<%=request.getParameter("newid")%>" readonly="readonly"><br><br>
name:<input type="text" name="name" value="<%=request.getParameter("name")%>"><br><br>
email:<input type="email" name="email" value="<%=request.getParameter("email")%>"><br><br>
phone:<input type="tel" name="phone" value="<%=request.getParameter("phone")%>"><br><br>
country:<input type="text" name="country" value="<%=request.getParameter("country")%>"><br><br>
gender: male<input type="radio" name="gender" value="male" value="<%=request.getParameter("gender")%>">
female<input type="radio" name="gender" value="female" value="<%=request.getParameter("gender")%>">
<br><br>
dob:<input type="date" name="dob" value="<%=request.getParameter("dob")%>"><br><br>
checkbox:<input  value="accepted" type="checkbox" name="checkbox" value="<%=request.getParameter("checkbox")%>"><br><br>

<button>submit</button>


</form>

</body>
</html>