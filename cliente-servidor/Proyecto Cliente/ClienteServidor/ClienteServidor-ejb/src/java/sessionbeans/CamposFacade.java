/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Campos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CamposFacade implements CamposFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Campos campos) {
        em.persist(campos);
    }

    public void edit(Campos campos) {
        em.merge(campos);
    }

    public void remove(Campos campos) {
        em.remove(em.merge(campos));
    }

    public Campos find(Object id) {
        return em.find(Campos.class, id);
    }

    public List<Campos> findAll() {
        return em.createQuery("select object(o) from Campos as o").getResultList();
    }

}
