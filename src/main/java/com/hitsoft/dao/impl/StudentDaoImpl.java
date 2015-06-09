/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hitsoft.dao.impl;

import com.hitsoft.dao.StudentDao;
import com.hitsoft.model.Student;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Hasan
 */
@Repository
public class StudentDaoImpl implements StudentDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public void create(Student s) {
        sessionFactory.getCurrentSession().save(s);
    }

    @Override
    public void edit(Student s) {
        sessionFactory.getCurrentSession().update(s);
    }

    @Override
    public void remove(Student s) {
        sessionFactory.getCurrentSession().delete(s);
    }

    @Override
    public Student getStd(int id) {
        return (Student)sessionFactory.getCurrentSession().get(Student.class, id);
    }

    @Override
    public List getAll() {
        return sessionFactory.getCurrentSession().createQuery("from Student").list();
    }
    
}
