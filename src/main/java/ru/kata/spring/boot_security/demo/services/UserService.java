package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findByName(String name);
    List<User> getUsers();
    User getUser(long id);
    void save(User user);
    void delete(long id);
}
