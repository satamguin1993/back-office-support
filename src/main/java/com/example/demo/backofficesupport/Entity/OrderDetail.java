package com.example.demo.backofficesupport.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "order_detail_id", unique = true, nullable = false)
    private Integer orderDetailId;

    @Column(name = "tracking_id", unique = true, nullable = false)
    private UUID trackingId;

}
