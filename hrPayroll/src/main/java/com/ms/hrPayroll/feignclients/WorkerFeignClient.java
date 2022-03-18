package com.ms.hrPayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.hrPayroll.entities.Worker;



@Component
@FeignClient(name = "hrWorker", path="/workers")
public interface WorkerFeignClient {
	
	@GetMapping(value = "/{id}")
	 ResponseEntity<Worker> findById(@PathVariable Long id);
}