package com.spring.bgms.controllers;

import com.spring.bgms.models.*;

import com.spring.bgms.models.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class StudentController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public ModelAndView student() {
        return new ModelAndView("register", "command", new Student());
    }
    @RequestMapping(value = "/addStudent", method = RequestMethod.POST)
    public String addStudent(@ModelAttribute("SpringWeb")Student student,
                             ModelMap model) {
        model.addAttribute("name", student.getName());
        model.addAttribute("id", student.getId());
        return "hello";
    }
}
