package com.ms.hrWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.hrWorker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
