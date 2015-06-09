
package com.company.service.impl;

import com.company.dao.StudentDao;
import com.company.model.Student;
import com.company.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentDao studentDao;
    
    @Transactional
    public void create(Student s) {
        studentDao.create(s);
    }

    @Transactional
    public void edit(Student s) {
        studentDao.edit(s);
    }

    @Transactional
    public void remove(Student s) {
        studentDao.remove(s);
    }

    @Transactional
    public Student getStd(int id) {
        return studentDao.getStd(id);
    }

    @Transactional
    public List getAll() {
        return studentDao.getAll();
    }
    
}
