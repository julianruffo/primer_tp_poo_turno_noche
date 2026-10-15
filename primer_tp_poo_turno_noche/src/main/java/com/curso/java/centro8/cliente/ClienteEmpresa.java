package com.curso.java.centro8.cliente;


import lombok.Getter;
import lombok.ToString;

@Getter
@ToString (callSuper = true)

public class ClienteEmpresa extends Cliente {

    private String nombreFantasia;
    private String cuit;

    public ClienteEmpresa(int idnumeroCliente, String nombreFantasia, String cuit) {
        super(idnumeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }
}
