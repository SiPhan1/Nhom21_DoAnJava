package com.example.WebbanhangNhom21.repository;

import com.example.WebbanhangNhom21.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
