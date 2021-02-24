package com.tekshila.customersprofile.controller;

import com.tekshila.customersprofile.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
@Slf4j
public class CustomerController {

    public static final List<User> users = Arrays.asList(
            new User("1","uname1","name1","email1"),
            new User("2","uname2","name2","email2"),
            new User("3","uname3","name3","email3")
    );

    /*
     * Returns the list of all the users in the application
     */
    @GetMapping
    public List<User> list() {
        return users;
    }

}
