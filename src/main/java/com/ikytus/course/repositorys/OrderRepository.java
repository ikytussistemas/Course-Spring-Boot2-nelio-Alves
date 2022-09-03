package com.ikytus.course.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ikytus.course.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
