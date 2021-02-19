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
@NamedQueries({
    @NamedQuery(name = "SessaoHasPaciente.findAll", query = "SELECT s FROM SessaoHasPaciente s")
    , @NamedQuery(name = "SessaoHasPaciente.findByIdsessaoHasPaciente", query = "SELECT s FROM SessaoHasPaciente s WHERE s.idsessaoHasPaciente = :idsessaoHasPaciente")
    , @NamedQuery(name = "SessaoHasPaciente.findBySessaoIdsessao", query = "SELECT s FROM SessaoHasPaciente s WHERE s.sessaoIdsessao = :sessaoIdsessao")
    , @NamedQuery(name = "SessaoHasPaciente.findByPacienteIdpaciente", query = "SELECT s FROM SessaoHasPaciente s WHERE s.pacienteIdpaciente = :pacienteIdpaciente")})
public class SessaoHasPaciente implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsessao_has_paciente")
    private Integer idsessaoHasPaciente;
    @Column(name = "sessao_idsessao")
    private Integer sessaoIdsessao;
    @Column(name = "paciente_idpaciente")
    private Integer pacienteIdpaciente;

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

    public Integer getSessaoIdsessao() {
        return sessaoIdsessao;
    }

    public void setSessaoIdsessao(Integer sessaoIdsessao) {
        Integer oldSessaoIdsessao = this.sessaoIdsessao;
        this.sessaoIdsessao = sessaoIdsessao;
        changeSupport.firePropertyChange("sessaoIdsessao", oldSessaoIdsessao, sessaoIdsessao);
    }

    public Integer getPacienteIdpaciente() {
        return pacienteIdpaciente;
    }

    public void setPacienteIdpaciente(Integer pacienteIdpaciente) {
        Integer oldPacienteIdpaciente = this.pacienteIdpaciente;
        this.pacienteIdpaciente = pacienteIdpaciente;
        changeSupport.firePropertyChange("pacienteIdpaciente", oldPacienteIdpaciente, pacienteIdpaciente);
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
        return "bean.SessaoHasPaciente[ idsessaoHasPaciente=" + idsessaoHasPaciente + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
