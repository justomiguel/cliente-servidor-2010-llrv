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
@Table(name = "empleados")
@NamedQueries({@NamedQuery(name = "Empleados.findAll", query = "SELECT e FROM Empleados e"), @NamedQuery(name = "Empleados.findByPersonasCuilcuit", query = "SELECT e FROM Empleados e WHERE e.personasCuilcuit = :personasCuilcuit"), @NamedQuery(name = "Empleados.findByLeg", query = "SELECT e FROM Empleados e WHERE e.leg = :leg"), @NamedQuery(name = "Empleados.findByPorcomision", query = "SELECT e FROM Empleados e WHERE e.porcomision = :porcomision"), @NamedQuery(name = "Empleados.findByBajalogica", query = "SELECT e FROM Empleados e WHERE e.bajalogica = :bajalogica")})
public class Empleados implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "personas_cuilcuit")
    private Integer personasCuilcuit;
    @Column(name = "leg")
    private String leg;
    @Column(name = "porcomision")
    private Float porcomision;
    @Column(name = "bajalogica")
    private Boolean bajalogica;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "empleados")
    private Collection<Alquileres> alquileresCollection;
    @JoinColumn(name = "personas_cuilcuit", referencedColumnName = "cuilcuit", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personas personas;

    public Empleados() {
    }

    public Empleados(Integer personasCuilcuit) {
        this.personasCuilcuit = personasCuilcuit;
    }

    public Integer getPersonasCuilcuit() {
        return personasCuilcuit;
    }

    public void setPersonasCuilcuit(Integer personasCuilcuit) {
        this.personasCuilcuit = personasCuilcuit;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public Float getPorcomision() {
        return porcomision;
    }

    public void setPorcomision(Float porcomision) {
        this.porcomision = porcomision;
    }

    public Boolean getBajalogica() {
        return bajalogica;
    }

    public void setBajalogica(Boolean bajalogica) {
        this.bajalogica = bajalogica;
    }

    public Collection<Alquileres> getAlquileresCollection() {
        return alquileresCollection;
    }

    public void setAlquileresCollection(Collection<Alquileres> alquileresCollection) {
        this.alquileresCollection = alquileresCollection;
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
        if (!(object instanceof Empleados)) {
            return false;
        }
        Empleados other = (Empleados) object;
        if ((this.personasCuilcuit == null && other.personasCuilcuit != null) || (this.personasCuilcuit != null && !this.personasCuilcuit.equals(other.personasCuilcuit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Empleados[personasCuilcuit=" + personasCuilcuit + "]";
    }

}
