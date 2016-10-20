package it.alfasoft.viviana.servizi;

import utility.CodificationOfPassword;
import it.alfasoft.viviana.bean.UtenteBean;
import it.alfasoft.viviana.dao.UtenteDao;

public class ServizioLogin {
	
	
	
	public String convertiPass(String pass){
		
		return CodificationOfPassword.codificatePass(pass);
			
	}
	
	
	public boolean isValidLogin(String username,String pass){
		
		boolean res=false;
		UtenteDao uDao=new UtenteDao();
		UtenteBean uB=uDao.getUtenteConUsername(username);
		if(uB!=null)
		{
			String passCod=convertiPass(pass);
			if(uB.getPassword().equals(passCod))
			res=true;
			
		}
		
		
		return res;
	}
}
