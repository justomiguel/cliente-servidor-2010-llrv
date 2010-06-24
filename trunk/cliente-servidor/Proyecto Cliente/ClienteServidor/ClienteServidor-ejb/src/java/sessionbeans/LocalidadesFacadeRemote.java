/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Localidades;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface LocalidadesFacadeRemote {

    void create(Localidades localidades);

    void edit(Localidades localidades);

    void remove(Localidades localidades);

    Localidades find(Object id);

    List<Localidades> findAll();

    public void borrar(java.lang.Integer iden);

    public java.util.List<entity.Localidades> buscar(java.lang.String nombre, java.lang.String orden, java.lang.String campo);

    public java.util.List<entity.Localidades> buscarLocaProvincia(entity.Provincias i);

    public java.util.List<entity.Localidades> listar(java.lang.String orden, java.lang.String campo);

}
