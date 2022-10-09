package com.example.repo;

import com.example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role , Long> {

    Role findByName(String name);

}
