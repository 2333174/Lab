package com.example.demo.respository;

import com.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User save(User user);
    List<User> findByName(String name);
    List<User> findByAge(Integer age);
    User deleteByName(String name);
}
