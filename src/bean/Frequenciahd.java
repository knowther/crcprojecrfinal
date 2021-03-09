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
@Table(name = "frequenciahd", catalog = "dbclinicaii", schema = "")
public class Frequenciahd implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfrequenciahd")
    private Integer idfrequenciahd;
    @Column(name = "frequencia")
    private String frequencia;

    @OneToMany(mappedBy = "frequenciahd")
    private List<Paciente> pacientes = new ArrayList<Paciente>();
    
    public Frequenciahd() {
    }

    public Frequenciahd(Integer idfrequenciahd) {
        this.idfrequenciahd = idfrequenciahd;
    }

    public Integer getIdfrequenciahd() {
        return idfrequenciahd;
    }

    public void setIdfrequenciahd(Integer idfrequenciahd) {
        Integer oldIdfrequenciahd = this.idfrequenciahd;
        this.idfrequenciahd = idfrequenciahd;
        changeSupport.firePropertyChange("idfrequenciahd", oldIdfrequenciahd, idfrequenciahd);
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        String oldFrequencia = this.frequencia;
        this.frequencia = frequencia;
        changeSupport.firePropertyChange("frequencia", oldFrequencia, frequencia);
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfrequenciahd != null ? idfrequenciahd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Frequenciahd)) {
            return false;
        }
        Frequenciahd other = (Frequenciahd) object;
        if ((this.idfrequenciahd == null && other.idfrequenciahd != null) || (this.idfrequenciahd != null && !this.idfrequenciahd.equals(other.idfrequenciahd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Frequenciahd[ idfrequenciahd=" + idfrequenciahd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
