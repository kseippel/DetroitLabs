package com.example.springboot.controller;

import com.example.springboot.model.Error;
import com.example.springboot.model.Order;
import com.example.springboot.model.TotalPrice;
import com.example.springboot.service.CalculateOrderTotalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PriceController {

	private CalculateOrderTotalService calculateOrderTotalService;

	@Autowired
	public PriceController(CalculateOrderTotalService calculateOrderTotalService) {
		this.calculateOrderTotalService = calculateOrderTotalService;
	}

	@PostMapping("/calculateTotal")
	public ResponseEntity<Object> calculateTotal(@RequestBody Order order) {

		if(order.getBeefTaco() < 0 || order.getChickenTaco() < 0 || order.getChorizoTaco() < 0
				|| order.getVeggieTaco() < 0) {
			Error error = new Error("Cannot have negative amount");
			return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
		}

		TotalPrice totalPrice = new TotalPrice(calculateOrderTotalService.totalPrice(order));
		return new ResponseEntity<>(totalPrice, HttpStatus.OK);
	}

}
