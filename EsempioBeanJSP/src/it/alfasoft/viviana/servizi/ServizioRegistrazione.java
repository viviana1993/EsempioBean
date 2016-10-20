package it.alfasoft.viviana.servizi;

import utility.CodificationOfPassword;
import it.alfasoft.viviana.dao.UtenteDao;
import it.alfasoft.viviana.bean.UtenteBean;

public class ServizioRegistrazione {
	
	UtenteDao uDao=new UtenteDao();
	public boolean registraUtente(UtenteBean u){
		
		return uDao.inserisciUtente(u);
		
	}
	
	
	public String convertiPass(String pass){
		
		return CodificationOfPassword.codificatePass(pass);
			
	}

	
	
}
