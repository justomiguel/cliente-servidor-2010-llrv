/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

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

}
