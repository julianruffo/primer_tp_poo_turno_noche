package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cliente.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)
public class CajaDeAhorro extends Cuenta {

    private double tasaInteres;

    public CajaDeAhorro(String numeroCuenta, Cliente titular, double tasaInteres) {
        super(numeroCuenta, titular);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(double monto) {

        if (monto > 0 && monto <= getSaldo()) {
            disminuirSaldo(monto);
        }
    }

    public void cobrarInteres() {

        if (getSaldo() > 0 && tasaInteres > 0) {
            double interes = getSaldo() * tasaInteres;
            aumentarSaldo(interes);
        } else {
            System.out.println("El saldo y la tasa de interés deben ser positivos");
        }
    }
}