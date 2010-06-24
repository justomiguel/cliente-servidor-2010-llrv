/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Personas;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface PersonasFacadeRemote {

    void create(Personas personas);

    void edit(Personas personas);

    void remove(Personas personas);

    Personas find(Object id);

    List<Personas> findAll();

    public java.util.List<entity.Personas> buscar(java.lang.String nombre, java.lang.String campo, java.lang.String orden);

    public void borrar(int p);

    public java.util.List<entity.Personas> buscarLoc(entity.Localidades loc, java.lang.String orden);

    public java.util.List<entity.Personas> ordenarAsc();

    public java.util.List<entity.Personas> ordenarDesc();

    public java.util.List<entity.Personas> listar(java.lang.String orden);

}
