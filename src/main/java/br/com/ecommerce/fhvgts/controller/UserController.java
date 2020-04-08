package br.com.ecommerce.fhvgts.controller;

import br.com.ecommerce.fhvgts.model.User;
import br.com.ecommerce.fhvgts.repository.IUserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {

    IUserRepository userRepository;

    @PostMapping
    public User createUser(@RequestBody User user) {
        userRepository.save(user);
        return user;
    }

    @GetMapping
    public List listUsers(){
        return userRepository.findAll();
    }

    /*
    @PutMapping("/{userId}")
    public User updateUser(@RequestBody User user, @PathVariable String userId) {
        user.setId(deptId);
        departmentRepository.save(department);
        return department;
    }
    */

}
