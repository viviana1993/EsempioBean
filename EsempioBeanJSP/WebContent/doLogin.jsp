<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import="it.alfasoft.viviana.servizi.ServizioLogin"%>

<jsp:useBean id="utente" class="it.alfasoft.viviana.bean.UtenteBean" scope="request" />

<jsp:useBean id="errore" class="it.alfasoft.viviana.bean.ErroreBean" scope="request" />

<jsp:setProperty property="*" name="utente" />


<% 
	String call=request.getParameter("call");
if(call==null){
	%>
	<jsp:forward page="Login.jsp" />
<%
}else{
	
	String user =request.getParameter("username");
	String password =request.getParameter("pass");
	
	ServizioLogin sl = new ServizioLogin();
	
	if(sl.isValidLogin(user,password)==true){
		
		%>
		<jsp:forward page="welcome.jsp" />
	
	<%
	}else {
		errore.setMessage("user o pass errati");
	}
		}%>
	<jsp:forward page="Login.jsp" />
	





