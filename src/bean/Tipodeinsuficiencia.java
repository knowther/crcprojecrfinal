/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "tipodeinsuficiencia", catalog = "dbclinicaii", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tipodeinsuficiencia.findAll", query = "SELECT t FROM Tipodeinsuficiencia t")
    , @NamedQuery(name = "Tipodeinsuficiencia.findByIdtipodeinsuficiencia", query = "SELECT t FROM Tipodeinsuficiencia t WHERE t.idtipodeinsuficiencia = :idtipodeinsuficiencia")
    , @NamedQuery(name = "Tipodeinsuficiencia.findByTipodeinsuficiencia", query = "SELECT t FROM Tipodeinsuficiencia t WHERE t.tipodeinsuficiencia = :tipodeinsuficiencia")})
public class Tipodeinsuficiencia implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtipodeinsuficiencia")
    private Integer idtipodeinsuficiencia;
    @Column(name = "tipodeinsuficiencia")
    private String tipodeinsuficiencia;

    public Tipodeinsuficiencia() {
    }

    public Tipodeinsuficiencia(Integer idtipodeinsuficiencia) {
        this.idtipodeinsuficiencia = idtipodeinsuficiencia;
    }

    public Integer getIdtipodeinsuficiencia() {
        return idtipodeinsuficiencia;
    }

    public void setIdtipodeinsuficiencia(Integer idtipodeinsuficiencia) {
        Integer oldIdtipodeinsuficiencia = this.idtipodeinsuficiencia;
        this.idtipodeinsuficiencia = idtipodeinsuficiencia;
        changeSupport.firePropertyChange("idtipodeinsuficiencia", oldIdtipodeinsuficiencia, idtipodeinsuficiencia);
    }

    public String getTipodeinsuficiencia() {
        return tipodeinsuficiencia;
    }

    public void setTipodeinsuficiencia(String tipodeinsuficiencia) {
        String oldTipodeinsuficiencia = this.tipodeinsuficiencia;
        this.tipodeinsuficiencia = tipodeinsuficiencia;
        changeSupport.firePropertyChange("tipodeinsuficiencia", oldTipodeinsuficiencia, tipodeinsuficiencia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodeinsuficiencia != null ? idtipodeinsuficiencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodeinsuficiencia)) {
            return false;
        }
        Tipodeinsuficiencia other = (Tipodeinsuficiencia) object;
        if ((this.idtipodeinsuficiencia == null && other.idtipodeinsuficiencia != null) || (this.idtipodeinsuficiencia != null && !this.idtipodeinsuficiencia.equals(other.idtipodeinsuficiencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipodeinsuficiencia;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
