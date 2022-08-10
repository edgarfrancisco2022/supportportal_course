package com.edgarfrancisco2022.supportportal.resource;

import com.edgarfrancisco2022.supportportal.exception.ExceptionHandling;
import com.edgarfrancisco2022.supportportal.exception.domain.UserNotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping(value = "/user")
@RequestMapping(path = {"/", "/user"})
public class UserResource extends ExceptionHandling {

    @GetMapping("/home")
    public String showUser() throws UserNotFoundException {
//        return "Application works!";
        throw new UserNotFoundException("The user was not found");
    }
}
