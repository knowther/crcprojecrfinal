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
@Table(name = "tiposanguineo", catalog = "testemodeldb2", schema = "")

public class Tiposanguineo implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiposanguineo")
    private Integer idtiposanguineo;
    @Column(name = "nometipo")
    private String nometipo;

    @OneToMany(mappedBy = "tiposanguineo")
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    
    public Tiposanguineo() {
    }

    public Tiposanguineo(Integer idtiposanguineo) {
        this.idtiposanguineo = idtiposanguineo;
    }

    public Integer getIdtiposanguineo() {
        return idtiposanguineo;
    }

    public void setIdtiposanguineo(Integer idtiposanguineo) {
        Integer oldIdtiposanguineo = this.idtiposanguineo;
        this.idtiposanguineo = idtiposanguineo;
        changeSupport.firePropertyChange("idtiposanguineo", oldIdtiposanguineo, idtiposanguineo);
    }

    public String getNometipo() {
        return nometipo;
    }

    public void setNometipo(String nometipo) {
        String oldNometipo = this.nometipo;
        this.nometipo = nometipo;
        changeSupport.firePropertyChange("nometipo", oldNometipo, nometipo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposanguineo != null ? idtiposanguineo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposanguineo)) {
            return false;
        }
        Tiposanguineo other = (Tiposanguineo) object;
        if ((this.idtiposanguineo == null && other.idtiposanguineo != null) || (this.idtiposanguineo != null && !this.idtiposanguineo.equals(other.idtiposanguineo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Tiposanguineo[ idtiposanguineo=" + idtiposanguineo + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
