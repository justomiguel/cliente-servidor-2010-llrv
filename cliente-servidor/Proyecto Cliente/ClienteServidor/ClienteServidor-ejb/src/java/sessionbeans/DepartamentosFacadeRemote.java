/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Departamentos;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface DepartamentosFacadeRemote {

    void create(Departamentos departamentos);

    void edit(Departamentos departamentos);

    void remove(Departamentos departamentos);

    Departamentos find(Object id);

    List<Departamentos> findAll();

}
