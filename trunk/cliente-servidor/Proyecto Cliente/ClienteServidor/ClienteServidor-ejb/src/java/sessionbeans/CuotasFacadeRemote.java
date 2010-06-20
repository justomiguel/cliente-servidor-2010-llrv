/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Cuotas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CuotasFacadeRemote {

    void create(Cuotas cuotas);

    void edit(Cuotas cuotas);

    void remove(Cuotas cuotas);

    Cuotas find(Object id);

    List<Cuotas> findAll();

}
