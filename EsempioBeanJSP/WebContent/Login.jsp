<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<jsp:useBean id="errore" class="it.alfasoft.viviana.bean.ErroreBean" scope="request" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Login Page</h1><br>
	<h1><%=errore.getMessage() %></h1><br>
	<form action="doLogin.jsp" method="post">
			
		username: <input type="text" name="username" /> <br> 
		password: <input type="password" name="pass" /> <br> 
				<input type="submit" value="Entra" />
				<input type="hidden" name="call" value="2" />
	</form>
	<a href="formRegistrazione.jsp">pagina registrazione</a> 
	
	


</body>
</html>