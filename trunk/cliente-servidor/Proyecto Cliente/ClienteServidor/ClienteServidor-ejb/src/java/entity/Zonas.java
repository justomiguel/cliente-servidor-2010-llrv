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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "zonas")
@NamedQueries({@NamedQuery(name = "Zonas.findAll", query = "SELECT z FROM Zonas z"), @NamedQuery(name = "Zonas.findByNombre", query = "SELECT z FROM Zonas z WHERE z.nombre = :nombre"), @NamedQuery(name = "Zonas.findByDetalles", query = "SELECT z FROM Zonas z WHERE z.detalles = :detalles")})
public class Zonas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "detalles")
    private String detalles;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zonasnombre")
    private Collection<Propiedades> propiedadesCollection;
    @JoinColumn(name = "Localidades_id", referencedColumnName = "id")
    @ManyToOne
    private Localidades localidadesid;

    public Zonas() {
    }

    public Zonas(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Collection<Propiedades> getPropiedadesCollection() {
        return propiedadesCollection;
    }

    public void setPropiedadesCollection(Collection<Propiedades> propiedadesCollection) {
        this.propiedadesCollection = propiedadesCollection;
    }

    public Localidades getLocalidadesid() {
        return localidadesid;
    }

    public void setLocalidadesid(Localidades localidadesid) {
        this.localidadesid = localidadesid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nombre != null ? nombre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Zonas)) {
            return false;
        }
        Zonas other = (Zonas) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
