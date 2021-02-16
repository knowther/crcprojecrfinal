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
@Table(name = "paciente_tem_sessao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteTemSessao.findAll", query = "SELECT p FROM PacienteTemSessao p")
    , @NamedQuery(name = "PacienteTemSessao.findByIdpacienteTemSessao", query = "SELECT p FROM PacienteTemSessao p WHERE p.idpacienteTemSessao = :idpacienteTemSessao")
    , @NamedQuery(name = "PacienteTemSessao.findByPacienteIdpaciente", query = "SELECT p FROM PacienteTemSessao p WHERE p.pacienteIdpaciente = :pacienteIdpaciente")
    , @NamedQuery(name = "PacienteTemSessao.findBySessaoIdsessao", query = "SELECT p FROM PacienteTemSessao p WHERE p.sessaoIdsessao = :sessaoIdsessao")})
public class PacienteTemSessao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpaciente_tem_sessao")
    private Integer idpacienteTemSessao;
    @Column(name = "paciente_idpaciente")
    private Integer pacienteIdpaciente;
    @Column(name = "sessao_idsessao")
    private Integer sessaoIdsessao;

    public PacienteTemSessao() {
    }

    public PacienteTemSessao(Integer idpacienteTemSessao) {
        this.idpacienteTemSessao = idpacienteTemSessao;
    }

    public Integer getIdpacienteTemSessao() {
        return idpacienteTemSessao;
    }

    public void setIdpacienteTemSessao(Integer idpacienteTemSessao) {
        this.idpacienteTemSessao = idpacienteTemSessao;
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
        hash += (idpacienteTemSessao != null ? idpacienteTemSessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteTemSessao)) {
            return false;
        }
        PacienteTemSessao other = (PacienteTemSessao) object;
        if ((this.idpacienteTemSessao == null && other.idpacienteTemSessao != null) || (this.idpacienteTemSessao != null && !this.idpacienteTemSessao.equals(other.idpacienteTemSessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.PacienteTemSessao[ idpacienteTemSessao=" + idpacienteTemSessao + " ]";
    }
    
}
