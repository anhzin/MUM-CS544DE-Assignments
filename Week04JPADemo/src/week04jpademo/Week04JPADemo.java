/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo;

import week04jpademo.entity.Laptop;
import week04jpademo.entity.Notebook; 
import week04jpademo.entity.Student;
import week04jpademo.entity.Teacher;

/**
 *
 * @author sunling
 */
public class Week04JPADemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        //3 students
        Student jack = new Student("jack", 3.4f);
        Student john = new Student("john", 3.2f);
        Student jill = new Student("jill", 3.6f);
        
        Notebook nb1 = new Notebook(100);
        Notebook nb2 = new Notebook(120);
        Notebook nb3 = new Notebook(60);
        
        jack.addNotebook(nb1);
        jack.addNotebook(nb2);
        jack.addNotebook(nb3);
        
        Notebook nb4 = new Notebook(200);
        Notebook nb5 = new Notebook(50);
        john.addNotebook(nb4);
        john.addNotebook(nb5);
        
        Notebook nb6 = new Notebook(300);
        jill.addNotebook(nb6); 
        
        //2 teachers
        Teacher jim = new Teacher("jim",45000);
        Teacher jasmin = new Teacher("jasmin",46000);
        
        Laptop dell = new Laptop("dell");
        jim.setLaptop(dell);
        
        Laptop mac = new Laptop("mac");
        jasmin.setLaptop(mac);
        
        
        MyCRUD p = new MyCRUD("Week04JPADemoPU");
        p.save(jack);
        p.save(john);
        p.save(jill);
        
        p.save(jim);
        p.save(jasmin);
        
        boolean result = p.deleteStudent(2);
        if(result){
            System.out.println("deleted");
        }else{
           System.out.println("student id=2 is not exist"); 
        }
        p.end();
    }
    
}
