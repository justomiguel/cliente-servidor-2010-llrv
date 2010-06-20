/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Imagenes;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface ImagenesFacadeRemote {

    void create(Imagenes imagenes);

    void edit(Imagenes imagenes);

    void remove(Imagenes imagenes);

    Imagenes find(Object id);

    List<Imagenes> findAll();

}
