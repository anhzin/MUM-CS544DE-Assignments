/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week04jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;  
import week04jpademo.entity.Student;

/**
 *
 * @author sunling
 */
public class MyCRUD {

    private EntityManagerFactory emf;
    private EntityManager em;

    public MyCRUD(String name) {
        emf = Persistence.createEntityManagerFactory(name);
        em = emf.createEntityManager();
    }
 
    public void end() {
        if (emf != null) {
            em.close();
            emf.close();
            emf = null;
        }
    }

    public void save(Object entity) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(entity);
        tx.commit();
    }
    
    public boolean deleteStudent(int studentId){
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Student find = em.find(Student.class, studentId);
        if(null!=find){
            em.remove(find); 
            em.flush();
            tx.commit();
            return true;
        }
        tx.commit();
        return false;
    }
}
