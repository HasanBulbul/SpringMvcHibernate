/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.company.dao;

import com.company.model.Student;
import java.util.List;

/**
 *
 * @author Hasan
 */
public interface StudentDao {
    
    public void create(Student s);
    public void edit(Student s);
    public void remove(Student s);
    public Student getStd(int id);
    public List getAll();
    
}
