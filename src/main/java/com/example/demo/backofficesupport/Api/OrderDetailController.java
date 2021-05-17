package com.example.demo.backofficesupport.Api;

import com.example.demo.backofficesupport.Api.Requests.OrderDetailRequest;
import com.example.demo.backofficesupport.Service.OrderDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class OrderDetailController {

    private static final Logger logger = LoggerFactory.getLogger(OrderDetailController.class);

    @Autowired
    private OrderDetailService orderDetailService;

    @PostMapping(path = "/orderDetail")
    public ResponseEntity<OrderDetailRequest> createNewOrder(@RequestBody OrderDetailRequest request) {
        request = orderDetailService.createNewOrder(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(request);
    }
}
