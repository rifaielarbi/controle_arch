package com.example.controle.web;

import com.example.controle.service.ComputerManager;
import com.example.controle.service.dtos.ComputerDTO;
import org.hibernate.annotations.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

@Component
public class ComputerGraphQlController {
    @Autowired
    private ComputerManager computerManager ;

    @QueryMapping
    public ComputerDTO getComputerById(@Argument Long id) {
        return computerManager.getComputerById(id);
    }

    @MutationMapping
    public ComputerDTO saveComputer(ComputerDTO computerDTO) {
        return computerManager.saveComputer(computerDTO);
    }
}


