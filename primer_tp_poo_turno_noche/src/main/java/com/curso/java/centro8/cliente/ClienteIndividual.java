package com.curso.java.centro8.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente {
    
    private String nombre;
    private String apellido;
    private String dni;

    public ClienteIndividual(int idnumeroCliente, String nombre, String apellido, String dni) {
        super(idnumeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

}
