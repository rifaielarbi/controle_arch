package com.example.controle.service.mappers;

import com.example.controle.dao.entities.Computer;
import com.example.controle.service.dtos.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
@Component
public class ComputerMapper {
    private ModelMapper modelMapper = new ModelMapper();
    public ComputerDTO fromComputerToComputerDTO(Computer computer) {
        return this.modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer fromComputerToComputerDTO(ComputerDTO computerDTO) {
        return this.modelMapper.map(computerDTO, Computer.class);
    }
}



