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
@Table(name = "tipotodolist", catalog = "dbclinicaii", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tipotodolist.findAll", query = "SELECT t FROM Tipotodolist t")
    , @NamedQuery(name = "Tipotodolist.findByIdtipostodolist", query = "SELECT t FROM Tipotodolist t WHERE t.idtipostodolist = :idtipostodolist")
    , @NamedQuery(name = "Tipotodolist.findByAmbulatorio", query = "SELECT t FROM Tipotodolist t WHERE t.ambulatorio = :ambulatorio")
    , @NamedQuery(name = "Tipotodolist.findByFichaNutricionista", query = "SELECT t FROM Tipotodolist t WHERE t.fichaNutricionista = :fichaNutricionista")
    , @NamedQuery(name = "Tipotodolist.findByRaioX", query = "SELECT t FROM Tipotodolist t WHERE t.raioX = :raioX")
    , @NamedQuery(name = "Tipotodolist.findByEletrocardiograma", query = "SELECT t FROM Tipotodolist t WHERE t.eletrocardiograma = :eletrocardiograma")})
public class Tipotodolist implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idtipostodolist")
    private Integer idtipostodolist;
    @Column(name = "Ambulatorio")
    private String ambulatorio;
    @Column(name = "FichaNutricionista")
    private String fichaNutricionista;
    @Column(name = "RaioX")
    private String raioX;
    @Column(name = "Eletrocardiograma")
    private String eletrocardiograma;

    public Tipotodolist() {
    }

    public Tipotodolist(Integer idtipostodolist) {
        this.idtipostodolist = idtipostodolist;
    }

    public Integer getIdtipostodolist() {
        return idtipostodolist;
    }

    public void setIdtipostodolist(Integer idtipostodolist) {
        Integer oldIdtipostodolist = this.idtipostodolist;
        this.idtipostodolist = idtipostodolist;
        changeSupport.firePropertyChange("idtipostodolist", oldIdtipostodolist, idtipostodolist);
    }

    public String getAmbulatorio() {
        return ambulatorio;
    }

    public void setAmbulatorio(String ambulatorio) {
        String oldAmbulatorio = this.ambulatorio;
        this.ambulatorio = ambulatorio;
        changeSupport.firePropertyChange("ambulatorio", oldAmbulatorio, ambulatorio);
    }

    public String getFichaNutricionista() {
        return fichaNutricionista;
    }

    public void setFichaNutricionista(String fichaNutricionista) {
        String oldFichaNutricionista = this.fichaNutricionista;
        this.fichaNutricionista = fichaNutricionista;
        changeSupport.firePropertyChange("fichaNutricionista", oldFichaNutricionista, fichaNutricionista);
    }

    public String getRaioX() {
        return raioX;
    }

    public void setRaioX(String raioX) {
        String oldRaioX = this.raioX;
        this.raioX = raioX;
        changeSupport.firePropertyChange("raioX", oldRaioX, raioX);
    }

    public String getEletrocardiograma() {
        return eletrocardiograma;
    }

    public void setEletrocardiograma(String eletrocardiograma) {
        String oldEletrocardiograma = this.eletrocardiograma;
        this.eletrocardiograma = eletrocardiograma;
        changeSupport.firePropertyChange("eletrocardiograma", oldEletrocardiograma, eletrocardiograma);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipostodolist != null ? idtipostodolist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipotodolist)) {
            return false;
        }
        Tipotodolist other = (Tipotodolist) object;
        if ((this.idtipostodolist == null && other.idtipostodolist != null) || (this.idtipostodolist != null && !this.idtipostodolist.equals(other.idtipostodolist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "view.Tipotodolist[ idtipostodolist=" + idtipostodolist + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
