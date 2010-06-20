/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Caracteristicasprop;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CaracteristicaspropFacade implements CaracteristicaspropFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Caracteristicasprop caracteristicasprop) {
        em.persist(caracteristicasprop);
    }

    public void edit(Caracteristicasprop caracteristicasprop) {
        em.merge(caracteristicasprop);
    }

    public void remove(Caracteristicasprop caracteristicasprop) {
        em.remove(em.merge(caracteristicasprop));
    }

    public Caracteristicasprop find(Object id) {
        return em.find(Caracteristicasprop.class, id);
    }

    public List<Caracteristicasprop> findAll() {
        return em.createQuery("select object(o) from Caracteristicasprop as o").getResultList();
    }

}
