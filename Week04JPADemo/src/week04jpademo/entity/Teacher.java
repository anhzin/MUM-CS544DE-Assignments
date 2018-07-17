/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo.entity;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author sunling
 */
@Entity
public class Teacher extends Person implements Serializable{
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    
    private double salary;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

    public Teacher() {
    }

    public Teacher(String name,double salary) {
        super(name);
        this.salary = salary;
    } 

    public double getSalary() {
        return salary;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }  
}
