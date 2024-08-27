package com.example.solid.dao;
import java.time.LocalDate;
import java.util.List;

import javax.management.relation.Role;

import com.example.solid.model.User;

public interface UserDao <T extends User > {

    void save(T user);
    
    void saveAll(List<T> users);
    
    void update(T user);
    
    boolean existsUserById(Long id);
    
    boolean existsUserByName(String name);
    
    boolean existsUserByEmail(String email);
    
    void deleteById(Long id);
    
    void deleteAll();
    
    void deleteUsersByRole(Role role);
    
    T findUserById(Long id);
    
    T findUserByEmail(String email);
    
    List<T> findUsersByName(String name);
    
    List<T> findUsersByRole(Role role);
    
    List<T> findUsersCreatedAfter(LocalDate date);
    
    List<T> findAll();
    
    List<T> findAll(int page, int size);
    
    List<T> findAllSortedByName();
    
    long count();
    

}
