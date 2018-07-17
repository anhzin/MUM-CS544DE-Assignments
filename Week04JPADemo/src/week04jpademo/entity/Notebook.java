/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author sunling
 */
@Entity
public class Notebook implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    
    private int pages; 

    public Notebook() {
    }

    public Notebook(int pages) { 
        this.pages = pages;
    }
    
    public int getPages() {
        return pages;
    } 
    
}
