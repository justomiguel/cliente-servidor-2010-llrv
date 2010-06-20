/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Sucursales;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class SucursalesFacade implements SucursalesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Sucursales sucursales) {
        em.persist(sucursales);
    }

    public void edit(Sucursales sucursales) {
        em.merge(sucursales);
    }

    public void remove(Sucursales sucursales) {
        em.remove(em.merge(sucursales));
    }

    public Sucursales find(Object id) {
        return em.find(Sucursales.class, id);
    }

    public List<Sucursales> findAll() {
        return em.createQuery("select object(o) from Sucursales as o").getResultList();
    }

}
