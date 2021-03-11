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
@Table(name = "tipodedialise", catalog = "dbclinicaii", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tipodedialise.findAll", query = "SELECT t FROM Tipodedialise t")
    , @NamedQuery(name = "Tipodedialise.findByIdtipodedialise", query = "SELECT t FROM Tipodedialise t WHERE t.idtipodedialise = :idtipodedialise")
    , @NamedQuery(name = "Tipodedialise.findByTipodedialise", query = "SELECT t FROM Tipodedialise t WHERE t.tipodedialise = :tipodedialise")})
public class Tipodedialise implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtipodedialise")
    private Integer idtipodedialise;
    @Column(name = "tipodedialise")
    private String tipodedialise;

    public Tipodedialise() {
    }

    public Tipodedialise(Integer idtipodedialise) {
        this.idtipodedialise = idtipodedialise;
    }

    public Integer getIdtipodedialise() {
        return idtipodedialise;
    }

    public void setIdtipodedialise(Integer idtipodedialise) {
        Integer oldIdtipodedialise = this.idtipodedialise;
        this.idtipodedialise = idtipodedialise;
        changeSupport.firePropertyChange("idtipodedialise", oldIdtipodedialise, idtipodedialise);
    }

    public String getTipodedialise() {
        return tipodedialise;
    }

    public void setTipodedialise(String tipodedialise) {
        String oldTipodedialise = this.tipodedialise;
        this.tipodedialise = tipodedialise;
        changeSupport.firePropertyChange("tipodedialise", oldTipodedialise, tipodedialise);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipodedialise != null ? idtipodedialise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipodedialise)) {
            return false;
        }
        Tipodedialise other = (Tipodedialise) object;
        if ((this.idtipodedialise == null && other.idtipodedialise != null) || (this.idtipodedialise != null && !this.idtipodedialise.equals(other.idtipodedialise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipodedialise;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
