/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Caracteristicas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class CaracteristicasFacade implements CaracteristicasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Caracteristicas caracteristicas) {
        em.persist(caracteristicas);
    }

    public void edit(Caracteristicas caracteristicas) {
        em.merge(caracteristicas);
    }

    public void remove(Caracteristicas caracteristicas) {
        em.remove(em.merge(caracteristicas));
    }

    public Caracteristicas find(Object id) {
        return em.find(Caracteristicas.class, id);
    }

    public List<Caracteristicas> findAll() {
        return em.createQuery("select object(o) from Caracteristicas as o").getResultList();
    }

}
