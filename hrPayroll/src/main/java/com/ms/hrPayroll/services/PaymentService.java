package com.ms.hrPayroll.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ms.hrPayroll.entities.Payment;
import com.ms.hrPayroll.entities.Worker;

@Service
public class PaymentService {
		
		@Value("${hrWorker.host}")
		private String workerHost;
		
		@Autowired
		private RestTemplate restTemplate;
	
		public  Payment getPayment(long workerId, int days) {
			Map<String, String>	uriVariables = new HashMap<>();
			uriVariables.put("id", ""+workerId);
			
			Worker worker = restTemplate.getForObject(workerHost + "/workers/{id}", Worker.class, uriVariables);
			
			return new Payment(worker.getName(), worker.getDailyIncome(), days);
		}
	
}
