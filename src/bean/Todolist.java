/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@Table(name = "todolist", catalog = "dbclinicaii", schema = "")

public class Todolist implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtodolist")
    private Integer idtodolist;
     @ManyToOne
    private Paciente paciente;
    @Column(name = "tipostodolist_idtipostodolist")
    private Integer tipostodolistIdtipostodolist;
    @Column(name = "feito")
    private Short feito;
    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Todolist() {
    }

    public Todolist(Integer idtodolist) {
        this.idtodolist = idtodolist;
    }

    public Integer getIdtodolist() {
        return idtodolist;
    }

    public void setIdtodolist(Integer idtodolist) {
        Integer oldIdtodolist = this.idtodolist;
        this.idtodolist = idtodolist;
        changeSupport.firePropertyChange("idtodolist", oldIdtodolist, idtodolist);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente oldPaciente = this.paciente;
        this.paciente = paciente;
        changeSupport.firePropertyChange("paciente", oldPaciente, paciente);
    }

    public Integer getTipostodolistIdtipostodolist() {
        return tipostodolistIdtipostodolist;
    }

    public void setTipostodolistIdtipostodolist(Integer tipostodolistIdtipostodolist) {
        Integer oldTipostodolistIdtipostodolist = this.tipostodolistIdtipostodolist;
        this.tipostodolistIdtipostodolist = tipostodolistIdtipostodolist;
        changeSupport.firePropertyChange("tipostodolistIdtipostodolist", oldTipostodolistIdtipostodolist, tipostodolistIdtipostodolist);
    }

    public Short getFeito() {
        return feito;
    }

    public void setFeito(Short feito) {
        Short oldFeito = this.feito;
        this.feito = feito;
        changeSupport.firePropertyChange("feito", oldFeito, feito);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        Date oldDate = this.date;
        this.date = date;
        changeSupport.firePropertyChange("date", oldDate, date);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtodolist != null ? idtodolist.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Todolist)) {
            return false;
        }
        Todolist other = (Todolist) object;
        if ((this.idtodolist == null && other.idtodolist != null) || (this.idtodolist != null && !this.idtodolist.equals(other.idtodolist))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return paciente.toString();
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
