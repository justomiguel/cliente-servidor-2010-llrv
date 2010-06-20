/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "telefonos")
@NamedQueries({@NamedQuery(name = "Telefonos.findAll", query = "SELECT t FROM Telefonos t"), @NamedQuery(name = "Telefonos.findById", query = "SELECT t FROM Telefonos t WHERE t.id = :id"), @NamedQuery(name = "Telefonos.findByCaracteristica", query = "SELECT t FROM Telefonos t WHERE t.caracteristica = :caracteristica"), @NamedQuery(name = "Telefonos.findByNumero", query = "SELECT t FROM Telefonos t WHERE t.numero = :numero"), @NamedQuery(name = "Telefonos.findByTipodetelefono", query = "SELECT t FROM Telefonos t WHERE t.tipodetelefono = :tipodetelefono")})
public class Telefonos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "caracteristica")
    private Integer caracteristica;
    @Column(name = "numero")
    private String numero;
    @Column(name = "tipodetelefono")
    private String tipodetelefono;
    @JoinColumn(name = "personas_cuilcuit", referencedColumnName = "cuilcuit")
    @ManyToOne(optional = false)
    private Personas personasCuilcuit;

    public Telefonos() {
    }

    public Telefonos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Integer caracteristica) {
        this.caracteristica = caracteristica;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipodetelefono() {
        return tipodetelefono;
    }

    public void setTipodetelefono(String tipodetelefono) {
        this.tipodetelefono = tipodetelefono;
    }

    public Personas getPersonasCuilcuit() {
        return personasCuilcuit;
    }

    public void setPersonasCuilcuit(Personas personasCuilcuit) {
        this.personasCuilcuit = personasCuilcuit;
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
        if (!(object instanceof Telefonos)) {
            return false;
        }
        Telefonos other = (Telefonos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Telefonos[id=" + id + "]";
    }

}
