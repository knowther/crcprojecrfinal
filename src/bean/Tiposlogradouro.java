/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "tiposlogradouro", catalog = "dbclinicaii", schema = "")

public class Tiposlogradouro implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiposlogradouro")
    private Integer idtiposlogradouro;
    @Column(name = "tipologradouro")
    private String tipologradouro;
    
    @OneToMany(mappedBy = "tiposlogradouro")
    private List<Paciente> pacientes = new ArrayList<Paciente>();

    public Tiposlogradouro() {
    }

    public Tiposlogradouro(Integer idtiposlogradouro) {
        this.idtiposlogradouro = idtiposlogradouro;
    }

    public Integer getIdtiposlogradouro() {
        return idtiposlogradouro;
    }

    public void setIdtiposlogradouro(Integer idtiposlogradouro) {
        Integer oldIdtiposlogradouro = this.idtiposlogradouro;
        this.idtiposlogradouro = idtiposlogradouro;
        changeSupport.firePropertyChange("idtiposlogradouro", oldIdtiposlogradouro, idtiposlogradouro);
    }

    public String getTipologradouro() {
        return tipologradouro;
    }

    public void setTipologradouro(String tipologradouro) {
        String oldTipologradouro = this.tipologradouro;
        this.tipologradouro = tipologradouro;
        changeSupport.firePropertyChange("tipologradouro", oldTipologradouro, tipologradouro);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposlogradouro != null ? idtiposlogradouro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposlogradouro)) {
            return false;
        }
        Tiposlogradouro other = (Tiposlogradouro) object;
        if ((this.idtiposlogradouro == null && other.idtiposlogradouro != null) || (this.idtiposlogradouro != null && !this.idtiposlogradouro.equals(other.idtiposlogradouro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipologradouro;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
