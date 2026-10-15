package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cliente.ClienteEmpresa;

import lombok.Getter;

@Getter
public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoDolares;
    private double cotizacionDolar;

    public CuentaConvertibilidad(
            String numeroCuenta,
            ClienteEmpresa titular,
            double limiteDescubierto,
            double cotizacionDolar) {

        super(numeroCuenta, titular, limiteDescubierto);

        this.saldoDolares = 0;
        this.cotizacionDolar = cotizacionDolar;
    }

    public void depositarEfectivoDolares(double monto) {

        if (monto > 0) {
            saldoDolares += monto;
        } else {
            System.out.println("No se puede depositar montos negativos y saldos iguales a 0");
        }
    }

    public void extraerEfectivoDolares(double monto) {

        if (monto > 0 && monto <= saldoDolares) {
            saldoDolares -= monto;
        }
    }

    public void convertirPesosADolares(
            double montoPesos,
            double cotizacion) {

        if (montoPesos > 0 &&
                cotizacion > 0 &&
                montoPesos <= getSaldo()) {

            double dolares = montoPesos / cotizacion;

            disminuirSaldo(montoPesos);
            saldoDolares += dolares;
        }
    }

    public void convertirDolaresAPesos(
            double montoDolares,
            double cotizacion) {

        if (montoDolares > 0 &&
                cotizacion > 0 &&
                montoDolares <= saldoDolares) {

            double pesos = montoDolares * cotizacion;

            saldoDolares -= montoDolares;
            aumentarSaldo(pesos);
        }
    }
}