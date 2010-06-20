/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Caracteristicas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CaracteristicasFacadeRemote {

    void create(Caracteristicas caracteristicas);

    void edit(Caracteristicas caracteristicas);

    void remove(Caracteristicas caracteristicas);

    Caracteristicas find(Object id);

    List<Caracteristicas> findAll();

}
