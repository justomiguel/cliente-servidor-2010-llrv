/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Personas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface PersonasFacadeRemote {

    void create(Personas personas);

    void edit(Personas personas);

    void remove(Personas personas);

    Personas find(Object id);

    List<Personas> findAll();

}
