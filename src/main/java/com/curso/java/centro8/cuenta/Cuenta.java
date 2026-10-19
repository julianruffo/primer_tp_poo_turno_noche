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

    public void depositarEfectivo(double monto) {

        if (monto > 0) {
            aumentarSaldo(monto);
        } else {
            System.out.println("No se puede depositar montos negativos y saldos iguales a 0");
        }
    }

    public abstract void extraerEfectivo(double monto);

    protected void aumentarSaldo(double monto) {
    if (monto > 0) {
        saldo += monto;
    } else {
        System.out.println("El monto debe ser mayor a cero");
    }
}

protected void disminuirSaldo(double monto) {
    if (monto > 0) {
        saldo -= monto;
    } else {
        System.out.println("El monto debe ser mayor a cero");
    }
}
}