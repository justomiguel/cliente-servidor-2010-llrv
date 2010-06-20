/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Sucursales;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface SucursalesFacadeRemote {

    void create(Sucursales sucursales);

    void edit(Sucursales sucursales);

    void remove(Sucursales sucursales);

    Sucursales find(Object id);

    List<Sucursales> findAll();

}
