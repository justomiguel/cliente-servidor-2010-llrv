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
@Table(name = "imagenes")
@NamedQueries({@NamedQuery(name = "Imagenes.findAll", query = "SELECT i FROM Imagenes i"), @NamedQuery(name = "Imagenes.findById", query = "SELECT i FROM Imagenes i WHERE i.id = :id"), @NamedQuery(name = "Imagenes.findByImagen", query = "SELECT i FROM Imagenes i WHERE i.imagen = :imagen"), @NamedQuery(name = "Imagenes.findByDetalles", query = "SELECT i FROM Imagenes i WHERE i.detalles = :detalles")})
public class Imagenes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "imagen")
    private String imagen;
    @Column(name = "detalles")
    private String detalles;
    @JoinColumn(name = "Tiposdeimagenes_id", referencedColumnName = "id")
    @ManyToOne
    private Tiposdeimagenes tiposdeimagenesid;
    @JoinColumn(name = "Propiedades_id", referencedColumnName = "id")
    @ManyToOne
    private Propiedades propiedadesid;

    public Imagenes() {
    }

    public Imagenes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Tiposdeimagenes getTiposdeimagenesid() {
        return tiposdeimagenesid;
    }

    public void setTiposdeimagenesid(Tiposdeimagenes tiposdeimagenesid) {
        this.tiposdeimagenesid = tiposdeimagenesid;
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
        if (!(object instanceof Imagenes)) {
            return false;
        }
        Imagenes other = (Imagenes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Imagenes[id=" + id + "]";
    }

}
