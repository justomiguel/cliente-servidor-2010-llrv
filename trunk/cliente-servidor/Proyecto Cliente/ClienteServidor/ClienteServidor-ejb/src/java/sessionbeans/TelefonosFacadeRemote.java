/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Telefonos;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface TelefonosFacadeRemote {

    void create(Telefonos telefonos);

    void edit(Telefonos telefonos);

    void remove(Telefonos telefonos);

    Telefonos find(Object id);

    List<Telefonos> findAll();

}
