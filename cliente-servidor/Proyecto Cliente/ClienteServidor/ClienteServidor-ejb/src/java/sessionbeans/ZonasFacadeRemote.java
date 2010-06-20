/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Zonas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface ZonasFacadeRemote {

    void create(Zonas zonas);

    void edit(Zonas zonas);

    void remove(Zonas zonas);

    Zonas find(Object id);

    List<Zonas> findAll();

}
