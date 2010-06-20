/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Costoporperiodo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CostoporperiodoFacade implements CostoporperiodoFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Costoporperiodo costoporperiodo) {
        em.persist(costoporperiodo);
    }

    public void edit(Costoporperiodo costoporperiodo) {
        em.merge(costoporperiodo);
    }

    public void remove(Costoporperiodo costoporperiodo) {
        em.remove(em.merge(costoporperiodo));
    }

    public Costoporperiodo find(Object id) {
        return em.find(Costoporperiodo.class, id);
    }

    public List<Costoporperiodo> findAll() {
        return em.createQuery("select object(o) from Costoporperiodo as o").getResultList();
    }

}
