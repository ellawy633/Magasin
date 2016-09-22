/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin.test;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import magasin.entity.Categorie;
import magasin.entity.Produit;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author admin
 */
public class Test1 {
    
    @Before
    public void avant(){
        
        
        
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
       em.getTransaction().begin();
       
        Query query= em.createQuery("delet FROM Produit p");
        query.executeUpdate();
       
       Query h= em.createQuery("delet FROM Category p");
        query.executeUpdate();
       
       
       
       //persister en bases certaines donnees
       
       Categorie c1=new Categorie();
       c1.setNom("Basket");
       c1.setId(2L);
       em.persist(c1);
       
       
       Categorie c2=new Categorie();
       c2.setNom("lunettes solaire");
       em.persist(c2);
       
       
       Produit rayBan=new Produit();
       rayBan.setCategory(c2);
       em.persist(rayBan);
        
    }
  @Test
  public  void testcreatdb(){
      
  }
  public void verifieQueCatId1EstBasket(){
      EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
    Categorie cat=em.find(Categorie.class,1L);
    if(cat.getNom().equals("basket"));
}
    
    
    
  //@Test
    public void testaaaa(){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Categorie cat =em.find(Categorie.class, 2L);
        for (Produit p : cat.getProduits()) {
            System.out.println(p);
        }
        
        
    }
   //@Test
   public void test(){
       
       
       
       
       
       
       em.getTransaction().commit();
       
       
   }
}
