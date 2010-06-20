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
@Table(name = "campos")
@NamedQueries({@NamedQuery(name = "Campos.findAll", query = "SELECT c FROM Campos c"), @NamedQuery(name = "Campos.findByPropiedadesId", query = "SELECT c FROM Campos c WHERE c.propiedadesId = :propiedadesId"), @NamedQuery(name = "Campos.findByParcela", query = "SELECT c FROM Campos c WHERE c.parcela = :parcela"), @NamedQuery(name = "Campos.findByLotes", query = "SELECT c FROM Campos c WHERE c.lotes = :lotes"), @NamedQuery(name = "Campos.findByDetalles", query = "SELECT c FROM Campos c WHERE c.detalles = :detalles")})
public class Campos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "propiedades_id")
    private Integer propiedadesId;
    @Column(name = "parcela")
    private String parcela;
    @Column(name = "lotes")
    private String lotes;
    @Column(name = "detalles")
    private String detalles;
    @JoinColumn(name = "propiedades_id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Propiedades propiedades;

    public Campos() {
    }

    public Campos(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public Integer getPropiedadesId() {
        return propiedadesId;
    }

    public void setPropiedadesId(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public String getParcela() {
        return parcela;
    }

    public void setParcela(String parcela) {
        this.parcela = parcela;
    }

    public String getLotes() {
        return lotes;
    }

    public void setLotes(String lotes) {
        this.lotes = lotes;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
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
        if (!(object instanceof Campos)) {
            return false;
        }
        Campos other = (Campos) object;
        if ((this.propiedadesId == null && other.propiedadesId != null) || (this.propiedadesId != null && !this.propiedadesId.equals(other.propiedadesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Campos[propiedadesId=" + propiedadesId + "]";
    }

}
