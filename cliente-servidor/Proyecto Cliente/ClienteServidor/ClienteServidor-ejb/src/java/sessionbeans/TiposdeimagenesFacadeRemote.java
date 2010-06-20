/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Tiposdeimagenes;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface TiposdeimagenesFacadeRemote {

    void create(Tiposdeimagenes tiposdeimagenes);

    void edit(Tiposdeimagenes tiposdeimagenes);

    void remove(Tiposdeimagenes tiposdeimagenes);

    Tiposdeimagenes find(Object id);

    List<Tiposdeimagenes> findAll();

}
