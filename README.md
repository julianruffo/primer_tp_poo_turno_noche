# primer_tp_poo_turno_noche
# Sistema Bancario — Trabajo Práctico Java POO

Proyecto desarrollado en Java con Lombok y estructura Maven/Spring Boot.
Aplica herencia, abstracción y encapsulamiento, sin interfaces ni base de datos.

## Clases

- **Cliente:** clase abstracta con el identificador `idnumeroCliente`.
- **ClienteIndividual:** nombre, apellido y DNI.
- **ClienteEmpresa:** nombre de fantasía y CUIT.
- **Cuenta:** clase abstracta con número, saldo y titular.
- **CajaDeAhorro:** operaciones en pesos y cálculo de intereses.
- **CuentaCorriente:** operaciones con límite de descubierto y depósito de cheques.
- **CuentaConvertibilidad:** hereda de CuentaCorriente, admite únicamente
  ClienteEmpresa y permite operar en dólares y convertir monedas.
- **Cheque:** número, monto, banco y fecha de tipo LocalDate.

## Operaciones y validaciones

Las cuentas comienzan con saldo cero. Se validan los montos positivos,
la disponibilidad para extracciones y los datos del cheque al depositarlo.
La caja de ahorro no permite sobregiros; la cuenta corriente permite
utilizar el descubierto disponible.

## Tecnologías

- Java 21
- Maven
- Spring Boot
- Lombok
- Visual Studio Code

## Pruebas

Los ejemplos se encuentran en `src/test/java`, dentro del paquete `tests`.
Cada clase de prueba se ejecuta desde su método `main`:

- TestCajaDeAhorro
- TestCuentaCorriente
- TestCuentaConvertibilidad
- TestCheque

Estas pruebas muestran los resultados por consola.

## UML

El diagrama incluye atributos, relaciones de herencia y métodos propios.
Se omiten constructores, toString y métodos heredados repetidos.
