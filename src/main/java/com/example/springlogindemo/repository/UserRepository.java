package com.example.springlogindemo.repository;

import com.example.springlogindemo.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Long> {
}
