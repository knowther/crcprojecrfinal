/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "paciente_realizou_sessao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteRealizouSessao.findAll", query = "SELECT p FROM PacienteRealizouSessao p")
    , @NamedQuery(name = "PacienteRealizouSessao.findByIdpacientesessao", query = "SELECT p FROM PacienteRealizouSessao p WHERE p.idpacientesessao = :idpacientesessao")
    , @NamedQuery(name = "PacienteRealizouSessao.findByPacienteIdpaciente", query = "SELECT p FROM PacienteRealizouSessao p WHERE p.pacienteIdpaciente = :pacienteIdpaciente")
    , @NamedQuery(name = "PacienteRealizouSessao.findBySessaoIdsessao", query = "SELECT p FROM PacienteRealizouSessao p WHERE p.sessaoIdsessao = :sessaoIdsessao")
    , @NamedQuery(name = "PacienteRealizouSessao.findByDatasessao", query = "SELECT p FROM PacienteRealizouSessao p WHERE p.datasessao = :datasessao")})
public class PacienteRealizouSessao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacientesessao")
    private Integer idpacientesessao;
    @Column(name = "paciente_idpaciente")
    private Integer pacienteIdpaciente;
    @Column(name = "sessao_idsessao")
    private Integer sessaoIdsessao;
    @Column(name = "datasessao")
    @Temporal(TemporalType.DATE)
    private Date datasessao;

    public PacienteRealizouSessao() {
    }

    public PacienteRealizouSessao(Integer idpacientesessao) {
        this.idpacientesessao = idpacientesessao;
    }

    public Integer getIdpacientesessao() {
        return idpacientesessao;
    }

    public void setIdpacientesessao(Integer idpacientesessao) {
        this.idpacientesessao = idpacientesessao;
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

    public Date getDatasessao() {
        return datasessao;
    }

    public void setDatasessao(Date datasessao) {
        this.datasessao = datasessao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacientesessao != null ? idpacientesessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteRealizouSessao)) {
            return false;
        }
        PacienteRealizouSessao other = (PacienteRealizouSessao) object;
        if ((this.idpacientesessao == null && other.idpacientesessao != null) || (this.idpacientesessao != null && !this.idpacientesessao.equals(other.idpacientesessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.PacienteRealizouSessao[ idpacientesessao=" + idpacientesessao + " ]";
    }
    
}
