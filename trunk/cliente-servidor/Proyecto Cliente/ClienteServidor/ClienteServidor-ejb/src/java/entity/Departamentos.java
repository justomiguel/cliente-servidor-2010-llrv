/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "departamentos")
@NamedQueries({@NamedQuery(name = "Departamentos.findAll", query = "SELECT d FROM Departamentos d"), @NamedQuery(name = "Departamentos.findByPropiedadesId", query = "SELECT d FROM Departamentos d WHERE d.propiedadesId = :propiedadesId"), @NamedQuery(name = "Departamentos.findByNombredeldto", query = "SELECT d FROM Departamentos d WHERE d.nombredeldto = :nombredeldto"), @NamedQuery(name = "Departamentos.findByCalle", query = "SELECT d FROM Departamentos d WHERE d.calle = :calle"), @NamedQuery(name = "Departamentos.findByAltura", query = "SELECT d FROM Departamentos d WHERE d.altura = :altura"), @NamedQuery(name = "Departamentos.findByPiso", query = "SELECT d FROM Departamentos d WHERE d.piso = :piso")})
public class Departamentos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "propiedades_id")
    private Integer propiedadesId;
    @Column(name = "nombredeldto")
    private String nombredeldto;
    @Column(name = "calle")
    private String calle;
    @Column(name = "altura")
    private String altura;
    @Column(name = "piso")
    private String piso;
    @JoinColumn(name = "propiedades_id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Propiedades propiedades;

    public Departamentos() {
    }

    public Departamentos(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public Integer getPropiedadesId() {
        return propiedadesId;
    }

    public void setPropiedadesId(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public String getNombredeldto() {
        return nombredeldto;
    }

    public void setNombredeldto(String nombredeldto) {
        this.nombredeldto = nombredeldto;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPiso() {
        return piso;
    }

    public void setPiso(String piso) {
        this.piso = piso;
    }

    public Propiedades getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedades propiedades) {
        this.propiedades = propiedades;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (propiedadesId != null ? propiedadesId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departamentos)) {
            return false;
        }
        Departamentos other = (Departamentos) object;
        if ((this.propiedadesId == null && other.propiedadesId != null) || (this.propiedadesId != null && !this.propiedadesId.equals(other.propiedadesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Departamentos[propiedadesId=" + propiedadesId + "]";
    }

}
