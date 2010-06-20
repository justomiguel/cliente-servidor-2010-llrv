/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class LocalidadesFacade implements LocalidadesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Localidades localidades) {
        em.persist(localidades);
    }

    public void edit(Localidades localidades) {
        em.merge(localidades);
    }

    public void remove(Localidades localidades) {
        em.remove(em.merge(localidades));
    }

    public Localidades find(Object id) {
        return em.find(Localidades.class, id);
    }

    public List<Localidades> findAll() {
        return em.createQuery("select object(o) from Localidades as o").getResultList();
    }

}
