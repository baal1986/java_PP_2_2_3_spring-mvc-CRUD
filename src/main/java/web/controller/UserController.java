package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserService;




@Controller
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
        userService.add(new User("Ivan", "Ivanov", "ivanov@gmail.com"));
        userService.add(new User("Petr", "Petrov", "petrov@gmail.com"));
        userService.add(new User("Sidor", "Sidorov", "sidorov@gmail.com"));
    }

    @GetMapping(value = "/")
    public String printAllUsers(ModelMap model) {
        model.addAttribute("users", userService.allUsers());
        return "read";
    }

    @GetMapping(value = "/new")
    public String addUser(@ModelAttribute("user") User user) {
        return "create";
    }

    @PostMapping(value = "/saveNew")
    public String saveAddUser(@ModelAttribute("user") User user) {
        userService.add(user);
        return "redirect:/users/";
    }


    @GetMapping(value = "/edit/{id}")
    public String editUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getById(id));
        return "update";
    }

    @PatchMapping("/saveEdit/{id}")
    public String saveEditUser(@ModelAttribute("user") User user) {
        userService.edit(user);
        return "redirect:/users/";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@ModelAttribute("user") User user) {
        userService.delete(user);
        return "redirect:/users/";
    }


}