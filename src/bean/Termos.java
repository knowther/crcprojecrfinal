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
@Table(name = "termos", catalog = "dbclinicaii", schema = "")

public class Termos implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idtermos")
    private Integer idtermos;
    @Column(name = "nomePaciente")
    private String nomePaciente;
    @Column(name = "documentoPaciente")
    private String documentoPaciente;
    @Column(name = "respLegal")
    private String respLegal;
    @Column(name = "documentoRespLegal")
    private String documentoRespLegal;
    
    
    private Medico medico;

    public Termos() {
    }

    public Termos(Integer idtermos) {
        this.idtermos = idtermos;
    }

    public Integer getIdtermos() {
        return idtermos;
    }

    public void setIdtermos(Integer idtermos) {
        Integer oldIdtermos = this.idtermos;
        this.idtermos = idtermos;
        changeSupport.firePropertyChange("idtermos", oldIdtermos, idtermos);
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        String oldNomePaciente = this.nomePaciente;
        this.nomePaciente = nomePaciente;
        changeSupport.firePropertyChange("nomePaciente", oldNomePaciente, nomePaciente);
    }

    public String getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(String documentoPaciente) {
        String oldDocumentoPaciente = this.documentoPaciente;
        this.documentoPaciente = documentoPaciente;
        changeSupport.firePropertyChange("documentoPaciente", oldDocumentoPaciente, documentoPaciente);
    }

    public String getRespLegal() {
        return respLegal;
    }

    public void setRespLegal(String respLegal) {
        String oldRespLegal = this.respLegal;
        this.respLegal = respLegal;
        changeSupport.firePropertyChange("respLegal", oldRespLegal, respLegal);
    }

    public String getDocumentoRespLegal() {
        return documentoRespLegal;
    }

    public void setDocumentoRespLegal(String documentoRespLegal) {
        String oldDocumentoRespLegal = this.documentoRespLegal;
        this.documentoRespLegal = documentoRespLegal;
        changeSupport.firePropertyChange("documentoRespLegal", oldDocumentoRespLegal, documentoRespLegal);
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        Medico oldMedico = this.medico;
        this.medico = medico;
        changeSupport.firePropertyChange("medicoinfo", oldMedico, medico);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtermos != null ? idtermos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termos)) {
            return false;
        }
        Termos other = (Termos) object;
        if ((this.idtermos == null && other.idtermos != null) || (this.idtermos != null && !this.idtermos.equals(other.idtermos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Termos[ idtermos=" + idtermos + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
