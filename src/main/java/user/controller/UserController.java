package user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import user.service.UserService;
import user.model.User;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/users")
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        return this.userService.findAll();
    }

    @RequestMapping("/users/{id}")
    public User getUser(@PathVariable String id) {
        return  this.userService.find(id);
    }

    @RequestMapping("/users/by-email/{email}")
    public List<User> getUserByEmail(@PathVariable String email) {
        return this.userService.findByEmail(email);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/users")
    public String addUser(@Valid @RequestBody User user) {
        userService.add(user);
        return "{\"success\" : \"true\" }";
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/users/{id}")
    public String updateUser(@PathVariable String id, @RequestBody User user) {
        userService.updateUser(id, user);
        return "{\"success\" : \"true\" }";
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/users/{id}")
    public String deleteUser(@PathVariable String id) {
        userService.delete(id);
        return "{\"success\" : \"true\" }";
    }
}
