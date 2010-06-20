/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Imagenes;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author justomiguel
 */
@Stateless
public class ImagenesFacade implements ImagenesFacadeRemote {
    @PersistenceContext
    private EntityManager em;

    public void create(Imagenes imagenes) {
        em.persist(imagenes);
    }

    public void edit(Imagenes imagenes) {
        em.merge(imagenes);
    }

    public void remove(Imagenes imagenes) {
        em.remove(em.merge(imagenes));
    }

    public Imagenes find(Object id) {
        return em.find(Imagenes.class, id);
    }

    public List<Imagenes> findAll() {
        return em.createQuery("select object(o) from Imagenes as o").getResultList();
    }

}
