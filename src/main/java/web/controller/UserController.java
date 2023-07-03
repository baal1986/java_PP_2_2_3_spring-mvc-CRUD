package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.model.User;
import web.service.UserService;
import web.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;


@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        userService.add(new User("Ivan","Ivanov","ivanov@gmail.com"));
        userService.add(new User("Petr","Petrov","petrov@gmail.com"));
        userService.add(new User("Sidor","Sidorov","sidorov@gmail.com"));
    }

    @GetMapping(value = "/")
    public String printAllUsers(ModelMap model) {
        List<String> messages = new ArrayList<>();
        model.addAttribute("users", userService.allUsers());
        return "index";
    }
    @GetMapping(value = "/add")
    public String addUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "add";
    }

    @PostMapping (value = "saveAdd")
    public String saveAdd(@ModelAttribute("user") User user){
        userService.add(user);
        return "redirect:/";
    }


    @GetMapping(value = "/edit/{id}")
    public ModelAndView editUser(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        modelAndView.addObject("user", user);
        return modelAndView;
    }


}