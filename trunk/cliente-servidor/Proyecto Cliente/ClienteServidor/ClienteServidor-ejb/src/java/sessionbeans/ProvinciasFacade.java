/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Provincias;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class ProvinciasFacade implements ProvinciasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Provincias provincias) {
        em.persist(provincias);
    }

    public void edit(Provincias provincias) {
        em.merge(provincias);
    }

    public void remove(Provincias provincias) {
        em.remove(em.merge(provincias));
    }

    public Provincias find(Object id) {
        return em.find(Provincias.class, id);
    }

    public List<Provincias> findAll() {
        return em.createQuery("select object(o) from Provincias as o").getResultList();
    }
        public boolean darAlta(String nombre){
        if(!nombre.equals("")){
        Provincias p = new Provincias();
        p.setNombre(nombre);
           this.edit(p);
        return true;
    }else{
            return false;
    }

    }
   public List<Provincias> buscar(String nombre, String orden){
        if(orden.equals("Desc")){
              System.out.println("Entro por desc");
          return em.createQuery("SELECT p FROM Provincias p WHERE p.nombre LIKE :nombre ORDER BY p.nombre DESC").setParameter("nombre", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Provincias p WHERE p.nombre LIKE :nombre ORDER BY p.nombre ASC").setParameter("nombre", nombre).getResultList();
    }
     return em.createQuery("SELECT p FROM Provincias p WHERE p.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
}

    public List<Provincias> ordenarAsc() {
        return em.createQuery("SELECT p FROM Provincias p ORDER BY p.nombre ASC").getResultList();
    }
    public List<Provincias> ordenarDesc() {
        return em.createQuery("SELECT p FROM Provincias p ORDER BY o.nombre DESC").getResultList();
    }


    public List<Provincias> listar(String orden){
        if(orden.equals("Asc")){
      List<Provincias>  lista = em.createQuery("SELECT p FROM Provincias p ORDER BY p.nombre ASC").getResultList();}
        if(orden.equals("Desc")){
      List<Provincias>  lista = em.createQuery("SELECT p FROM Provincias p ORDER BY p.nombre DESC").getResultList();}
     
       List<Provincias> lista = this.findAll();
        return lista;
    }
}
