package com.ms.hrPayroll.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ms.hrPayroll.entities.Payment;
import com.ms.hrPayroll.entities.Worker;
import com.ms.hrPayroll.feignclients.WorkerFeignClient;

@Service
public class PaymentService {
		
		@Autowired
		private WorkerFeignClient workerFeignClient;
	
		public  Payment getPayment(long workerId, int days) {
			
			Worker worker = workerFeignClient.findById(workerId).getBody();
			
			return new Payment(worker.getName(), worker.getDailyIncome(), days);
		}
	
}
