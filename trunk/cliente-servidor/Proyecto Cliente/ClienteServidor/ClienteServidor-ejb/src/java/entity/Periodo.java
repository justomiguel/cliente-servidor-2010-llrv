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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "periodo")
@NamedQueries({@NamedQuery(name = "Periodo.findAll", query = "SELECT p FROM Periodo p"), @NamedQuery(name = "Periodo.findById", query = "SELECT p FROM Periodo p WHERE p.id = :id"), @NamedQuery(name = "Periodo.findByNombreperiodo", query = "SELECT p FROM Periodo p WHERE p.nombreperiodo = :nombreperiodo"), @NamedQuery(name = "Periodo.findByDescripcion", query = "SELECT p FROM Periodo p WHERE p.descripcion = :descripcion")})
public class Periodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "nombreperiodo")
    private String nombreperiodo;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "periodo")
    private Collection<Costoporperiodo> costoporperiodoCollection;

    public Periodo() {
    }

    public Periodo(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombreperiodo() {
        return nombreperiodo;
    }

    public void setNombreperiodo(String nombreperiodo) {
        this.nombreperiodo = nombreperiodo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Collection<Costoporperiodo> getCostoporperiodoCollection() {
        return costoporperiodoCollection;
    }

    public void setCostoporperiodoCollection(Collection<Costoporperiodo> costoporperiodoCollection) {
        this.costoporperiodoCollection = costoporperiodoCollection;
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
        if (!(object instanceof Periodo)) {
            return false;
        }
        Periodo other = (Periodo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Periodo[id=" + id + "]";
    }

}
