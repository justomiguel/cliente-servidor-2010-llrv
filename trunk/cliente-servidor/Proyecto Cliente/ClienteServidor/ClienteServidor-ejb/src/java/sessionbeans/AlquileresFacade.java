/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Alquileres;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class AlquileresFacade implements AlquileresFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Alquileres alquileres) {
        em.persist(alquileres);
    }

    public void edit(Alquileres alquileres) {
        em.merge(alquileres);
    }

    public void remove(Alquileres alquileres) {
        em.remove(em.merge(alquileres));
    }

    public Alquileres find(Object id) {
        return em.find(Alquileres.class, id);
    }

    public List<Alquileres> findAll() {
        return em.createQuery("select object(o) from Alquileres as o").getResultList();
    }

}
