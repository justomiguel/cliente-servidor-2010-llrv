/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Periodo;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface PeriodoFacadeRemote {

    void create(Periodo periodo);

    void edit(Periodo periodo);

    void remove(Periodo periodo);

    Periodo find(Object id);

    List<Periodo> findAll();

}
