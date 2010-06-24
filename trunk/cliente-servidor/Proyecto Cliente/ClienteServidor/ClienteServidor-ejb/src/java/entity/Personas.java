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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author justomiguel
 */
@Entity
@Table(name = "personas")
@NamedQueries({@NamedQuery(name = "Personas.findAll", query = "SELECT p FROM Personas p"), @NamedQuery(name = "Personas.findByCuilcuit", query = "SELECT p FROM Personas p WHERE p.cuilcuit = :cuilcuit"), @NamedQuery(name = "Personas.findByApellido", query = "SELECT p FROM Personas p WHERE p.apellido = :apellido"), @NamedQuery(name = "Personas.findByNombres", query = "SELECT p FROM Personas p WHERE p.nombres = :nombres"), @NamedQuery(name = "Personas.findByCalle", query = "SELECT p FROM Personas p WHERE p.calle = :calle"), @NamedQuery(name = "Personas.findByAltura", query = "SELECT p FROM Personas p WHERE p.altura = :altura"), @NamedQuery(name = "Personas.findByPiso", query = "SELECT p FROM Personas p WHERE p.piso = :piso"), @NamedQuery(name = "Personas.findByDpto", query = "SELECT p FROM Personas p WHERE p.dpto = :dpto"), @NamedQuery(name = "Personas.findByEmail", query = "SELECT p FROM Personas p WHERE p.email = :email")})
public class Personas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "cuilcuit")
    private Integer cuilcuit;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "nombres")
    private String nombres;
    @Column(name = "calle")
    private String calle;
    @Column(name = "altura")
    private String altura;
    @Column(name = "piso")
    private String piso;
    @Column(name = "dpto")
    private String dpto;
    @Column(name = "email")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personasCuilcuit")
    private Collection<Telefonos> telefonosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "inquilino")
    private Collection<Alquileres> alquileresCollection;
    @OneToMany(mappedBy = "garante")
    private Collection<Alquileres> alquileresCollection1;
    @JoinColumn(name = "Localidades_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Localidades localidadesid;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Empleados empleados;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personas")
    private Propietario propietario;

    public Personas() {
    }

    public Personas(Integer cuilcuit) {
        this.cuilcuit = cuilcuit;
    }

    public Integer getCuilcuit() {
        return cuilcuit;
    }

    public void setCuilcuit(Integer cuilcuit) {
        this.cuilcuit = cuilcuit;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Collection<Telefonos> getTelefonosCollection() {
        return telefonosCollection;
    }

    public void setTelefonosCollection(Collection<Telefonos> telefonosCollection) {
        this.telefonosCollection = telefonosCollection;
    }

    public Collection<Alquileres> getAlquileresCollection() {
        return alquileresCollection;
    }

    public void setAlquileresCollection(Collection<Alquileres> alquileresCollection) {
        this.alquileresCollection = alquileresCollection;
    }

    public Collection<Alquileres> getAlquileresCollection1() {
        return alquileresCollection1;
    }

    public void setAlquileresCollection1(Collection<Alquileres> alquileresCollection1) {
        this.alquileresCollection1 = alquileresCollection1;
    }

    public Localidades getLocalidadesid() {
        return localidadesid;
    }

    public void setLocalidadesid(Localidades localidadesid) {
        this.localidadesid = localidadesid;
    }

    public Empleados getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleados empleados) {
        this.empleados = empleados;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cuilcuit != null ? cuilcuit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Personas)) {
            return false;
        }
        Personas other = (Personas) object;
        if ((this.cuilcuit == null && other.cuilcuit != null) || (this.cuilcuit != null && !this.cuilcuit.equals(other.cuilcuit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return apellido+", "+nombres;
    }

}
