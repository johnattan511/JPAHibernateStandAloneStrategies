package Principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import POJOS.Futbolista;
import POJOS.Metalero;
import POJOS.Persona;

public class Principal {
	
   public static void main(String[] args){
	   
	   EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJPAStrategiesEjercicio");
	   EntityManager em = emf.createEntityManager();
	   
	   em.getTransaction().begin();
	   
	   Persona persona = new Persona();
       persona.setNombre("Johnattan Zambrano");	  
       persona.setEdad("29");
       persona.setCorreo("johnalexander_88@hotmail.com");
       
       Metalero metalero = new Metalero();
	   metalero.setNombre("James Hitfield");	  
	   metalero.setEdad("55");
	   metalero.setCorreo("metalica@hotmail.com");
	   metalero.setBandaFavorita("Iron Maiden");
	   metalero.setInstrumentoFavorito("Guitarra Electrica");
	   
	   Futbolista futbolista = new Futbolista();
	   futbolista.setNombre("Didier Drogba");	  
	   futbolista.setEdad("42");
	   futbolista.setCorreo("chelsea@hotmail.com");
	   futbolista.setEquipoDondeJuega("No Juega");
	   futbolista.setEquipoFavorito("Chelsea");
       
       em.persist(persona);
       em.persist(metalero);
       em.persist(futbolista);
       
       em.getTransaction().commit();
       
       em.close();
       emf.close();

   }
}
