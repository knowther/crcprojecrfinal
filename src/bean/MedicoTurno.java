/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "medico_turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MedicoTurno.findAll", query = "SELECT m FROM MedicoTurno m")
    , @NamedQuery(name = "MedicoTurno.findByIdmedicoTurno", query = "SELECT m FROM MedicoTurno m WHERE m.idmedicoTurno = :idmedicoTurno")
    , @NamedQuery(name = "MedicoTurno.findByMedicoIdmedico", query = "SELECT m FROM MedicoTurno m WHERE m.medicoIdmedico = :medicoIdmedico")
    , @NamedQuery(name = "MedicoTurno.findByTurnoIdturno", query = "SELECT m FROM MedicoTurno m WHERE m.turnoIdturno = :turnoIdturno")})
public class MedicoTurno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmedico_turno")
    private Integer idmedicoTurno;
    
    
    
    @ManyToOne
    @JoinColumn(name = "medico_idmedico")
    private Medico medicoIdmedico;
    
    
    
    @ManyToOne
    @JoinColumn(name = "turno_idturno")
    private Turno turnoIdturno;

    public MedicoTurno() {
    }

    public MedicoTurno(Integer idmedicoTurno) {
        this.idmedicoTurno = idmedicoTurno;
    }

    public Integer getIdmedicoTurno() {
        return idmedicoTurno;
    }

    public void setIdmedicoTurno(Integer idmedicoTurno) {
        this.idmedicoTurno = idmedicoTurno;
    }

    public Medico getMedicoIdmedico() {
        return medicoIdmedico;
    }

    public void setMedicoIdmedico(Medico medicoIdmedico) {
        this.medicoIdmedico = medicoIdmedico;
    }

    public Turno getTurnoIdturno() {
        return turnoIdturno;
    }

    public void setTurnoIdturno(Turno turnoIdturno) {
        this.turnoIdturno = turnoIdturno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmedicoTurno != null ? idmedicoTurno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MedicoTurno)) {
            return false;
        }
        MedicoTurno other = (MedicoTurno) object;
        if ((this.idmedicoTurno == null && other.idmedicoTurno != null) || (this.idmedicoTurno != null && !this.idmedicoTurno.equals(other.idmedicoTurno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.MedicoTurno[ idmedicoTurno=" + idmedicoTurno + " ]";
    }
    
}
