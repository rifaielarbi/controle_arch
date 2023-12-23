package com.example.controle.service;

import com.example.controle.service.dtos.ComputerDTO;

public interface ComputerManager {
    public ComputerDTO getComputerById(Long id);
    public ComputerDTO saveComputer(ComputerDTO computerDTO);
}

