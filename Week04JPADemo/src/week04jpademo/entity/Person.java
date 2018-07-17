/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo.entity;

/**
 *
 * @author sunling
 */
public class Person {
    private long id;
    private String name;

    public Person() {
    }

    
    public Person(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
     
}
