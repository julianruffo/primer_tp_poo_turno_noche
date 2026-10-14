package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cliente.Cliente;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public abstract class Cuenta {

    private final String numeroCuenta;
    private double saldo;
    private final Cliente titular;

    public Cuenta(String numeroCuenta, Cliente titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    public abstract void depositarEfectivo(double monto);

    public abstract void extraerEfectivo(double monto);

    protected void aumentarSaldo(double monto) {
        saldo += monto;
    }

    protected void disminuirSaldo(double monto) {
        saldo -= monto;
    }
}