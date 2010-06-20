/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface LocalidadesFacadeRemote {

    void create(Localidades localidades);

    void edit(Localidades localidades);

    void remove(Localidades localidades);

    Localidades find(Object id);

    List<Localidades> findAll();

}
