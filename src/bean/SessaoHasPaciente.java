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
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "sessao_has_paciente", catalog = "testemodeldb2", schema = "")
public class SessaoHasPaciente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsessao_has_paciente")
    private Integer idsessaoHasPaciente;
    
    @ManyToOne
    @JoinColumn(name = "sessao_idsessao")
    private Sessao sessao;
    
    @ManyToOne
    @JoinColumn(name = "paciente_idpaciente")
    private Paciente paciente;

    public SessaoHasPaciente() {
    }

    public SessaoHasPaciente(Integer idsessaoHasPaciente) {
        this.idsessaoHasPaciente = idsessaoHasPaciente;
    }

    public Integer getIdsessaoHasPaciente() {
        return idsessaoHasPaciente;
    }

    public void setIdsessaoHasPaciente(Integer idsessaoHasPaciente) {
        Integer oldIdsessaoHasPaciente = this.idsessaoHasPaciente;
        this.idsessaoHasPaciente = idsessaoHasPaciente;
        changeSupport.firePropertyChange("idsessaoHasPaciente", oldIdsessaoHasPaciente, idsessaoHasPaciente);
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        Sessao oldSessao = this.sessao;
        this.sessao = sessao;
        changeSupport.firePropertyChange("sessao", oldSessao, sessao);
    }

        public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente oldPaciente = this.paciente;
        this.paciente = paciente;
        changeSupport.firePropertyChange("paciente", oldPaciente, paciente);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsessaoHasPaciente != null ? idsessaoHasPaciente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SessaoHasPaciente)) {
            return false;
        }
        SessaoHasPaciente other = (SessaoHasPaciente) object;
        if ((this.idsessaoHasPaciente == null && other.idsessaoHasPaciente != null) || (this.idsessaoHasPaciente != null && !this.idsessaoHasPaciente.equals(other.idsessaoHasPaciente))) {
            return false;
        }
        return true;
    }

      @Override
    public String toString() {
        return "bean.SessaoHasPaciente[ idsessaohaspaciente=" + idsessaoHasPaciente + " ]";
    }
  

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
