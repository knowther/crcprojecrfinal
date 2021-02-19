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
@Table(name = "duracaohd", catalog = "testemodeldb2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Duracaohd.findAll", query = "SELECT d FROM Duracaohd d")
    , @NamedQuery(name = "Duracaohd.findByIdduracaohd", query = "SELECT d FROM Duracaohd d WHERE d.idduracaohd = :idduracaohd")
    , @NamedQuery(name = "Duracaohd.findByDuracao", query = "SELECT d FROM Duracaohd d WHERE d.duracao = :duracao")})
public class Duracaohd implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idduracaohd")
    private Integer idduracaohd;
    @Column(name = "duracao")
    private String duracao;

    public Duracaohd() {
    }

    public Duracaohd(Integer idduracaohd) {
        this.idduracaohd = idduracaohd;
    }

    public Integer getIdduracaohd() {
        return idduracaohd;
    }

    public void setIdduracaohd(Integer idduracaohd) {
        Integer oldIdduracaohd = this.idduracaohd;
        this.idduracaohd = idduracaohd;
        changeSupport.firePropertyChange("idduracaohd", oldIdduracaohd, idduracaohd);
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        String oldDuracao = this.duracao;
        this.duracao = duracao;
        changeSupport.firePropertyChange("duracao", oldDuracao, duracao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idduracaohd != null ? idduracaohd.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Duracaohd)) {
            return false;
        }
        Duracaohd other = (Duracaohd) object;
        if ((this.idduracaohd == null && other.idduracaohd != null) || (this.idduracaohd != null && !this.idduracaohd.equals(other.idduracaohd))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Duracaohd[ idduracaohd=" + idduracaohd + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
