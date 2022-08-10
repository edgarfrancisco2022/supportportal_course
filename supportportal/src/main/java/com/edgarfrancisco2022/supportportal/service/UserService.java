package com.edgarfrancisco2022.supportportal.service;

import com.edgarfrancisco2022.supportportal.domain.User;
import com.edgarfrancisco2022.supportportal.exception.domain.EmailExistsException;
import com.edgarfrancisco2022.supportportal.exception.domain.UserNotFoundException;
import com.edgarfrancisco2022.supportportal.exception.domain.UsernameExistsException;

import java.util.List;

public interface UserService {

    User register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistsException, EmailExistsException;

    List<User> getUsers();

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
