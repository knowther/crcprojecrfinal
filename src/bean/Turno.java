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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author johnn
 */
@Entity
@Table(name = "turno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Turno.findAll", query = "SELECT t FROM Turno t")
    , @NamedQuery(name = "Turno.findByIdturno", query = "SELECT t FROM Turno t WHERE t.idturno = :idturno")
    , @NamedQuery(name = "Turno.findByDiaturnoIddiaturno", query = "SELECT t FROM Turno t WHERE t.diaturnoIddiaturno = :diaturnoIddiaturno")
    , @NamedQuery(name = "Turno.findByNome", query = "SELECT t FROM Turno t WHERE t.nome = :nome")})
public class Turno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idturno")
    private Integer idturno;
    @Column(name = "diaturno_iddiaturno")
    private Integer diaturnoIddiaturno;
    @Column(name = "nome")
    private String nome;

    public Turno() {
    }

    public Turno(Integer idturno) {
        this.idturno = idturno;
    }

    public Integer getIdturno() {
        return idturno;
    }

    public void setIdturno(Integer idturno) {
        this.idturno = idturno;
    }

    public Integer getDiaturnoIddiaturno() {
        return diaturnoIddiaturno;
    }

    public void setDiaturnoIddiaturno(Integer diaturnoIddiaturno) {
        this.diaturnoIddiaturno = diaturnoIddiaturno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idturno != null ? idturno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Turno)) {
            return false;
        }
        Turno other = (Turno) object;
        if ((this.idturno == null && other.idturno != null) || (this.idturno != null && !this.idturno.equals(other.idturno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Turno[ idturno=" + idturno + " ]";
    }
    
}
