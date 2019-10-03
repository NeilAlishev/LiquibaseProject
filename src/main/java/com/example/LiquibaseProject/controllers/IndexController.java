package com.example.LiquibaseProject.controllers;

import com.example.LiquibaseProject.dao.PersonDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Neil Alishev
 */
@Controller
public class IndexController {

    private final PersonDAO personDAO;

    public IndexController(PersonDAO personDAO) {
        this.personDAO = personDAO;
    }

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("people", personDAO.index());
        return "index";
    }
}
