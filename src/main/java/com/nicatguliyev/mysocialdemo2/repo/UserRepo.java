package com.nicatguliyev.mysocialdemo2.repo;

import com.nicatguliyev.mysocialdemo2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    //User findByUsername(String username);
     User  findByEmail(String email);
}
