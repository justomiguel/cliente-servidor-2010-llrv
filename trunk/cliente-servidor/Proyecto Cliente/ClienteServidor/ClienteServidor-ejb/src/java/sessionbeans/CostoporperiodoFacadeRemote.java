/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Costoporperiodo;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CostoporperiodoFacadeRemote {

    void create(Costoporperiodo costoporperiodo);

    void edit(Costoporperiodo costoporperiodo);

    void remove(Costoporperiodo costoporperiodo);

    Costoporperiodo find(Object id);

    List<Costoporperiodo> findAll();

}
