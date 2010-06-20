/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Periodo;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class PeriodoFacade implements PeriodoFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Periodo periodo) {
        em.persist(periodo);
    }

    public void edit(Periodo periodo) {
        em.merge(periodo);
    }

    public void remove(Periodo periodo) {
        em.remove(em.merge(periodo));
    }

    public Periodo find(Object id) {
        return em.find(Periodo.class, id);
    }

    public List<Periodo> findAll() {
        return em.createQuery("select object(o) from Periodo as o").getResultList();
    }

}
