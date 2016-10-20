package it.alfasoft.viviana.dao;
import it.alfasoft.viviana.bean.UtenteBean;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import HibernateUtil.HibernateUtil;


public class UtenteDao {
	// 1- Create 

		public boolean inserisciUtente(UtenteBean u){
			
			boolean res=false;
			
			Session session=HibernateUtil.openSession();
			
			Transaction tx=null;

			try{

				tx=session.getTransaction();

				tx.begin();

				session.persist(u); 

				tx.commit(); 
				res=true;
			}catch(Exception ex){

				tx.rollback();

			}finally{
				session.close();
			}
			return res;

		}
		
		//2-a R:Read uno
		public UtenteBean getUtenteConUsername(String username){
			UtenteBean u=null;
			
			Session session=HibernateUtil.openSession();
			Transaction tx=null;
			try{
				
				tx=session.getTransaction();
				tx.begin();


				Query query = session
						.createQuery("from UtenteBean where username=:userInserito");

				query.setString("userInserito", username);
				

				u = (UtenteBean) query.uniqueResult();

				tx.commit();

			} catch (Exception ex) {

				tx.rollback();

			} finally {
				session.close();
			}

			return u;

		}
		
		
//		//4-Update
//		public boolean aggiornaUtente(Utente uVecchio,Utente uNuovo){
//			boolean bool=false;
//			Session session=HibernateUtil.openSession();
//			Transaction tx=null;
//			
//			try{
//				tx=session.getTransaction();
//				tx.begin();
//				Query q=session.createQuery("from Utente where id_utente=:idVecchio");
//				q.setLong("idVecchio", uVecchio.getId_utente());
//				Utente u = (Utente) q.uniqueResult();
//				u.setNome(uNuovo.getNome());
//				u.setCognome(uNuovo.getCognome());
//				
//				session.update(u);
//				tx.commit();
//				bool=true;
//			}catch (Exception ex){
//				tx.rollback();
//			}finally{
//				session.close();
//			}
//			
//			
//			return bool;
//		}
//		
//		//5-delete
//		
//		public boolean rimuoviUtente(Utente u){
//			boolean bool=false;
//			Session session=HibernateUtil.openSession();
//			Transaction tx=null;
//			Utente u1=null;
//			try{
//				tx=session.getTransaction();
//				tx.begin();
//				Query q=session.createQuery("from Utente where id_utente=:idInserito ");
//				q.setLong("idInserito", u.getId_utente());
//				u1=(Utente) q.uniqueResult();
//				session.delete(u1);
//				tx.commit();
//				bool=true;
//				
//				
//			}catch(Exception ex){
//				tx.rollback();
//			}finally{
//			   session.close();
//			}
//			return bool;
//			
//		}
}
