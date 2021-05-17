package com.example.demo.backofficesupport.Service;

import com.example.demo.backofficesupport.Api.Requests.OrderDetailRequest;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService {

    public OrderDetailRequest createNewOrder(OrderDetailRequest request) {
        return new OrderDetailRequest();
    }

}
