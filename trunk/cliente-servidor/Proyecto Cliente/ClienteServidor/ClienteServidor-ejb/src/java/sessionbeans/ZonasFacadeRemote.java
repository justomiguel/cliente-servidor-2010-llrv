/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Zonas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface ZonasFacadeRemote {

    void create(Zonas zonas);

    void edit(Zonas zonas);

    void remove(Zonas zonas);

    Zonas find(Object id);

    List<Zonas> findAll();

    public boolean darAlta(entity.Localidades loc, java.lang.String nombre, java.lang.String detalles);

    public void borrar(java.lang.String iden);

    public java.util.List<entity.Zonas> buscar(java.lang.String nombre, java.lang.String orden, java.lang.String campo);

    public java.util.List<entity.Zonas> listar(java.lang.String orden, java.lang.String campo);

}
