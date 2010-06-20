/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "cuotas")
@NamedQueries({@NamedQuery(name = "Cuotas.findAll", query = "SELECT c FROM Cuotas c"), @NamedQuery(name = "Cuotas.findById", query = "SELECT c FROM Cuotas c WHERE c.id = :id"), @NamedQuery(name = "Cuotas.findByMonto", query = "SELECT c FROM Cuotas c WHERE c.monto = :monto"), @NamedQuery(name = "Cuotas.findByFecha", query = "SELECT c FROM Cuotas c WHERE c.fecha = :fecha"), @NamedQuery(name = "Cuotas.findByEstado", query = "SELECT c FROM Cuotas c WHERE c.estado = :estado"), @NamedQuery(name = "Cuotas.findByObservacion", query = "SELECT c FROM Cuotas c WHERE c.observacion = :observacion")})
public class Cuotas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "monto")
    private Float monto;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "estado")
    private String estado;
    @Column(name = "observacion")
    private String observacion;
    @JoinColumn(name = "Alquileres_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Alquileres alquileresid;

    public Cuotas() {
    }

    public Cuotas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Alquileres getAlquileresid() {
        return alquileresid;
    }

    public void setAlquileresid(Alquileres alquileresid) {
        this.alquileresid = alquileresid;
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
        if (!(object instanceof Cuotas)) {
            return false;
        }
        Cuotas other = (Cuotas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Cuotas[id=" + id + "]";
    }

}
