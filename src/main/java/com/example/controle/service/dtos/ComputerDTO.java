package com.example.controle.service.dtos;

import lombok.*;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ComputerDTO {
    private String proce;
    private int ram ;
    private double price ;
    private String hardDrive ;
}