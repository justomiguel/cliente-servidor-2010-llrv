/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
import entity.Zonas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class ZonasFacade implements ZonasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Zonas zonas) {
        em.persist(zonas);
    }

    public void edit(Zonas zonas) {
        em.merge(zonas);
    }

    public void remove(Zonas zonas) {
        em.remove(em.merge(zonas));
    }

    public Zonas find(Object id) {
        return em.find(Zonas.class, id);
    }

    public List<Zonas> findAll() {
        return em.createQuery("select object(o) from Zonas as o").getResultList();
    }
           public boolean darAlta( Localidades loc, String nombre, String detalles){
        if(!nombre.equals("")){
            Zonas z = new Zonas();
            z.setNombre(nombre);
            z.setLocalidadesid(loc);
            this.edit(z);
        return true;
    }else{
            return false;
    }

    }
    public void borrar(String iden)
    {
    Zonas lo = (Zonas) em.createQuery("SELECT z FROM Zonas z WHERE z.nombre = :nombre").setParameter("nombre", iden).getSingleResult();
    this.remove(lo);

    }
    public List<Zonas> buscar(String nombre, String orden, String campo){

        if(orden.equals("Desc")){
              System.out.println("Entro por desc");
       return em.createQuery("SELECT p FROM Zonas p WHERE p.nombre LIKE :nombre ORDER BY p.nombre DESC").setParameter("nombre", nombre).getResultList();
        }
     if(orden.equals("Asc")){
         System.out.println("Entro por Asc");
      return em.createQuery("SELECT p FROM Zonas p WHERE p.nombre LIKE :nombre ORDER BY p.nombre ASC").setParameter("nombre", nombre).getResultList();
    }
     return em.createQuery("SELECT p FROM Zonas p WHERE p.nombre LIKE :nombre").setParameter("nombre", nombre).getResultList();

    }


    public List<Zonas> listar(String orden,String campo){
        List<Zonas> lista = null;

        if(orden.equals("Asc")){
        lista = em.createQuery("SELECT p FROM Zonas p ORDER BY p.nombre ASC").getResultList();}
        if(orden.equals("Desc")){
        lista = em.createQuery("SELECT p FROM Zonas p ORDER BY p.nombre DESC").getResultList();}
        if(orden.equals("Desc")){
        lista = this.findAll();}
        return lista;

    }
}
