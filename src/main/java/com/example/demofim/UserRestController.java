package com.example.demofim;

import com.example.demofim.dao.UserDao;
import com.example.demofim.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //neni potreba pote psat u kazde metody @ResponseBody
public class UserRestController {

    @Autowired //nepouzivat - neni to best practice
    private UserDao dao;

    @GetMapping("/rest/user")
    public List<User> getAllUsers() {
        return dao.findAll();
    }
    @PostMapping("/rest/user")
    public void createUser(@RequestBody User user) {
        dao.create(user);
    }

}
