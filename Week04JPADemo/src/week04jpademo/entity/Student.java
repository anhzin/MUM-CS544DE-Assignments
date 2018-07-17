/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author sunling
 */
@Entity
public class Student extends Person implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private float gpa;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Notebook> notebooks = new ArrayList<Notebook>();

    public Student() {
    }

    public Student(String name,float gpa) {
        super(name); 
        this.gpa = gpa;
    }

    public float getGpa() {
        return gpa;
    }  
    
    public void addNotebook(Notebook notebook){
        notebooks.add(notebook);
    }
    
    public List<Notebook> getNotebooks() {
        return notebooks;
    }
    
}
