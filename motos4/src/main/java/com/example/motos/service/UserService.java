package com.example.motos.service;
import com.example.motos.Role;
import com.example.motos.User;
public interface UserService {
void deleteAllusers();
void deleteAllRoles();
User saveUser(User user);
User findUserByUsername (String username);
Role addRole(Role role);
User addRoleToUser(String username, String rolename);
}

