package com.thymeleafdemo.SpringBootThymeleaf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
    private static List<Employee> employeeList = new ArrayList<Employee>();
    
    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping(value = "/display", method = RequestMethod.POST)
    public ModelAndView saveEmployee(@ModelAttribute Employee employee) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("employeeDetails");
        employeeList.add(employee);
        mv.addObject("employeeList", employeeList);
        return mv;
    }
}
