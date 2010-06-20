/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Inmobiliaria;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class InmobiliariaFacade implements InmobiliariaFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Inmobiliaria inmobiliaria) {
        em.persist(inmobiliaria);
    }

    public void edit(Inmobiliaria inmobiliaria) {
        em.merge(inmobiliaria);
    }

    public void remove(Inmobiliaria inmobiliaria) {
        em.remove(em.merge(inmobiliaria));
    }

    public Inmobiliaria find(Object id) {
        return em.find(Inmobiliaria.class, id);
    }

    public List<Inmobiliaria> findAll() {
        return em.createQuery("select object(o) from Inmobiliaria as o").getResultList();
    }

}
