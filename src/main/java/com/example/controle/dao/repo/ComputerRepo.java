package com.example.controle.dao.repo;

import com.example.controle.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepo extends JpaRepository<Computer,Long> {
}
