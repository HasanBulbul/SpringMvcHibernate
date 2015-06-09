/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hitsoft.controller;

import com.hitsoft.model.Student;
import com.hitsoft.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @author Hasan
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getall(Model m){
        
        //m.addAttribute("student", s);
        m.addAttribute("lst", studentService.getAll());
        return "index";
    
    }
    
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") int id){
        
        Student e = studentService.getStd(id);
        studentService.remove(e);
        return "redirect:all.html";
    
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id") int id, Model m){
        
        Student e = studentService.getStd(id);
        m.addAttribute("emp", e);
        return "edit";
    
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String edit(@ModelAttribute(value = "student") Student e){
        
        studentService.edit(e);
        return "redirect:all.html";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(@ModelAttribute(value = "student") Student s){
        
        studentService.create(s);
        return "redirect:all.html";
    }
    
    @RequestMapping(value = "/redirectCreate", method = RequestMethod.GET)
    public String redirectCreate(){
        return "create";
    }
}
