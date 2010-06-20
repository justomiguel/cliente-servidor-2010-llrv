/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Tiposdeimagenes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class TiposdeimagenesFacade implements TiposdeimagenesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Tiposdeimagenes tiposdeimagenes) {
        em.persist(tiposdeimagenes);
    }

    public void edit(Tiposdeimagenes tiposdeimagenes) {
        em.merge(tiposdeimagenes);
    }

    public void remove(Tiposdeimagenes tiposdeimagenes) {
        em.remove(em.merge(tiposdeimagenes));
    }

    public Tiposdeimagenes find(Object id) {
        return em.find(Tiposdeimagenes.class, id);
    }

    public List<Tiposdeimagenes> findAll() {
        return em.createQuery("select object(o) from Tiposdeimagenes as o").getResultList();
    }

}
