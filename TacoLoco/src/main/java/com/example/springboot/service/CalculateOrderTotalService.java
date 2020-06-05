package com.example.springboot.service;

import com.example.springboot.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface CalculateOrderTotalService {

    Double totalPrice(Order order);
}
