/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Personas;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class PersonasFacade implements PersonasFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Personas personas) {
        em.persist(personas);
    }

    public void edit(Personas personas) {
        em.merge(personas);
    }

    public void remove(Personas personas) {
        em.remove(em.merge(personas));
    }

    public Personas find(Object id) {
        return em.find(Personas.class, id);
    }

    public List<Personas> findAll() {
        return em.createQuery("select object(o) from Personas as o").getResultList();
    }

}
