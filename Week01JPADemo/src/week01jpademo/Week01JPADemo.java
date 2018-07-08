/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week01jpademo;

import week01jpademo.entity.Car;
import week01jpademo.entity.Color;

/**
 *
 * @author sunling
 */
public class Week01JPADemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Car car = new Car("Auti","8888",2018,0,Color.BLACK);
        Persister p = new Persister();
        p.save(car);
        p.end(); 
    }
    
}
