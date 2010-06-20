/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Cuotas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CuotasFacade implements CuotasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Cuotas cuotas) {
        em.persist(cuotas);
    }

    public void edit(Cuotas cuotas) {
        em.merge(cuotas);
    }

    public void remove(Cuotas cuotas) {
        em.remove(em.merge(cuotas));
    }

    public Cuotas find(Object id) {
        return em.find(Cuotas.class, id);
    }

    public List<Cuotas> findAll() {
        return em.createQuery("select object(o) from Cuotas as o").getResultList();
    }

}
