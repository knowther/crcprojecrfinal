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
@Table(name = "profissao", catalog = "clinica_crc", schema = "")

public class Profissao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idprofissao")
    private Integer idprofissao;
    @Column(name = "nome")
    private String nome;
    @Column(name = "codigo")
    private String codigo;
    
    @OneToMany(mappedBy = "profissao")
    private List<Paciente> pessoas = new ArrayList<Paciente>();

    public Profissao() {
    }

    public Profissao(Integer idprofissao) {
        this.idprofissao = idprofissao;
    }

    public Integer getIdprofissao() {
        return idprofissao;
    }

    public void setIdprofissao(Integer idprofissao) {
        Integer oldIdprofissao = this.idprofissao;
        this.idprofissao = idprofissao;
        changeSupport.firePropertyChange("idprofissao", oldIdprofissao, idprofissao);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        changeSupport.firePropertyChange("codigo", oldCodigo, codigo);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idprofissao != null ? idprofissao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissao)) {
            return false;
        }
        Profissao other = (Profissao) object;
        if ((this.idprofissao == null && other.idprofissao != null) || (this.idprofissao != null && !this.idprofissao.equals(other.idprofissao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return nome;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

    public List<Paciente> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Paciente> pessoas) {
        this.pessoas = pessoas;
    }
    
    
    
}
