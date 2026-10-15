package com.curso.java.centro8.cheque;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString

public class Cheque {

    private String numero;
    private double monto;
    private String banco;
    private LocalDate fecha;
}