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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "paciente_has_tiposdeclaracao", catalog = "testemodeldb2", schema = "")

public class PacienteHasTiposdeclaracao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente_has_tiposdeclaracao")
    private Integer idpacienteHasTiposdeclaracao;
    
    @ManyToOne
    @JoinColumn(name = "paciente_idpaciente")
    private Paciente paciente;
    
    @ManyToOne
    @JoinColumn(name = "tiposdeclaracao_idtiposdeclaracao")
    private Tiposdeclaracao tiposdeclaracao;

    public PacienteHasTiposdeclaracao() {
    }

    public PacienteHasTiposdeclaracao(Integer idpacienteHasTiposdeclaracao) {
        this.idpacienteHasTiposdeclaracao = idpacienteHasTiposdeclaracao;
    }

    public Integer getIdpacienteHasTiposdeclaracao() {
        return idpacienteHasTiposdeclaracao;
    }

    public void setIdpacienteHasTiposdeclaracao(Integer idpacienteHasTiposdeclaracao) {
        Integer oldIdpacienteHasTiposdeclaracao = this.idpacienteHasTiposdeclaracao;
        this.idpacienteHasTiposdeclaracao = idpacienteHasTiposdeclaracao;
        changeSupport.firePropertyChange("idpacienteHasTiposdeclaracao", oldIdpacienteHasTiposdeclaracao, idpacienteHasTiposdeclaracao);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente oldPaciente = this.paciente;
        this.paciente = paciente;
        changeSupport.firePropertyChange("paciente", oldPaciente, paciente);
    }

    public Tiposdeclaracao getTiposdeclaracao() {
        return tiposdeclaracao;
    }

    public void setTiposdeclaracao(Tiposdeclaracao tiposdeclaracao) {
        Tiposdeclaracao oldTiposdeclaracao = this.tiposdeclaracao;
        this.tiposdeclaracao = tiposdeclaracao;
        changeSupport.firePropertyChange("tiposdeclaracao", oldTiposdeclaracao, tiposdeclaracao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacienteHasTiposdeclaracao != null ? idpacienteHasTiposdeclaracao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteHasTiposdeclaracao)) {
            return false;
        }
        PacienteHasTiposdeclaracao other = (PacienteHasTiposdeclaracao) object;
        if ((this.idpacienteHasTiposdeclaracao == null && other.idpacienteHasTiposdeclaracao != null) || (this.idpacienteHasTiposdeclaracao != null && !this.idpacienteHasTiposdeclaracao.equals(other.idpacienteHasTiposdeclaracao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.PacienteHasTiposdeclaracao[ idpacienteHasTiposdeclaracao=" + idpacienteHasTiposdeclaracao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
