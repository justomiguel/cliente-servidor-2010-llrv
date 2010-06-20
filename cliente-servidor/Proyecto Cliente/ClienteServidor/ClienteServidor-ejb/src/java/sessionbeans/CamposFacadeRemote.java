/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Campos;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CamposFacadeRemote {

    void create(Campos campos);

    void edit(Campos campos);

    void remove(Campos campos);

    Campos find(Object id);

    List<Campos> findAll();

}
