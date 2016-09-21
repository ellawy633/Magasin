/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author admin
 */
@Entity
public class Client  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    
    
    
    
    @Embedded
    private Adresse adrfacte;
    
    
      @Column(length = 32, unique = true)
    private String Login;
      
      
    @Column(length = 32, nullable = false)
    private String mdp;
  
    private String email;
    @OneToMany(mappedBy = " ")
    
    
    
 
    
    
    
    
    

    public Long getId() {
        return id;
    }

    public Adresse getAdrfacte() {
        return adrfacte;
    }

    public void setAdrfacte(Adresse adrfacte) {
        this.adrfacte = adrfacte;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        if (!(object instanceof Client)) {
            return false;
        }
        Client other = (Client) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "magasin.entity.Client[ id=" + id + " ]";
    }

}
