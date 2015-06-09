
package com.company.service;

import com.company.model.Student;
import java.util.List;

/**
 *
 * @author Hasan
 */
public interface StudentService {
    
    public void create(Student s);
    public void edit(Student s);
    public void remove(Student s);
    public Student getStd(int id);
    public List getAll();
    
}
