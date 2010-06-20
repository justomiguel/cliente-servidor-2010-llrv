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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "propiedades")
@NamedQueries({@NamedQuery(name = "Propiedades.findAll", query = "SELECT p FROM Propiedades p"), @NamedQuery(name = "Propiedades.findById", query = "SELECT p FROM Propiedades p WHERE p.id = :id"), @NamedQuery(name = "Propiedades.findByDetalles", query = "SELECT p FROM Propiedades p WHERE p.detalles = :detalles"), @NamedQuery(name = "Propiedades.findByVisibilidad", query = "SELECT p FROM Propiedades p WHERE p.visibilidad = :visibilidad"), @NamedQuery(name = "Propiedades.findByBajalogica", query = "SELECT p FROM Propiedades p WHERE p.bajalogica = :bajalogica")})
public class Propiedades implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "detalles")
    private String detalles;
    @Column(name = "visibilidad")
    private Boolean visibilidad;
    @Column(name = "bajalogica")
    private Boolean bajalogica;
    @OneToMany(mappedBy = "propiedadesid")
    private Collection<Imagenes> imagenesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propiedadesid")
    private Collection<Alquileres> alquileresCollection;
    @OneToMany(mappedBy = "propiedadesid")
    private Collection<Caracteristicasprop> caracteristicaspropCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propiedades")
    private Collection<Costoporperiodo> costoporperiodoCollection;
    @JoinColumn(name = "Zonas_nombre", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Zonas zonasnombre;
    @JoinColumn(name = "propietario_personas_cuilcuit", referencedColumnName = "personas_cuilcuit")
    @ManyToOne(optional = false)
    private Propietario propietarioPersonasCuilcuit;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedades")
    private Campos campos;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedades")
    private Departamentos departamentos;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "propiedades")
    private Casas casas;

    public Propiedades() {
    }

    public Propiedades(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Boolean getVisibilidad() {
        return visibilidad;
    }

    public void setVisibilidad(Boolean visibilidad) {
        this.visibilidad = visibilidad;
    }

    public Boolean getBajalogica() {
        return bajalogica;
    }

    public void setBajalogica(Boolean bajalogica) {
        this.bajalogica = bajalogica;
    }

    public Collection<Imagenes> getImagenesCollection() {
        return imagenesCollection;
    }

    public void setImagenesCollection(Collection<Imagenes> imagenesCollection) {
        this.imagenesCollection = imagenesCollection;
    }

    public Collection<Alquileres> getAlquileresCollection() {
        return alquileresCollection;
    }

    public void setAlquileresCollection(Collection<Alquileres> alquileresCollection) {
        this.alquileresCollection = alquileresCollection;
    }

    public Collection<Caracteristicasprop> getCaracteristicaspropCollection() {
        return caracteristicaspropCollection;
    }

    public void setCaracteristicaspropCollection(Collection<Caracteristicasprop> caracteristicaspropCollection) {
        this.caracteristicaspropCollection = caracteristicaspropCollection;
    }

    public Collection<Costoporperiodo> getCostoporperiodoCollection() {
        return costoporperiodoCollection;
    }

    public void setCostoporperiodoCollection(Collection<Costoporperiodo> costoporperiodoCollection) {
        this.costoporperiodoCollection = costoporperiodoCollection;
    }

    public Zonas getZonasnombre() {
        return zonasnombre;
    }

    public void setZonasnombre(Zonas zonasnombre) {
        this.zonasnombre = zonasnombre;
    }

    public Propietario getPropietarioPersonasCuilcuit() {
        return propietarioPersonasCuilcuit;
    }

    public void setPropietarioPersonasCuilcuit(Propietario propietarioPersonasCuilcuit) {
        this.propietarioPersonasCuilcuit = propietarioPersonasCuilcuit;
    }

    public Campos getCampos() {
        return campos;
    }

    public void setCampos(Campos campos) {
        this.campos = campos;
    }

    public Departamentos getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamentos departamentos) {
        this.departamentos = departamentos;
    }

    public Casas getCasas() {
        return casas;
    }

    public void setCasas(Casas casas) {
        this.casas = casas;
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
        if (!(object instanceof Propiedades)) {
            return false;
        }
        Propiedades other = (Propiedades) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Propiedades[id=" + id + "]";
    }

}
