package com.sac.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.sac.project.domain.User;

import java.util.Optional;
 
@EnableJpaRepositories
@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
      Optional<User> findOneByEmailAndPassword(String email, String password);
 
    User findByEmail(String email);
}
