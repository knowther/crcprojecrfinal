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
@Table(name = "tiposdeclaracao", catalog = "testemodeldb2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tiposdeclaracao.findAll", query = "SELECT t FROM Tiposdeclaracao t")
    , @NamedQuery(name = "Tiposdeclaracao.findByIdtiposdeclaracao", query = "SELECT t FROM Tiposdeclaracao t WHERE t.idtiposdeclaracao = :idtiposdeclaracao")
    , @NamedQuery(name = "Tiposdeclaracao.findByTipodadeclaracao", query = "SELECT t FROM Tiposdeclaracao t WHERE t.tipodadeclaracao = :tipodadeclaracao")})
public class Tiposdeclaracao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtiposdeclaracao")
    private Integer idtiposdeclaracao;
    @Column(name = "tipodadeclaracao")
    private String tipodadeclaracao;

    public Tiposdeclaracao() {
    }

    public Tiposdeclaracao(Integer idtiposdeclaracao) {
        this.idtiposdeclaracao = idtiposdeclaracao;
    }

    public Integer getIdtiposdeclaracao() {
        return idtiposdeclaracao;
    }

    public void setIdtiposdeclaracao(Integer idtiposdeclaracao) {
        Integer oldIdtiposdeclaracao = this.idtiposdeclaracao;
        this.idtiposdeclaracao = idtiposdeclaracao;
        changeSupport.firePropertyChange("idtiposdeclaracao", oldIdtiposdeclaracao, idtiposdeclaracao);
    }

    public String getTipodadeclaracao() {
        return tipodadeclaracao;
    }

    public void setTipodadeclaracao(String tipodadeclaracao) {
        String oldTipodadeclaracao = this.tipodadeclaracao;
        this.tipodadeclaracao = tipodadeclaracao;
        changeSupport.firePropertyChange("tipodadeclaracao", oldTipodadeclaracao, tipodadeclaracao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposdeclaracao != null ? idtiposdeclaracao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposdeclaracao)) {
            return false;
        }
        Tiposdeclaracao other = (Tiposdeclaracao) object;
        if ((this.idtiposdeclaracao == null && other.idtiposdeclaracao != null) || (this.idtiposdeclaracao != null && !this.idtiposdeclaracao.equals(other.idtiposdeclaracao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return tipodadeclaracao;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
