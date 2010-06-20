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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "alquileres")
@NamedQueries({@NamedQuery(name = "Alquileres.findAll", query = "SELECT a FROM Alquileres a"), @NamedQuery(name = "Alquileres.findById", query = "SELECT a FROM Alquileres a WHERE a.id = :id"), @NamedQuery(name = "Alquileres.findByEstado", query = "SELECT a FROM Alquileres a WHERE a.estado = :estado"), @NamedQuery(name = "Alquileres.findByFechadeincio", query = "SELECT a FROM Alquileres a WHERE a.fechadeincio = :fechadeincio"), @NamedQuery(name = "Alquileres.findByDuracion", query = "SELECT a FROM Alquileres a WHERE a.duracion = :duracion"), @NamedQuery(name = "Alquileres.findByFechadebaja", query = "SELECT a FROM Alquileres a WHERE a.fechadebaja = :fechadebaja"), @NamedQuery(name = "Alquileres.findByDetalles", query = "SELECT a FROM Alquileres a WHERE a.detalles = :detalles")})
public class Alquileres implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "estado")
    private String estado;
    @Column(name = "fechadeincio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadeincio;
    @Column(name = "duracion")
    private String duracion;
    @Column(name = "fechadebaja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechadebaja;
    @Column(name = "detalles")
    private String detalles;
    @JoinColumn(name = "Propiedades_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Propiedades propiedadesid;
    @JoinColumn(name = "inquilino", referencedColumnName = "cuilcuit")
    @ManyToOne(optional = false)
    private Personas inquilino;
    @JoinColumn(name = "garante", referencedColumnName = "cuilcuit")
    @ManyToOne
    private Personas garante;
    @JoinColumn(name = "empleados", referencedColumnName = "personas_cuilcuit")
    @ManyToOne(optional = false)
    private Empleados empleados;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alquileresid")
    private Collection<Cuotas> cuotasCollection;

    public Alquileres() {
    }

    public Alquileres(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechadeincio() {
        return fechadeincio;
    }

    public void setFechadeincio(Date fechadeincio) {
        this.fechadeincio = fechadeincio;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public Date getFechadebaja() {
        return fechadebaja;
    }

    public void setFechadebaja(Date fechadebaja) {
        this.fechadebaja = fechadebaja;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Propiedades getPropiedadesid() {
        return propiedadesid;
    }

    public void setPropiedadesid(Propiedades propiedadesid) {
        this.propiedadesid = propiedadesid;
    }

    public Personas getInquilino() {
        return inquilino;
    }

    public void setInquilino(Personas inquilino) {
        this.inquilino = inquilino;
    }

    public Personas getGarante() {
        return garante;
    }

    public void setGarante(Personas garante) {
        this.garante = garante;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Collection<Cuotas> getCuotasCollection() {
        return cuotasCollection;
    }

    public void setCuotasCollection(Collection<Cuotas> cuotasCollection) {
        this.cuotasCollection = cuotasCollection;
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
        if (!(object instanceof Alquileres)) {
            return false;
        }
        Alquileres other = (Alquileres) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Alquileres[id=" + id + "]";
    }

}
