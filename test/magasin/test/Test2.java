/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import magasin.entity.Client;
import magasin.entity.Commende;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author admin
 */
public class Test2 {
    @Test
    public void testbbb(){
        
        
        EntityManager em =Persistence.createEntityManagerFactory("PU").createEntityManager();
        Client cli = em.find(Client.class, 3);
        
        
        
        
        
        
    }
    public void test(){
        EntityManager em= Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        
        
     Client k1=new Client();
     k1.setLogin("eee");
     em.persist(k1);
        
     
        Commende hyt=new Commende();
        hyt.setClint(k1);
        em
     
     
        
    }
}
