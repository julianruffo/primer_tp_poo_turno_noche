package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cliente.Cliente;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@RequiredArgsConstructor
@ToString
public abstract class Cuenta {

    private final String numeroCuenta;
    private double saldo;
    private final Cliente titular;

    public abstract void depositarEfectivo(double monto);

    public abstract void extraerEfectivo(double monto);

    protected void aumentarSaldo(double monto) {
        saldo += monto;
    }

    protected void disminuirSaldo(double monto) {
        saldo -= monto;
    }
}