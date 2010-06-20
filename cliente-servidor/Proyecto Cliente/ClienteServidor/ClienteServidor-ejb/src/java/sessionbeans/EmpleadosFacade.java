/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Empleados;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class EmpleadosFacade implements EmpleadosFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Empleados empleados) {
        em.persist(empleados);
    }

    public void edit(Empleados empleados) {
        em.merge(empleados);
    }

    public void remove(Empleados empleados) {
        em.remove(em.merge(empleados));
    }

    public Empleados find(Object id) {
        return em.find(Empleados.class, id);
    }

    public List<Empleados> findAll() {
        return em.createQuery("select object(o) from Empleados as o").getResultList();
    }

}
