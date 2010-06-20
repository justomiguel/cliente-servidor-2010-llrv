/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Propietario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class PropietarioFacade implements PropietarioFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Propietario propietario) {
        em.persist(propietario);
    }

    public void edit(Propietario propietario) {
        em.merge(propietario);
    }

    public void remove(Propietario propietario) {
        em.remove(em.merge(propietario));
    }

    public Propietario find(Object id) {
        return em.find(Propietario.class, id);
    }

    public List<Propietario> findAll() {
        return em.createQuery("select object(o) from Propietario as o").getResultList();
    }

}
