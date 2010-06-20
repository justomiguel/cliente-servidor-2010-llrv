/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Propietario;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface PropietarioFacadeRemote {

    void create(Propietario propietario);

    void edit(Propietario propietario);

    void remove(Propietario propietario);

    Propietario find(Object id);

    List<Propietario> findAll();

}
