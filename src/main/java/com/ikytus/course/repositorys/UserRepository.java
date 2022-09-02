package com.ikytus.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikytus.course.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
