package com.example.motos.repos;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.motos.Role;
public interface RoleRepository extends JpaRepository<Role, Long> {
Role findByRole(String role);
}
