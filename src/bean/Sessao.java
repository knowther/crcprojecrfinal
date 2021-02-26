/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.text.Format;
import java.text.SimpleDateFormat;
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
import static mondrian.olap.fun.vba.Vba.date;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "sessao", catalog = "testemodeldb2", schema = "")
@NamedQueries({
    @NamedQuery(name = "Sessao.findAll", query = "SELECT s FROM Sessao s")
    , @NamedQuery(name = "Sessao.findByIdsessao", query = "SELECT s FROM Sessao s WHERE s.idsessao = :idsessao")
    , @NamedQuery(name = "Sessao.findByDiasessao", query = "SELECT s FROM Sessao s WHERE s.diasessao = :diasessao")})
public class Sessao implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsessao")
    private Integer idsessao;
    @Column(name = "diasessao")
    @Temporal(TemporalType.DATE)
    private Date diasessao;

    public Sessao() {
    }

    public Sessao(Integer idsessao) {
        this.idsessao = idsessao;
    }

    public Integer getIdsessao() {
        return idsessao;
    }

    public void setIdsessao(Integer idsessao) {
        Integer oldIdsessao = this.idsessao;
        this.idsessao = idsessao;
        changeSupport.firePropertyChange("idsessao", oldIdsessao, idsessao);
    }

    public Date getDiasessao() {
        return diasessao;
    }
    
     public String getDiasessaoT() {
        
        Format formatter = new SimpleDateFormat("dd/MM/YY");
        formatter.format(diasessao);
        String diasessaoS = formatter.format(diasessao);
        return diasessaoS;
    }

    public void setDiasessao(Date diasessao) {
        Date oldDiasessao = this.diasessao;
        this.diasessao = diasessao;
        changeSupport.firePropertyChange("diasessao", oldDiasessao, diasessao);
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
        if (!(object instanceof Sessao)) {
            return false;
        }
        Sessao other = (Sessao) object;
        if ((this.idsessao == null && other.idsessao != null) || (this.idsessao != null && !this.idsessao.equals(other.idsessao))) {
            return false;
        }
        return true;
    }

     @Override
     
    public String toString() {
       return this.getDiasessaoT();
    }
    
  
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
