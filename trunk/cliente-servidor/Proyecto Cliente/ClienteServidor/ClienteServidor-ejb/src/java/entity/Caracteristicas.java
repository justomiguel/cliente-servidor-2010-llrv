/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "caracteristicas")
@NamedQueries({@NamedQuery(name = "Caracteristicas.findAll", query = "SELECT c FROM Caracteristicas c"), @NamedQuery(name = "Caracteristicas.findById", query = "SELECT c FROM Caracteristicas c WHERE c.id = :id"), @NamedQuery(name = "Caracteristicas.findByNombre", query = "SELECT c FROM Caracteristicas c WHERE c.nombre = :nombre")})
public class Caracteristicas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caracteristicasTipoid")
    private Collection<Caracteristicasprop> caracteristicaspropCollection;

    public Caracteristicas() {
    }

    public Caracteristicas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Collection<Caracteristicasprop> getCaracteristicaspropCollection() {
        return caracteristicaspropCollection;
    }

    public void setCaracteristicaspropCollection(Collection<Caracteristicasprop> caracteristicaspropCollection) {
        this.caracteristicaspropCollection = caracteristicaspropCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caracteristicas)) {
            return false;
        }
        Caracteristicas other = (Caracteristicas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Caracteristicas[id=" + id + "]";
    }

}
