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
@Table(name = "caracteristicasprop")
@NamedQueries({@NamedQuery(name = "Caracteristicasprop.findAll", query = "SELECT c FROM Caracteristicasprop c"), @NamedQuery(name = "Caracteristicasprop.findById", query = "SELECT c FROM Caracteristicasprop c WHERE c.id = :id"), @NamedQuery(name = "Caracteristicasprop.findByCantidad", query = "SELECT c FROM Caracteristicasprop c WHERE c.cantidad = :cantidad"), @NamedQuery(name = "Caracteristicasprop.findByDetalles", query = "SELECT c FROM Caracteristicasprop c WHERE c.detalles = :detalles")})
public class Caracteristicasprop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "cantidad")
    private Integer cantidad;
    @Column(name = "detalles")
    private String detalles;
    @JoinColumn(name = "CaracteristicasTipo_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Caracteristicas caracteristicasTipoid;
    @JoinColumn(name = "Propiedades_id", referencedColumnName = "id")
    @ManyToOne
    private Propiedades propiedadesid;

    public Caracteristicasprop() {
    }

    public Caracteristicasprop(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Caracteristicas getCaracteristicasTipoid() {
        return caracteristicasTipoid;
    }

    public void setCaracteristicasTipoid(Caracteristicas caracteristicasTipoid) {
        this.caracteristicasTipoid = caracteristicasTipoid;
    }

    public Propiedades getPropiedadesid() {
        return propiedadesid;
    }

    public void setPropiedadesid(Propiedades propiedadesid) {
        this.propiedadesid = propiedadesid;
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
        if (!(object instanceof Caracteristicasprop)) {
            return false;
        }
        Caracteristicasprop other = (Caracteristicasprop) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Caracteristicasprop[id=" + id + "]";
    }

}
