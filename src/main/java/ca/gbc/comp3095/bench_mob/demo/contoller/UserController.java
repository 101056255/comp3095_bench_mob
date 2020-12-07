/*********************************************************************************
 * Project: COMP3095_bench_mob
 * Assignment: Assignment 3
 * Author(s): Faheem Ahmed, Abdirahman Ali, Edward Philip
 * Student Number: 101197078, 101188723, 10156255
 * Date: Dec 6, 2020
 * Description: Saves user into the database.
 *********************************************************************************/
package ca.gbc.comp3095.bench_mob.demo.contoller;

import ca.gbc.comp3095.bench_mob.demo.model.User;
import ca.gbc.comp3095.bench_mob.demo.model.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserRepo repo;

    @PostMapping(value = "/saveUser")
    public String saveUser(User user)
    {
        repo.save(user);
        return "success";
    }

    @GetMapping("/users")
    public List<User> getAll(){
        return repo.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity < User > getUserById(@PathVariable int id)
    {
        User user = (User) repo.findAllById(Collections.singleton(id));
        return ResponseEntity.ok(user);
    }
}
