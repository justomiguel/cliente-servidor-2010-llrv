/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "costoporperiodo")
@NamedQueries({@NamedQuery(name = "Costoporperiodo.findAll", query = "SELECT c FROM Costoporperiodo c"), @NamedQuery(name = "Costoporperiodo.findByPropiedadesId", query = "SELECT c FROM Costoporperiodo c WHERE c.costoporperiodoPK.propiedadesId = :propiedadesId"), @NamedQuery(name = "Costoporperiodo.findByPeriodoId", query = "SELECT c FROM Costoporperiodo c WHERE c.costoporperiodoPK.periodoId = :periodoId"), @NamedQuery(name = "Costoporperiodo.findByMonto", query = "SELECT c FROM Costoporperiodo c WHERE c.monto = :monto"), @NamedQuery(name = "Costoporperiodo.findByPorcinteres", query = "SELECT c FROM Costoporperiodo c WHERE c.porcinteres = :porcinteres")})
public class Costoporperiodo implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CostoporperiodoPK costoporperiodoPK;
    @Column(name = "monto")
    private Float monto;
    @Column(name = "porcinteres")
    private Float porcinteres;
    @JoinColumn(name = "propiedades_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Propiedades propiedades;
    @JoinColumn(name = "periodo_id", referencedColumnName = "id", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Periodo periodo;

    public Costoporperiodo() {
    }

    public Costoporperiodo(CostoporperiodoPK costoporperiodoPK) {
        this.costoporperiodoPK = costoporperiodoPK;
    }

    public Costoporperiodo(int propiedadesId, int periodoId) {
        this.costoporperiodoPK = new CostoporperiodoPK(propiedadesId, periodoId);
    }

    public CostoporperiodoPK getCostoporperiodoPK() {
        return costoporperiodoPK;
    }

    public void setCostoporperiodoPK(CostoporperiodoPK costoporperiodoPK) {
        this.costoporperiodoPK = costoporperiodoPK;
    }

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }

    public Float getPorcinteres() {
        return porcinteres;
    }

    public void setPorcinteres(Float porcinteres) {
        this.porcinteres = porcinteres;
    }

    public Propiedades getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(Propiedades propiedades) {
        this.propiedades = propiedades;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (costoporperiodoPK != null ? costoporperiodoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Costoporperiodo)) {
            return false;
        }
        Costoporperiodo other = (Costoporperiodo) object;
        if ((this.costoporperiodoPK == null && other.costoporperiodoPK != null) || (this.costoporperiodoPK != null && !this.costoporperiodoPK.equals(other.costoporperiodoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Costoporperiodo[costoporperiodoPK=" + costoporperiodoPK + "]";
    }

}
