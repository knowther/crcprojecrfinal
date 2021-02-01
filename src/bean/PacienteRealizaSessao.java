/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "paciente_realiza_sessao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteRealizaSessao.findAll", query = "SELECT p FROM PacienteRealizaSessao p")
    , @NamedQuery(name = "PacienteRealizaSessao.findByIdsessao", query = "SELECT p FROM PacienteRealizaSessao p WHERE p.idsessao = :idsessao")
    , @NamedQuery(name = "PacienteRealizaSessao.findByPacienteIdpaciente", query = "SELECT p FROM PacienteRealizaSessao p WHERE p.pacienteIdpaciente = :pacienteIdpaciente")
    , @NamedQuery(name = "PacienteRealizaSessao.findBySessaoIdsessao", query = "SELECT p FROM PacienteRealizaSessao p WHERE p.sessaoIdsessao = :sessaoIdsessao")})
public class PacienteRealizaSessao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsessao")
    private Integer idsessao;
    @Column(name = "paciente_idpaciente")
    private Integer pacienteIdpaciente;
    @Column(name = "sessao_idsessao")
    private Integer sessaoIdsessao;

    public PacienteRealizaSessao() {
    }

    public PacienteRealizaSessao(Integer idsessao) {
        this.idsessao = idsessao;
    }

    public Integer getIdsessao() {
        return idsessao;
    }

    public void setIdsessao(Integer idsessao) {
        this.idsessao = idsessao;
    }

    public Integer getPacienteIdpaciente() {
        return pacienteIdpaciente;
    }

    public void setPacienteIdpaciente(Integer pacienteIdpaciente) {
        this.pacienteIdpaciente = pacienteIdpaciente;
    }

    public Integer getSessaoIdsessao() {
        return sessaoIdsessao;
    }

    public void setSessaoIdsessao(Integer sessaoIdsessao) {
        this.sessaoIdsessao = sessaoIdsessao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsessao != null ? idsessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteRealizaSessao)) {
            return false;
        }
        PacienteRealizaSessao other = (PacienteRealizaSessao) object;
        if ((this.idsessao == null && other.idsessao != null) || (this.idsessao != null && !this.idsessao.equals(other.idsessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.PacienteRealizaSessao[ idsessao=" + idsessao + " ]";
    }
    
}
