package com.curso.java.centro8.cuenta;

import com.curso.java.centro8.cliente.ClienteEmpresa;

import lombok.Getter;

@Getter
public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoDolares;

    public CuentaConvertibilidad(String numeroCuenta, ClienteEmpresa titular, double limiteDescubierto,
            double cotizacionDolar) {
        super(numeroCuenta, titular, limiteDescubierto);
        this.saldoDolares = 0;

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
        } else {
            System.out.println("No se puede extraer montos negativos y saldos iguales a 0");
        }
    }

    public void convertirPesosADolares(double montoPesos, double cotizacionDolar) {
        if (montoPesos > 0 &&
                cotizacionDolar > 0 &&
                montoPesos <= getSaldo()) {
            double dolares = montoPesos / cotizacionDolar;
            disminuirSaldo(montoPesos);
            saldoDolares += dolares;
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double cotizacionDolar) {
        if (montoDolares > 0 &&
                cotizacionDolar > 0 &&
                montoDolares <= saldoDolares) {
            double pesos = montoDolares * cotizacionDolar;
            saldoDolares -= montoDolares;
            aumentarSaldo(pesos);
        }
    }
}