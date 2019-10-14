package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:8080")
@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/delete/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        userRepository.deleteById(id);
        return "success";
    }

    @GetMapping("/getByName")
    public List<User> getUserByName(@RequestParam String name){
        List<User> users=userRepository.findByName(name);
        return users;
    }

    @GetMapping("/getByAge")
    public List<User> getUserByAge(@RequestParam Integer age){
        List<User> users=userRepository.findByAge(age);
        return users;
    }

    @GetMapping("/update")
    public  String updateUser(@RequestParam(name="id") Integer id,@RequestParam(name="name") String newName,@RequestParam(name="age") Integer newAge){
        User u1=userRepository.findById(id).orElse(null);
        u1.setAge(newAge);
        u1.setName(newName);
        userRepository.save(u1);
        return "Update success";
    }

    @PostMapping("/insert")
    public String insertUser(User user){
        userRepository.save(user);
        return "insert success";
    }

}
