/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
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
public class LocalidadesFacade implements LocalidadesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Localidades localidades) {
        em.persist(localidades);
    }

    public void edit(Localidades localidades) {
        em.merge(localidades);
    }

    public void remove(Localidades localidades) {
        em.remove(em.merge(localidades));
    }

    public Localidades find(Object id) {
        return em.find(Localidades.class, id);
    }

    public List<Localidades> findAll() {
        return em.createQuery("select object(o) from Localidades as o").getResultList();
    }
 public void borrar(Integer iden)
    {
    Localidades lo = this.find(iden);
    this.remove(lo);

    }
    public List<Localidades> buscar(String nombre, String orden, String campo){
      if(campo.equals("Ciudad")){
        if(orden.equals("Desc")){
              System.out.println("Entro por desc");
       return em.createQuery("SELECT p FROM Localidades p WHERE p.nombre LIKE :nombre ORDER BY p.nombre DESC").setParameter("nombre", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Localidades p WHERE p.nombre LIKE :nombre ORDER BY p.nombre ASC").setParameter("nombre", nombre).getResultList();
    }
     return em.createQuery("SELECT p FROM Localidades p WHERE p.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();
    }
    if(campo.equals("C-postal")){
            if(orden.equals("Desc")){
              System.out.println("Entro por desc");
       return em.createQuery("SELECT p FROM Localidades p WHERE p.codpostal LIKE :codpostal ORDER BY p.codpostal DESC").setParameter("codpostal", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Localidades p WHERE p.codpostal LIKE :codpostal ORDER BY p.codpostal ASC").setParameter("codpostal", nombre).getResultList();
    }
     return em.createQuery("SELECT p FROM Localidades p WHERE p.codpostal LIKE :codpostal").setParameter("codpostal", nombre).getResultList();

    }
      return this.findAll();

    }

      public List<Localidades> buscarLocaProvincia(Provincias i ){
            return em.createQuery("SELECT p FROM Localidades p WHERE p.provinciasId LIKE :provinciasId ORDER BY p.nombre ASC").setParameter("provinciasId", i).getResultList();
       }

    public List<Localidades> listar(String orden,String campo){
        List<Localidades> lista = null;
     if(campo.equals("Ciudad")){
        if(orden.equals("Asc")){
        lista = em.createQuery("SELECT p FROM Localidades p ORDER BY p.nombre ASC").getResultList();}
        if(orden.equals("Desc")){
        lista = em.createQuery("SELECT p FROM Localidades p ORDER BY p.nombre DESC").getResultList();}
        if(orden.equals("Desc")){
        lista = this.findAll();}
        return lista;
      }
       if(campo.equals("C-postal")){
        if(orden.equals("Asc")){
        lista = em.createQuery("SELECT p FROM Localidades p ORDER BY p.codpostal ASC").getResultList();}
        if(orden.equals("Desc")){
        lista = em.createQuery("SELECT p FROM Localidades p ORDER BY p.codpostal DESC").getResultList();}
        if(orden.equals("Desc")){
        lista = this.findAll();}
        return lista;
      }
         return this.findAll();
    }
}
