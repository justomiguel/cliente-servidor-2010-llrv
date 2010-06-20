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
@Table(name = "casas")
@NamedQueries({@NamedQuery(name = "Casas.findAll", query = "SELECT c FROM Casas c"), @NamedQuery(name = "Casas.findByPropiedadesId", query = "SELECT c FROM Casas c WHERE c.propiedadesId = :propiedadesId"), @NamedQuery(name = "Casas.findByCalle", query = "SELECT c FROM Casas c WHERE c.calle = :calle"), @NamedQuery(name = "Casas.findByAltura", query = "SELECT c FROM Casas c WHERE c.altura = :altura"), @NamedQuery(name = "Casas.findByMza", query = "SELECT c FROM Casas c WHERE c.mza = :mza"), @NamedQuery(name = "Casas.findByViviendas", query = "SELECT c FROM Casas c WHERE c.viviendas = :viviendas")})
public class Casas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "propiedades_id")
    private Integer propiedadesId;
    @Column(name = "calle")
    private String calle;
    @Column(name = "altura")
    private String altura;
    @Column(name = "mza")
    private String mza;
    @Column(name = "viviendas")
    private String viviendas;
    @JoinColumn(name = "propiedades_id", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Propiedades propiedades;

    public Casas() {
    }

    public Casas(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public Integer getPropiedadesId() {
        return propiedadesId;
    }

    public void setPropiedadesId(Integer propiedadesId) {
        this.propiedadesId = propiedadesId;
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

    public String getMza() {
        return mza;
    }

    public void setMza(String mza) {
        this.mza = mza;
    }

    public String getViviendas() {
        return viviendas;
    }

    public void setViviendas(String viviendas) {
        this.viviendas = viviendas;
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
        if (!(object instanceof Casas)) {
            return false;
        }
        Casas other = (Casas) object;
        if ((this.propiedadesId == null && other.propiedadesId != null) || (this.propiedadesId != null && !this.propiedadesId.equals(other.propiedadesId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Casas[propiedadesId=" + propiedadesId + "]";
    }

}
