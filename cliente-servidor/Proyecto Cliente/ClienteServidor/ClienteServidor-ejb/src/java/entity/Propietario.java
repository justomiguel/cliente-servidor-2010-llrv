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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "propietario")
@NamedQueries({@NamedQuery(name = "Propietario.findAll", query = "SELECT p FROM Propietario p"), @NamedQuery(name = "Propietario.findByPersonasCuilcuit", query = "SELECT p FROM Propietario p WHERE p.personasCuilcuit = :personasCuilcuit"), @NamedQuery(name = "Propietario.findByDetalles", query = "SELECT p FROM Propietario p WHERE p.detalles = :detalles"), @NamedQuery(name = "Propietario.findByFechaingreso", query = "SELECT p FROM Propietario p WHERE p.fechaingreso = :fechaingreso")})
public class Propietario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "personas_cuilcuit")
    private Integer personasCuilcuit;
    @Column(name = "detalles")
    private String detalles;
    @Column(name = "fechaingreso")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaingreso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "propietarioPersonasCuilcuit")
    private Collection<Propiedades> propiedadesCollection;
    @JoinColumn(name = "personas_cuilcuit", referencedColumnName = "cuilcuit", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Propietario() {
    }

    public Propietario(Integer personasCuilcuit) {
        this.personasCuilcuit = personasCuilcuit;
    }

    public Integer getPersonasCuilcuit() {
        return personasCuilcuit;
    }

    public void setPersonasCuilcuit(Integer personasCuilcuit) {
        this.personasCuilcuit = personasCuilcuit;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Collection<Propiedades> getPropiedadesCollection() {
        return propiedadesCollection;
    }

    public void setPropiedadesCollection(Collection<Propiedades> propiedadesCollection) {
        this.propiedadesCollection = propiedadesCollection;
    }

    public Personas getPersonas() {
        return personas;
    }

    public void setPersonas(Personas personas) {
        this.personas = personas;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personasCuilcuit != null ? personasCuilcuit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Propietario)) {
            return false;
        }
        Propietario other = (Propietario) object;
        if ((this.personasCuilcuit == null && other.personasCuilcuit != null) || (this.personasCuilcuit != null && !this.personasCuilcuit.equals(other.personasCuilcuit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Propietario[personasCuilcuit=" + personasCuilcuit + "]";
    }

}
