package com.example.motos.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.motos.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}