/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Inmobiliaria;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface InmobiliariaFacadeRemote {

    void create(Inmobiliaria inmobiliaria);

    void edit(Inmobiliaria inmobiliaria);

    void remove(Inmobiliaria inmobiliaria);

    Inmobiliaria find(Object id);

    List<Inmobiliaria> findAll();

}
