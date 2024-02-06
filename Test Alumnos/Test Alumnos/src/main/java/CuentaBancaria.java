/**
 * Clase que representa una cuenta bancaria con funcionalidades para depósito, retiro y aplicación de interés.
 */
public class CuentaBancaria {

    /** Saldo actual de la cuenta bancaria. */
    private double saldo;

    /** Tasa de interés aplicada a la cuenta bancaria. */
    private double tasaInteres;

    /**
     * Constructor de la clase CuentaBancaria.
     * Crea una nueva cuenta bancaria con el saldo inicial y la tasa de interés especificados.
     *
     * @param saldoInicial El saldo inicial de la cuenta bancaria.
     * @param tasaInteres La tasa de interés aplicada a la cuenta bancaria.
     */
    public CuentaBancaria(double saldoInicial, double tasaInteres) {
        this.saldo = saldoInicial;
        this.tasaInteres = tasaInteres;
    }

    /**
     * Método para realizar un depósito en la cuenta bancaria.
     *
     * @param monto El monto a depositar en la cuenta.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero.
     */
    public void deposito(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        this.saldo += monto;
    }

    /**
     * Método para realizar un retiro de la cuenta bancaria.
     *
     * @param monto El monto a retirar de la cuenta.
     * @throws IllegalArgumentException Si el monto es menor o igual a cero, o si el monto excede el saldo disponible.
     */
    public void retiro(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero.");
        }
        if (monto > this.saldo) {
            throw new IllegalArgumentException("El monto excede el saldo disponible.");
        }
        this.saldo -= monto;
    }

    /**
     * Método para aplicar la tasa de interés a la cuenta bancaria.
     * El saldo de la cuenta se incrementa en función de la tasa de interés.
     */
    public void aplicarInteres() {
        this.saldo += this.saldo * this.tasaInteres;
    }

    /**
     * Método para obtener el saldo actual de la cuenta bancaria.
     *
     * @return El saldo actual de la cuenta bancaria.
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * Método para obtener la tasa de interés aplicada a la cuenta bancaria.
     *
     * @return La tasa de interés aplicada a la cuenta bancaria.
     */
    public double getTasaInteres() {
        return this.tasaInteres;
    }
}


