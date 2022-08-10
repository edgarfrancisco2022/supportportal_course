package com.edgarfrancisco2022.supportportal.UserRepository;

import com.edgarfrancisco2022.supportportal.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUsername(String username);

    User findUserByEmail(String email);
}
