/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author justomiguel
 */
@Embeddable
public class CostoporperiodoPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "propiedades_id")
    private int propiedadesId;
    @Basic(optional = false)
    @Column(name = "periodo_id")
    private int periodoId;

    public CostoporperiodoPK(int propiedadesId, int periodoId) {
        this.propiedadesId = propiedadesId;
        this.periodoId = periodoId;
    }

    public int getPropiedadesId() {
        return propiedadesId;
    }

    public void setPropiedadesId(int propiedadesId) {
        this.propiedadesId = propiedadesId;
    }

    public int getPeriodoId() {
        return periodoId;
    }

    public void setPeriodoId(int periodoId) {
        this.periodoId = periodoId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) propiedadesId;
        hash += (int) periodoId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CostoporperiodoPK)) {
            return false;
        }
        CostoporperiodoPK other = (CostoporperiodoPK) object;
        if (this.propiedadesId != other.propiedadesId) {
            return false;
        }
        if (this.periodoId != other.periodoId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.CostoporperiodoPK[propiedadesId=" + propiedadesId + ", periodoId=" + periodoId + "]";
    }

}
