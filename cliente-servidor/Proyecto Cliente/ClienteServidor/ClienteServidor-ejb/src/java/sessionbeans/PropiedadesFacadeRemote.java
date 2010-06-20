/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Propiedades;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface PropiedadesFacadeRemote {

    void create(Propiedades propiedades);

    void edit(Propiedades propiedades);

    void remove(Propiedades propiedades);

    Propiedades find(Object id);

    List<Propiedades> findAll();

}
