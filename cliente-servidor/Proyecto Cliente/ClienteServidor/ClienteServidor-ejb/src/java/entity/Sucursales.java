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
@Table(name = "sucursales")
@NamedQueries({@NamedQuery(name = "Sucursales.findAll", query = "SELECT s FROM Sucursales s"), @NamedQuery(name = "Sucursales.findById", query = "SELECT s FROM Sucursales s WHERE s.id = :id"), @NamedQuery(name = "Sucursales.findByCalle", query = "SELECT s FROM Sucursales s WHERE s.calle = :calle"), @NamedQuery(name = "Sucursales.findByAltura", query = "SELECT s FROM Sucursales s WHERE s.altura = :altura"), @NamedQuery(name = "Sucursales.findByPiso", query = "SELECT s FROM Sucursales s WHERE s.piso = :piso"), @NamedQuery(name = "Sucursales.findByDpto", query = "SELECT s FROM Sucursales s WHERE s.dpto = :dpto"), @NamedQuery(name = "Sucursales.findByTelefono", query = "SELECT s FROM Sucursales s WHERE s.telefono = :telefono"), @NamedQuery(name = "Sucursales.findByFax", query = "SELECT s FROM Sucursales s WHERE s.fax = :fax"), @NamedQuery(name = "Sucursales.findByBajalogica", query = "SELECT s FROM Sucursales s WHERE s.bajalogica = :bajalogica")})
public class Sucursales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "calle")
    private String calle;
    @Column(name = "altura")
    private String altura;
    @Column(name = "piso")
    private String piso;
    @Column(name = "dpto")
    private String dpto;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "fax")
    private String fax;
    @Column(name = "bajalogica")
    private Boolean bajalogica;
    @JoinColumn(name = "Inmobiliaria_nombre", referencedColumnName = "nombre")
    @ManyToOne(optional = false)
    private Inmobiliaria inmobiliarianombre;
    @JoinColumn(name = "Localidades_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Localidades localidadesid;

    public Sucursales() {
    }

    public Sucursales(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDpto() {
        return dpto;
    }

    public void setDpto(String dpto) {
        this.dpto = dpto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Boolean getBajalogica() {
        return bajalogica;
    }

    public void setBajalogica(Boolean bajalogica) {
        this.bajalogica = bajalogica;
    }

    public Inmobiliaria getInmobiliarianombre() {
        return inmobiliarianombre;
    }

    public void setInmobiliarianombre(Inmobiliaria inmobiliarianombre) {
        this.inmobiliarianombre = inmobiliarianombre;
    }

    public Localidades getLocalidadesid() {
        return localidadesid;
    }

    public void setLocalidadesid(Localidades localidadesid) {
        this.localidadesid = localidadesid;
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
        if (!(object instanceof Sucursales)) {
            return false;
        }
        Sucursales other = (Sucursales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Sucursales[id=" + id + "]";
    }

}
