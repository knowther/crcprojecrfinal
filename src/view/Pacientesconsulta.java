/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
import javax.persistence.Transient;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "pacientesconsulta", catalog = "sultest", schema = "")
@NamedQueries({
    @NamedQuery(name = "Pacientesconsulta.findAll", query = "SELECT p FROM Pacientesconsulta p")
    , @NamedQuery(name = "Pacientesconsulta.findByIdpacientesConsulta", query = "SELECT p FROM Pacientesconsulta p WHERE p.idpacientesConsulta = :idpacientesConsulta")
    , @NamedQuery(name = "Pacientesconsulta.findByNome", query = "SELECT p FROM Pacientesconsulta p WHERE p.nome = :nome")
    , @NamedQuery(name = "Pacientesconsulta.findByApelido", query = "SELECT p FROM Pacientesconsulta p WHERE p.apelido = :apelido")
    , @NamedQuery(name = "Pacientesconsulta.findByIdade", query = "SELECT p FROM Pacientesconsulta p WHERE p.idade = :idade")
    , @NamedQuery(name = "Pacientesconsulta.findByEndere\u00e7o", query = "SELECT p FROM Pacientesconsulta p WHERE p.endere\u00e7o = :endere\u00e7o")
    , @NamedQuery(name = "Pacientesconsulta.findByBairro", query = "SELECT p FROM Pacientesconsulta p WHERE p.bairro = :bairro")
    , @NamedQuery(name = "Pacientesconsulta.findByTel", query = "SELECT p FROM Pacientesconsulta p WHERE p.tel = :tel")
    , @NamedQuery(name = "Pacientesconsulta.findByTel2", query = "SELECT p FROM Pacientesconsulta p WHERE p.tel2 = :tel2")
    , @NamedQuery(name = "Pacientesconsulta.findByDataNasc", query = "SELECT p FROM Pacientesconsulta p WHERE p.dataNasc = :dataNasc")
    , @NamedQuery(name = "Pacientesconsulta.findByCpf", query = "SELECT p FROM Pacientesconsulta p WHERE p.cpf = :cpf")
    , @NamedQuery(name = "Pacientesconsulta.findByRg", query = "SELECT p FROM Pacientesconsulta p WHERE p.rg = :rg")
    , @NamedQuery(name = "Pacientesconsulta.findByMedicosIdmedicos", query = "SELECT p FROM Pacientesconsulta p WHERE p.medicosIdmedicos = :medicosIdmedicos")
    , @NamedQuery(name = "Pacientesconsulta.findByCidadeIdcidade", query = "SELECT p FROM Pacientesconsulta p WHERE p.cidadeIdcidade = :cidadeIdcidade")
    , @NamedQuery(name = "Pacientesconsulta.findByEstadoIdestado", query = "SELECT p FROM Pacientesconsulta p WHERE p.estadoIdestado = :estadoIdestado")})
public class Pacientesconsulta implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idpacientesConsulta")
    private Integer idpacientesConsulta;
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Apelido")
    private String apelido;
    @Column(name = "Idade")
    private String idade;
    @Column(name = "Endere\u00e7o")
    private String endereço;
    @Column(name = "Bairro")
    private String bairro;
    @Column(name = "Tel")
    private String tel;
    @Column(name = "Tel2")
    private String tel2;
    @Column(name = "dataNasc")
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "rg")
    private String rg;
    @Basic(optional = false)
    @Column(name = "medicos_idmedicos")
    private int medicosIdmedicos;
    @Basic(optional = false)
    @Column(name = "cidade_idcidade")
    private int cidadeIdcidade;
    @Basic(optional = false)
    @Column(name = "estado_idestado")
    private int estadoIdestado;

    public Pacientesconsulta() {
    }

    public Pacientesconsulta(Integer idpacientesConsulta) {
        this.idpacientesConsulta = idpacientesConsulta;
    }

    public Pacientesconsulta(Integer idpacientesConsulta, int medicosIdmedicos, int cidadeIdcidade, int estadoIdestado) {
        this.idpacientesConsulta = idpacientesConsulta;
        this.medicosIdmedicos = medicosIdmedicos;
        this.cidadeIdcidade = cidadeIdcidade;
        this.estadoIdestado = estadoIdestado;
    }

    public Integer getIdpacientesConsulta() {
        return idpacientesConsulta;
    }

    public void setIdpacientesConsulta(Integer idpacientesConsulta) {
        Integer oldIdpacientesConsulta = this.idpacientesConsulta;
        this.idpacientesConsulta = idpacientesConsulta;
        changeSupport.firePropertyChange("idpacientesConsulta", oldIdpacientesConsulta, idpacientesConsulta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        String oldApelido = this.apelido;
        this.apelido = apelido;
        changeSupport.firePropertyChange("apelido", oldApelido, apelido);
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        String oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        String oldEndereço = this.endereço;
        this.endereço = endereço;
        changeSupport.firePropertyChange("endere\u00e7o", oldEndereço, endereço);
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        changeSupport.firePropertyChange("bairro", oldBairro, bairro);
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        String oldTel = this.tel;
        this.tel = tel;
        changeSupport.firePropertyChange("tel", oldTel, tel);
    }

    public String getTel2() {
        return tel2;
    }

    public void setTel2(String tel2) {
        String oldTel2 = this.tel2;
        this.tel2 = tel2;
        changeSupport.firePropertyChange("tel2", oldTel2, tel2);
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        Date oldDataNasc = this.dataNasc;
        this.dataNasc = dataNasc;
        changeSupport.firePropertyChange("dataNasc", oldDataNasc, dataNasc);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        String oldRg = this.rg;
        this.rg = rg;
        changeSupport.firePropertyChange("rg", oldRg, rg);
    }

    public int getMedicosIdmedicos() {
        return medicosIdmedicos;
    }

    public void setMedicosIdmedicos(int medicosIdmedicos) {
        int oldMedicosIdmedicos = this.medicosIdmedicos;
        this.medicosIdmedicos = medicosIdmedicos;
        changeSupport.firePropertyChange("medicosIdmedicos", oldMedicosIdmedicos, medicosIdmedicos);
    }

    public int getCidadeIdcidade() {
        return cidadeIdcidade;
    }

    public void setCidadeIdcidade(int cidadeIdcidade) {
        int oldCidadeIdcidade = this.cidadeIdcidade;
        this.cidadeIdcidade = cidadeIdcidade;
        changeSupport.firePropertyChange("cidadeIdcidade", oldCidadeIdcidade, cidadeIdcidade);
    }

    public int getEstadoIdestado() {
        return estadoIdestado;
    }

    public void setEstadoIdestado(int estadoIdestado) {
        int oldEstadoIdestado = this.estadoIdestado;
        this.estadoIdestado = estadoIdestado;
        changeSupport.firePropertyChange("estadoIdestado", oldEstadoIdestado, estadoIdestado);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpacientesConsulta != null ? idpacientesConsulta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientesconsulta)) {
            return false;
        }
        Pacientesconsulta other = (Pacientesconsulta) object;
        if ((this.idpacientesConsulta == null && other.idpacientesConsulta != null) || (this.idpacientesConsulta != null && !this.idpacientesConsulta.equals(other.idpacientesConsulta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Pacientesconsulta[ idpacientesConsulta=" + idpacientesConsulta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
