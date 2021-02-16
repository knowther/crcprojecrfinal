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
@Table(name = "diaturno")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Diaturno.findAll", query = "SELECT d FROM Diaturno d")
    , @NamedQuery(name = "Diaturno.findByIddiaturno", query = "SELECT d FROM Diaturno d WHERE d.iddiaturno = :iddiaturno")
    , @NamedQuery(name = "Diaturno.findByDiasemanaturno", query = "SELECT d FROM Diaturno d WHERE d.diasemanaturno = :diasemanaturno")})
public class Diaturno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddiaturno")
    private Integer iddiaturno;
    @Column(name = "diasemanaturno")
    private String diasemanaturno;

    public Diaturno() {
    }

    public Diaturno(Integer iddiaturno) {
        this.iddiaturno = iddiaturno;
    }

    public Integer getIddiaturno() {
        return iddiaturno;
    }

    public void setIddiaturno(Integer iddiaturno) {
        this.iddiaturno = iddiaturno;
    }

    public String getDiasemanaturno() {
        return diasemanaturno;
    }

    public void setDiasemanaturno(String diasemanaturno) {
        this.diasemanaturno = diasemanaturno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddiaturno != null ? iddiaturno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diaturno)) {
            return false;
        }
        Diaturno other = (Diaturno) object;
        if ((this.iddiaturno == null && other.iddiaturno != null) || (this.iddiaturno != null && !this.iddiaturno.equals(other.iddiaturno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bean.Diaturno[ iddiaturno=" + iddiaturno + " ]";
    }
    
}
