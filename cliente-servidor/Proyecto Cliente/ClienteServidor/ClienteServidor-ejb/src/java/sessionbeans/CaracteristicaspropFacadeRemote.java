/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Caracteristicasprop;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CaracteristicaspropFacadeRemote {

    void create(Caracteristicasprop caracteristicasprop);

    void edit(Caracteristicasprop caracteristicasprop);

    void remove(Caracteristicasprop caracteristicasprop);

    Caracteristicasprop find(Object id);

    List<Caracteristicasprop> findAll();

}
