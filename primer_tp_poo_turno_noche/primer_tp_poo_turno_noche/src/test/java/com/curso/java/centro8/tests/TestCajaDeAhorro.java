package com.curso.java.centro8.tests;

import com.curso.java.centro8.cliente.ClienteIndividual;
import com.curso.java.centro8.cuenta.CajaDeAhorro;

public class TestCajaDeAhorro {

        public static void main(String[] args) {

                ClienteIndividual cliente1 = new ClienteIndividual(
                                1,
                                "Juan",
                                "Perez",
                                "12345678");

                // La cuenta se crea con saldo inicial en 0
                // 0.035 representa una tasa del 3,5 %
                CajaDeAhorro caja1 = new CajaDeAhorro(
                                "10",
                                cliente1,
                                0.035);

                System.out.println(
                                "Saldo inicial: " + caja1.getSaldo());

                caja1.depositarEfectivo(5000);

                System.out.println(
                                "Saldo después de depositar: "
                                                + caja1.getSaldo());

                caja1.extraerEfectivo(2000);

                System.out.println(
                                "Saldo después de extraer: "
                                                + caja1.getSaldo());

                caja1.extraerEfectivo(20000);

                System.out.println(
                                "Saldo después de intentar extraer más de lo disponible: "
                                                + caja1.getSaldo());

                caja1.cobrarInteres();

                System.out.println(
                                "Saldo después de cobrar interés: "
                                                + caja1.getSaldo());
                System.out.println(caja1);

                System.out.println(cliente1);
        }
}