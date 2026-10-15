package com.curso.java.centro8.tests;

import java.time.LocalDate;

import com.curso.java.centro8.cheque.Cheque;
import com.curso.java.centro8.cliente.ClienteEmpresa;
import com.curso.java.centro8.cuenta.CuentaCorriente;

public class TestCuentaCorriente {

        public static void main(String[] args) {

                // Creamos el cliente empresa
                ClienteEmpresa empresa = new ClienteEmpresa(
                                1,
                                "Tech S.A.",
                                "30519190989");

                // La cuenta comienza con saldo 0
                // y tiene un descubierto de 5000
                CuentaCorriente cuenta1 = new CuentaCorriente(
                                "2002",
                                empresa,
                                5000.0);

                System.out.println(
                                "Saldo inicial: " + cuenta1.getSaldo());

                // Depositamos efectivo
                cuenta1.depositarEfectivo(10000);

                System.out.println(
                                "Saldo después de depositar: "
                                                + cuenta1.getSaldo());

                // Extraemos 13000
                cuenta1.extraerEfectivo(13000);

                System.out.println(
                                "Saldo después de extraer 13000: "
                                                + cuenta1.getSaldo());

                // Intentamos extraer 16000
                cuenta1.extraerEfectivo(16000);

                System.out.println(
                                "Saldo después de intentar extraer 16000: "
                                                + cuenta1.getSaldo());

                // Creamos un cheque válido
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

                // Mostramos los datos del cheque
                System.out.println(
                                "Número del cheque: "
                                                + cheque1.getNumero());

                System.out.println(
                                "Monto del cheque: "
                                                + cheque1.getMonto());

                System.out.println(
                                "Banco: "
                                                + cheque1.getBanco());

                System.out.println(
                                "Fecha: "
                                                + cheque1.getFecha());

                System.out.println(
                                "Saldo después del cheque: "
                                                + cuenta1.getSaldo());
        }
}