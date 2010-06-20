/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "inmobiliaria")
@NamedQueries({@NamedQuery(name = "Inmobiliaria.findAll", query = "SELECT i FROM Inmobiliaria i"), @NamedQuery(name = "Inmobiliaria.findByNombre", query = "SELECT i FROM Inmobiliaria i WHERE i.nombre = :nombre"), @NamedQuery(name = "Inmobiliaria.findByBajalogica", query = "SELECT i FROM Inmobiliaria i WHERE i.bajalogica = :bajalogica"), @NamedQuery(name = "Inmobiliaria.findByComisionalquiler", query = "SELECT i FROM Inmobiliaria i WHERE i.comisionalquiler = :comisionalquiler")})
public class Inmobiliaria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "bajalogica")
    private Boolean bajalogica;
    @Column(name = "comisionalquiler")
    @Temporal(TemporalType.DATE)
    private Date comisionalquiler;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inmobiliarianombre")
    private Collection<Sucursales> sucursalesCollection;

    public Inmobiliaria() {
    }

    public Inmobiliaria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getBajalogica() {
        return bajalogica;
    }

    public void setBajalogica(Boolean bajalogica) {
        this.bajalogica = bajalogica;
    }

    public Date getComisionalquiler() {
        return comisionalquiler;
    }

    public void setComisionalquiler(Date comisionalquiler) {
        this.comisionalquiler = comisionalquiler;
    }

    public Collection<Sucursales> getSucursalesCollection() {
        return sucursalesCollection;
    }

    public void setSucursalesCollection(Collection<Sucursales> sucursalesCollection) {
        this.sucursalesCollection = sucursalesCollection;
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
        if (!(object instanceof Inmobiliaria)) {
            return false;
        }
        Inmobiliaria other = (Inmobiliaria) object;
        if ((this.nombre == null && other.nombre != null) || (this.nombre != null && !this.nombre.equals(other.nombre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Inmobiliaria[nombre=" + nombre + "]";
    }

}
