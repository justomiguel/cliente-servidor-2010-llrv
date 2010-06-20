/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Telefonos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class TelefonosFacade implements TelefonosFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Telefonos telefonos) {
        em.persist(telefonos);
    }

    public void edit(Telefonos telefonos) {
        em.merge(telefonos);
    }

    public void remove(Telefonos telefonos) {
        em.remove(em.merge(telefonos));
    }

    public Telefonos find(Object id) {
        return em.find(Telefonos.class, id);
    }

    public List<Telefonos> findAll() {
        return em.createQuery("select object(o) from Telefonos as o").getResultList();
    }

}
