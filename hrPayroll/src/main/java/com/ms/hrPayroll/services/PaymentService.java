package com.ms.hrPayroll.services;

import org.springframework.stereotype.Service;

import com.ms.hrPayroll.entities.Payment;

@Service
public class PaymentService {
	
		public  Payment getPayment(long workerId, int days) {
			return new Payment("Bob", 200.00, days);
		}
	
}
