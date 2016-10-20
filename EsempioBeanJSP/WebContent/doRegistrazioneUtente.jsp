<%@page import="it.alfasoft.viviana.servizi.ServizioRegistrazione"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="utente" class="it.alfasoft.viviana.bean.UtenteBean" scope="request" />

<jsp:setProperty property="*" name="utente" />

<%
	ServizioRegistrazione su = new ServizioRegistrazione();
	if (utente.isValid() == true) {
		//allora registrzione con successo
		//prendo la password che è stata inserita
		String pass= utente.getPassword();
		// lo modifica con algoritmo di codifica
    	pass=su.convertiPass(pass);
    	
    	// lo setto di nuovo dentro bean 
    	
    	utente.setPassword(pass);
    	
    	// e dopo salvo utente dentro db 
    
    	su.registraUtente(utente);
		
%>
<jsp:forward page="RegistrazioneConSuccesso.jsp" />

<%
	} else {

		//torna alla pagina login
	
%>

<jsp:forward page="formRegistrazione.jsp" />

<%
	}
%>