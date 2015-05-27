package controller;

import entity.*;
import model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Hasan
 */
@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {
    
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getall(Model m){
        
        EmployeeModel model = new EmployeeModel();
        m.addAttribute("lst", model.getAll());
        return "index";
    
    }
    
    @RequestMapping(value = "/remove", method = RequestMethod.GET)
    public String remove(@RequestParam(value = "id") int id){
        
        EmployeeModel model = new EmployeeModel();
        //Get employee based object's id
        Employees e = model.getEmp(id);
        model.remove(e);
        return "redirect:all.html";
    
    }
    
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String edit(@RequestParam(value = "id") int id, Model m){
        
        EmployeeModel model = new EmployeeModel();
        Employees e = model.getEmp(id);
        m.addAttribute("emp", e);
        return "edit";
    
    }
    
    @RequestMapping(value = "/update", method = RequestMethod.GET)
    public String edit(@ModelAttribute(value = "employee") Employees e){
        
        EmployeeModel model = new EmployeeModel();
        model.edit(e);
        return "redirect:all.html";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String create(@ModelAttribute(value = "employee") Employees e){
        
        EmployeeModel model = new EmployeeModel();
        model.create(e);
        return "redirect:all.html";
    }
    
    @RequestMapping(value = "/redirectCreate", method = RequestMethod.GET)
    public String redirectCreate(){
        return "create";
    }
}
