package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cheque.Cheque;
import com.curso.java.centro8.cliente.Cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {

    private double limiteDescubierto;

    public CuentaCorriente(
            String numeroCuenta,
            Cliente titular,
            double limiteDescubierto) {

        super(numeroCuenta, titular);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void depositarEfectivo(double monto) {

        if (monto > 0) {
            aumentarSaldo(monto);
        }
    }

    @Override
    public void extraerEfectivo(double monto) {

        if (monto > 0 &&
                monto <= getSaldo() + limiteDescubierto) {

            disminuirSaldo(monto);
        }
    }

    public void depositarCheque(Cheque cheque) {

        if (cheque != null &&
                cheque.getNumero() != null &&
                !cheque.getNumero().isBlank() &&
                cheque.getMonto() > 0 &&
                cheque.getFecha() != null) {

            aumentarSaldo(cheque.getMonto());
        }
    }
}