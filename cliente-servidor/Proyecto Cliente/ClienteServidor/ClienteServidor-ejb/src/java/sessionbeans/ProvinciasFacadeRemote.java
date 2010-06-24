/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbeans;

import entity.Provincias;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author justomiguel
 */
@Remote
public interface ProvinciasFacadeRemote {

    void create(Provincias provincias);

    void edit(Provincias provincias);

    void remove(Provincias provincias);

    Provincias find(Object id);

    List<Provincias> findAll();

    public java.util.List<entity.Provincias> buscar(java.lang.String nombre, java.lang.String orden);

    public java.util.List<entity.Provincias> ordenarAsc();

    public java.util.List<entity.Provincias> ordenarDesc();

    public java.util.List<entity.Provincias> listar(java.lang.String orden);

    public boolean darAlta(java.lang.String nombre);

}
