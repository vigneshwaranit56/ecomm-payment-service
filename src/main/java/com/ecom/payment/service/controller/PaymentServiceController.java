package com.ecom.payment.service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentServiceController {

	@GetMapping
	public String testController() {
		return "hello payments Service";
	}
}
