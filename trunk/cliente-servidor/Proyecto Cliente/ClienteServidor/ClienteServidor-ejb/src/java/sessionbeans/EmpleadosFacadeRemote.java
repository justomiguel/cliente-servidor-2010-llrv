/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Empleados;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface EmpleadosFacadeRemote {

    void create(Empleados empleados);

    void edit(Empleados empleados);

    void remove(Empleados empleados);

    Empleados find(Object id);

    List<Empleados> findAll();

}
