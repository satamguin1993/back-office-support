package com.example.demo.backofficesupport.Repository;

import com.example.demo.backofficesupport.Entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}
