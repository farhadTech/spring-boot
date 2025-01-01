package com.libraryMngmtSystem.SpringBootCrud.controller;
import com.libraryMngmtSystem.SpringBootCrud.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@RequestMapping("/")
public class HomeController {

    private final LibraryService libraryService;

    @Autowired
    public HomeController(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    @RequestMapping(value = {"/", "/home"})
    public String home(Model model) {
        model.addAttribute("welcomeMessage", "Welcome to the Library Management System!");
        model.addAttribute("totalBooks", libraryService.getTotalBooks());
        return "home";
    }
}

