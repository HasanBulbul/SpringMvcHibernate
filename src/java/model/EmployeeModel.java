/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import entity.*;
import java.util.*;
import org.hibernate.*;

/**
 *
 * @author Hasan
 */
public class EmployeeModel {
    
    
    //Crud methods---------------------------
    
    public List<Employees> getAll(){
        
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        List<Employees> lst = new ArrayList<Employees>();
        try {
            s.beginTransaction();
            lst = s.createCriteria(Employees.class).list();
            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            s.getTransaction().rollback();
        }
        return lst;
    }
    
    public void create(Employees e){
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.save(e);
            s.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public void edit(Employees e){
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.update(e);
            s.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public void remove(Employees e){
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        
        try {
            s.beginTransaction();
            s.delete(e);
            s.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }
    }
    
    public Employees getEmp(int id){
    
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        Employees e = new Employees();
        try {
            s.beginTransaction();
            e = (Employees)s.get(Employees.class, id);
            s.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            s.getTransaction().rollback();
        }   
        return e;
    }
    
}
