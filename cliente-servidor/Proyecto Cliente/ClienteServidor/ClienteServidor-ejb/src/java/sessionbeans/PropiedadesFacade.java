/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Propiedades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class PropiedadesFacade implements PropiedadesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Propiedades propiedades) {
        em.persist(propiedades);
    }

    public void edit(Propiedades propiedades) {
        em.merge(propiedades);
    }

    public void remove(Propiedades propiedades) {
        em.remove(em.merge(propiedades));
    }

    public Propiedades find(Object id) {
        return em.find(Propiedades.class, id);
    }

    public List<Propiedades> findAll() {
        return em.createQuery("select object(o) from Propiedades as o").getResultList();
    }

}
