/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
import entity.Personas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class PersonasFacade implements PersonasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Personas personas) {
        em.persist(personas);
    }

    public void edit(Personas personas) {
        em.merge(personas);
    }

    public void remove(Personas personas) {
        em.remove(em.merge(personas));
    }

    public Personas find(Object id) {
        return em.find(Personas.class, id);
    }

    public List<Personas> findAll() {
        return em.createQuery("select object(o) from Personas as o").getResultList();
    }
     public List<Personas> buscar(String nombre,String campo, String orden){
       if(campo.equals("Nombre")){
        if(orden.equals("Desc")){
              System.out.println("Entro por desc");
          return em.createQuery("SELECT p FROM Personas p WHERE p.nombres LIKE :nombres ORDER BY p.nombres DESC").setParameter("nombres", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Personas p WHERE p.nombres LIKE :nombres ORDER BY p.nombres ASC").setParameter("nombres", nombre).getResultList();
    }

}
    if(campo.equals("Apellido")){
      if(orden.equals("Desc")){
              System.out.println("Entro por desc");
          return em.createQuery("SELECT p FROM Personas p WHERE p.apellido LIKE :apellido ORDER BY p.apellido DESC").setParameter("apellido", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Personas p WHERE p.apellido LIKE :apellido ORDER BY p.apellido ASC").setParameter("apellido", nombre).getResultList();
    }
    }
        if(campo.equals("DNI")){
         if(orden.equals("Desc")){
              System.out.println("Entro por desc");
          return em.createQuery("SELECT p FROM Personas p WHERE p.cuilcuit LIKE :cuilcuit ORDER BY p.cuilcuit DESC").setParameter("cuilcuit", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Personas p WHERE p.cuilcuit LIKE :cuilcuit ORDER BY p.cuilcuit ASC").setParameter("cuilcuit", nombre).getResultList();
    }

        }
        if(orden.equals("Asc")){
    return this.ordenarAsc();}

    return this.ordenarDesc();


    }

    public void  borrar(int p){
        Personas pr = this.find(p);
    this.remove(pr);
    }



        public List<Personas> buscarLoc(Localidades loc, String orden){
        if(orden.equals("Desc")){
              System.out.println("Entro por desc");
          return em.createQuery("SELECT p FROM Personas p WHERE p.LocalidadesId LIKE :LocalidadesId ORDER BY p.nombre DESC").setParameter("LocalidadesId", loc).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Personas p WHERE p.LocalidadesId LIKE :LocalidadesId ORDER BY p.LocalidadesId ASC").setParameter("LocalidadesId", loc).getResultList();
    }
     return em.createQuery("SELECT p FROM Personas p WHERE p.LocalidadesId LIKE :LocalidadesId").setParameter("LocalidadesId", loc).getResultList();
}

    public List<Personas> ordenarAsc() {
        return em.createQuery("SELECT p FROM Personas p ORDER BY p.apellido ASC").getResultList();
    }
    public List<Personas> ordenarDesc() {
        return em.createQuery("SELECT p FROM Personas p ORDER BY p.apellido DESC").getResultList();
    }


    public List<Personas> listar(String orden){

        if(orden.equals("Asc")){
       List<Personas> lista = em.createQuery("SELECT p FROM Personas p ORDER BY p.apellido ASC").getResultList();}
        if(orden.equals("Desc")){
       List<Personas> lista = em.createQuery("SELECT p FROM Personas p ORDER BY p.apellido DESC").getResultList();}

       List<Personas> lista = this.findAll();
        return lista;
    }

}
