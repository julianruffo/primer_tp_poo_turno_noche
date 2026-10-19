package com.curso.java.centro8.test;

import java.time.LocalDate;

import com.curso.java.centro8.cheque.Cheque;
import com.curso.java.centro8.cliente.ClienteEmpresa;
import com.curso.java.centro8.cuenta.CuentaCorriente;

public class TestCheque {

        public static void main(String[] args) {

                // Creamos el cliente empresa
                ClienteEmpresa empresa = new ClienteEmpresa(
                                1,
                                "Tech S.A.",
                                "30519190989");

                // La cuenta nace con saldo 0
                // y tiene un límite de descubierto de 5000
                CuentaCorriente cuenta1 = new CuentaCorriente(
                                "2002",
                                empresa,
                                5000.0);

                // Depositamos dinero para probar
                cuenta1.depositarEfectivo(10000.0);

                // Creamos el cheque
                Cheque cheque1 = new Cheque(
                                "CH-001",
                                5000.0,
                                "Banco Nación",
                                LocalDate.of(2026, 9, 28));

                System.out.println(
                                "Saldo antes del cheque: "
                                                + cuenta1.getSaldo());

                // Depositamos el cheque
                cuenta1.depositarCheque(cheque1);

                System.out.println(
                                "Saldo después del cheque: "
                                                + cuenta1.getSaldo());

                System.out.println(
                                "Número del cheque: "
                                                + cheque1.getNumero());

                System.out.println(
                                "Monto del cheque: "
                                                + cheque1.getMonto());

                System.out.println(
                                "Banco emisor: "
                                                + cheque1.getBanco());

                System.out.println(
                                "Fecha de pago: "
                                                + cheque1.getFecha());
        }
}