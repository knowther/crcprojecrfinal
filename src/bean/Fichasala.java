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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "fichasala", catalog = "testemodeldb2", schema = "")
public class Fichasala implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idfichasala")
    private Integer idfichasala;
    
    
    @ManyToOne
    private Paciente paciente;
    
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "heparina")
    private Float heparina;
    @Column(name = "ferro")
    private String ferro;
    @Column(name = "eritropoetina")
    private String eritropoetina;

    public Fichasala() {
    }

    public Fichasala(Integer idfichasala) {
        this.idfichasala = idfichasala;
    }

    public Integer getIdfichasala() {
        return idfichasala;
    }

    public void setIdfichasala(Integer idfichasala) {
        Integer oldIdfichasala = this.idfichasala;
        this.idfichasala = idfichasala;
        changeSupport.firePropertyChange("idfichasala", oldIdfichasala, idfichasala);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPacienteIdpaciente(Paciente pacienteIdpaciente) {
        Paciente oldPaciente = this.paciente;
        this.paciente = paciente;
        changeSupport.firePropertyChange("paciente", oldPaciente, paciente);
    }

    public Float getHeparina() {
        return heparina;
    }

    public void setHeparina(Float heparina) {
        Float oldHeparina = this.heparina;
        this.heparina = heparina;
        changeSupport.firePropertyChange("heparina", oldHeparina, heparina);
    }

    public String getFerro() {
        return ferro;
    }

    public void setFerro(String ferro) {
        String oldFerro = this.ferro;
        this.ferro = ferro;
        changeSupport.firePropertyChange("ferro", oldFerro, ferro);
    }

    public String getEritropoetina() {
        return eritropoetina;
    }

    public void setEritropoetina(String eritropoetina) {
        String oldEritropoetina = this.eritropoetina;
        this.eritropoetina = eritropoetina;
        changeSupport.firePropertyChange("eritropoetina", oldEritropoetina, eritropoetina);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idfichasala != null ? idfichasala.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fichasala)) {
            return false;
        }
        Fichasala other = (Fichasala) object;
        if ((this.idfichasala == null && other.idfichasala != null) || (this.idfichasala != null && !this.idfichasala.equals(other.idfichasala))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Fichasala[ idfichasala=" + idfichasala + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
