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
@Table(name = "localidades")
@NamedQueries({@NamedQuery(name = "Localidades.findAll", query = "SELECT l FROM Localidades l"), @NamedQuery(name = "Localidades.findById", query = "SELECT l FROM Localidades l WHERE l.id = :id"), @NamedQuery(name = "Localidades.findByNombre", query = "SELECT l FROM Localidades l WHERE l.nombre = :nombre"), @NamedQuery(name = "Localidades.findByCodpostal", query = "SELECT l FROM Localidades l WHERE l.codpostal = :codpostal"), @NamedQuery(name = "Localidades.findByCodarea", query = "SELECT l FROM Localidades l WHERE l.codarea = :codarea")})
public class Localidades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "codpostal")
    private Integer codpostal;
    @Column(name = "codarea")
    private Integer codarea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localidadesid")
    private Collection<Sucursales> sucursalesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "localidadesid")
    private Collection<Personas> personasCollection;
    @JoinColumn(name = "provincias_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Provincias provinciasId;
    @OneToMany(mappedBy = "localidadesid")
    private Collection<Zonas> zonasCollection;

    public Localidades() {
    }

    public Localidades(Integer id) {
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

    public Integer getCodpostal() {
        return codpostal;
    }

    public void setCodpostal(Integer codpostal) {
        this.codpostal = codpostal;
    }

    public Integer getCodarea() {
        return codarea;
    }

    public void setCodarea(Integer codarea) {
        this.codarea = codarea;
    }

    public Collection<Sucursales> getSucursalesCollection() {
        return sucursalesCollection;
    }

    public void setSucursalesCollection(Collection<Sucursales> sucursalesCollection) {
        this.sucursalesCollection = sucursalesCollection;
    }

    public Collection<Personas> getPersonasCollection() {
        return personasCollection;
    }

    public void setPersonasCollection(Collection<Personas> personasCollection) {
        this.personasCollection = personasCollection;
    }

    public Provincias getProvinciasId() {
        return provinciasId;
    }

    public void setProvinciasId(Provincias provinciasId) {
        this.provinciasId = provinciasId;
    }

    public Collection<Zonas> getZonasCollection() {
        return zonasCollection;
    }

    public void setZonasCollection(Collection<Zonas> zonasCollection) {
        this.zonasCollection = zonasCollection;
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
        if (!(object instanceof Localidades)) {
            return false;
        }
        Localidades other = (Localidades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
