/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author admin
 */
@Entity
public class Commende implements Serializable {

    public enum Statucomm {
        an_cour,
        TIRMI,
        paye,
        livre
    }

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    
    
    @ManyToOne
    @JoinColumn(name = "clint_id")
    private Client clint;

    
    
    
    
    
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    
    
    

    public Client getClint() {
        return clint;
    }

    public void setClint(Client clint) {
        this.clint = clint;
    }

    public Date getDateheurcomm() {
        return dateheurcomm;
    }

    public void setDateheurcomm(Date dateheurcomm) {
        this.dateheurcomm = dateheurcomm;
    }

    public Date getDatelivre() {
        return datelivre;
    }

    public void setDatelivre(Date datelivre) {
        this.datelivre = datelivre;
    }

    public Statucomm getStatu() {
        return statu;
    }

    public void setStatu(Statucomm statu) {
        this.statu = statu;
    }

    public Adresse getAdrliv() {
        return adrliv;
    }

    public void setAdrliv(Adresse adrliv) {
        this.adrliv = adrliv;
    }

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }
    
    
    

    @Temporal(TemporalType.TIMESTAMP)
    private Date dateheurcomm;

    @Temporal(TemporalType.DATE)
    private Date datelivre;

    @Enumerated(EnumType.STRING)
    private Statucomm statu;

    @Embedded

    private Adresse adrliv;
    private String n;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Commende)) {
            return false;
        }
        Commende other = (Commende) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "magasin.entity.Commende[ id=" + id + " ]";
    }

}
