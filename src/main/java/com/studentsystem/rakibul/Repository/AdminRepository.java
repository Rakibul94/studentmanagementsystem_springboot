package com.studentsystem.rakibul.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.studentsystem.rakibul.Model.Admin;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
    Optional<Admin> findByUsername(String username);
}