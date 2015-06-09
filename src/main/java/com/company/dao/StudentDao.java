package com.company.dao;

import com.company.model.Student;
import java.util.List;

public interface StudentDao {
    
    public void create(Student s);
    public void edit(Student s);
    public void remove(Student s);
    public Student getStd(int id);
    public List getAll();
    
}
