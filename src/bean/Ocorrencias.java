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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "ocorrencias", catalog = "dbclinicaii", schema = "")

public class Ocorrencias implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idocorrencias")
    private Integer idocorrencias;
    
    @Column(name = "dataocorrencia")
    @Temporal(TemporalType.DATE)
    private Date dataocorrencia;
    
    @Column(name = "ultimadialise")
    @Temporal(TemporalType.DATE)
    private Date ultimadialise;
    
    
    
    
    @ManyToOne
    private Paciente paciente;
   
    @Lob
    @Column(name = "melhora")
    private String melhora;
    @Lob
    @Column(name = "cura")
    private String cura;
    @Lob
    @Column(name = "abandonoignorado")
    private String abandonoignorado;
    @Lob
    @Column(name = "tx")
    private String tx;
    @Lob
    @Column(name = "obito")
    private String obito;
    @Lob
    @Column(name = "transferencia")
    private String transferencia;
    @Lob
    @Column(name = "outros")
    private String outros;
    
    @Lob
    @Column(name = "textobase")
    private String textobase;

    public Ocorrencias() {
    }

    public Ocorrencias(Integer idocorrencias) {
        this.idocorrencias = idocorrencias;
    }

    public Integer getIdocorrencias() {
        return idocorrencias;
    }

    public void setIdocorrencias(Integer idocorrencias) {
        Integer oldIdocorrencias = this.idocorrencias;
        this.idocorrencias = idocorrencias;
        changeSupport.firePropertyChange("idocorrencias", oldIdocorrencias, idocorrencias);
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        Paciente oldPaciente = this.paciente;
        this.paciente = paciente;
        changeSupport.firePropertyChange("paciente", oldPaciente, paciente);
    }


    public String getMelhora() {
        return melhora;
    }

    public void setMelhora(String melhora) {
        String oldMelhora = this.melhora;
        this.melhora = melhora;
        changeSupport.firePropertyChange("melhora", oldMelhora, melhora);
    }

    public String getCura() {
        return cura;
    }

    public void setCura(String cura) {
        String oldCura = this.cura;
        this.cura = cura;
        changeSupport.firePropertyChange("cura", oldCura, cura);
    }

    public String getAbandonoignorado() {
        return abandonoignorado;
    }

    public void setAbandonoignorado(String abandonoignorado) {
        String oldAbandonoignorado = this.abandonoignorado;
        this.abandonoignorado = abandonoignorado;
        changeSupport.firePropertyChange("abandonoignorado", oldAbandonoignorado, abandonoignorado);
    }

    public String getTx() {
        return tx;
    }

    public void setTx(String tx) {
        String oldTx = this.tx;
        this.tx = tx;
        changeSupport.firePropertyChange("tx", oldTx, tx);
    }

    public String getObito() {
        return obito;
    }

    public void setObito(String obito) {
        String oldObito = this.obito;
        this.obito = obito;
        changeSupport.firePropertyChange("obito", oldObito, obito);
    }

    public String getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(String transferencia) {
        String oldTransferencia = this.transferencia;
        this.transferencia = transferencia;
        changeSupport.firePropertyChange("transferencia", oldTransferencia, transferencia);
    }


    public String getOutros() {
        return outros;
    }
    
      public void setOutros(String outros) {
        String oldOutros = this.outros;
        this.outros = outros;
        changeSupport.firePropertyChange("outros", oldOutros, outros);
    }
    
    public Date getDataocorrencia() {
        return dataocorrencia;
    }
    
    public void setDataocorrencia(Date dataocorrencia) {
        Date oldDataocorrencia = this.dataocorrencia;
        this.dataocorrencia = dataocorrencia;
        changeSupport.firePropertyChange("dataocorrencia", oldDataocorrencia, dataocorrencia);
    }
    
    
    public Date getUltimadialise() {
        return ultimadialise;
    }
    
    public void setUltimadialise(Date ultimadialise) {
        Date oldUltimadialise = this.dataocorrencia;
        this.ultimadialise = ultimadialise;
        changeSupport.firePropertyChange("ultimadialise", oldUltimadialise, ultimadialise);
    }
    
 public String getTextobase() {
        return textobase;
    }
    
      public void setTextobase(String textobase) {
        String oldTextobase = this.textobase;
        this.textobase = textobase;
        changeSupport.firePropertyChange("textobase", oldTextobase, textobase);
    }
  

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idocorrencias != null ? idocorrencias.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ocorrencias)) {
            return false;
        }
        Ocorrencias other = (Ocorrencias) object;
        if ((this.idocorrencias == null && other.idocorrencias != null) || (this.idocorrencias != null && !this.idocorrencias.equals(other.idocorrencias))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Ocorrencias[ idocorrencias=" + idocorrencias + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
