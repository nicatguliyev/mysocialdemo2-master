package com.nicatguliyev.mysocialdemo2.repo;

import com.nicatguliyev.mysocialdemo2.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
