package com.ikytus.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ikytus.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
