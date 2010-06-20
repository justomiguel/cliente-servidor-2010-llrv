/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Casas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CasasFacade implements CasasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Casas casas) {
        em.persist(casas);
    }

    public void edit(Casas casas) {
        em.merge(casas);
    }

    public void remove(Casas casas) {
        em.remove(em.merge(casas));
    }

    public Casas find(Object id) {
        return em.find(Casas.class, id);
    }

    public List<Casas> findAll() {
        return em.createQuery("select object(o) from Casas as o").getResultList();
    }

}
