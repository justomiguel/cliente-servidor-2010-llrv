/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Casas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface CasasFacadeRemote {

    void create(Casas casas);

    void edit(Casas casas);

    void remove(Casas casas);

    Casas find(Object id);

    List<Casas> findAll();

}
