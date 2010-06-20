/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Alquileres;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface AlquileresFacadeRemote {

    void create(Alquileres alquileres);

    void edit(Alquileres alquileres);

    void remove(Alquileres alquileres);

    Alquileres find(Object id);

    List<Alquileres> findAll();

}
