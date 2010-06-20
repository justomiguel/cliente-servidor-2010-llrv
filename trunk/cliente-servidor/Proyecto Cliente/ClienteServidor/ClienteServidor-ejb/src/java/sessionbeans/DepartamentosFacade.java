/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Departamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class DepartamentosFacade implements DepartamentosFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Departamentos departamentos) {
        em.persist(departamentos);
    }

    public void edit(Departamentos departamentos) {
        em.merge(departamentos);
    }

    public void remove(Departamentos departamentos) {
        em.remove(em.merge(departamentos));
    }

    public Departamentos find(Object id) {
        return em.find(Departamentos.class, id);
    }

    public List<Departamentos> findAll() {
        return em.createQuery("select object(o) from Departamentos as o").getResultList();
    }

}
