/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magasin.entity;

import javax.persistence.Embeddable;

/**
 *
 * @author admin
 */
@Embeddable
public class Adresse {

    private String rue;
    private String nemero;
    private String codpostal;
    private String ville;
    private String pays;

}
