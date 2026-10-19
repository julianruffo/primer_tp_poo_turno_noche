package com.curso.java.centro8.test;

import com.curso.java.centro8.cliente.ClienteEmpresa;
import com.curso.java.centro8.cuenta.CuentaConvertibilidad;

public class TestCuentaConvertibilidad {

        public static void main(String[] args) {

                // Creamos el cliente empresa
                ClienteEmpresa empresa = new ClienteEmpresa(
                                1,
                                "Tech S.A.",
                                "30519190989");

                // Creamos la cuenta
                // Saldo inicial en pesos = 0
                // Saldo inicial en dólares = 0
                // Límite descubierto = 5000
                // Cotización inicial del dólar = 1000
                CuentaConvertibilidad cuenta1 = new CuentaConvertibilidad(
                                "1003",
                                empresa,
                                5000.0,
                                1000.0);

                // Mostramos los saldos iniciales
                System.out.println(
                                "Saldo inicial en pesos: "
                                                + cuenta1.getSaldo());

                System.out.println(
                                "Saldo inicial en dólares: "
                                                + cuenta1.getSaldoDolares());

                cuenta1.depositarEfectivo(10000);

                System.out.println(
                                "Saldo en pesos después de depositar: "
                                                + cuenta1.getSaldo());

                cuenta1.depositarEfectivoDolares(500);

                System.out.println(
                                "Saldo en dólares después de depositar: "
                                                + cuenta1.getSaldoDolares());

                cuenta1.extraerEfectivoDolares(100);

                System.out.println(
                                "Saldo en dólares después de extraer: "
                                                + cuenta1.getSaldoDolares());

                cuenta1.convertirPesosADolares(
                                1000,
                                1530);

                System.out.println(
                                "Saldo en pesos después de convertir pesos a dólares: "
                                                + cuenta1.getSaldo());

                System.out.println(
                                "Saldo en dólares después de convertir pesos a dólares: "
                                                + cuenta1.getSaldoDolares());

                cuenta1.convertirDolaresAPesos(
                                200,
                                1450);

                System.out.println(
                                "Saldo en pesos después de convertir dólares a pesos: "
                                                + cuenta1.getSaldo());

                System.out.println(
                                "Saldo final en dólares: "
                                                + cuenta1.getSaldoDolares());
        }
}