package org.example;

/**
 * Clase que representa una mini calculadora con operaciones simples.
 */
public class MiniCalculadoraEjemplo {

    /**
     * Calcula el valor absoluto de un número.
     *
     * @param numero Número de tipo double del cual se calculará el valor absoluto.
     * @return El valor absoluto del número.
     */
    public double valorAbsoluto(double numero) {
        return Math.abs(numero);
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param numero Número de tipo double del cual se calculará la raíz cuadrada.
     * @return La raíz cuadrada del número.
     * @throws IllegalArgumentException Si el número es negativo, ya que la raíz cuadrada de un número negativo no está definida en los números reales.
     */
    public double raizCuadrada(double numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo en los números reales.");
        }
        return Math.sqrt(numero);
    }

    /**
     * Método principal para probar la clase MiniCalculadoraEjemplo.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este ejemplo).
     */
    public static void main(String[] args) {
        MiniCalculadoraEjemplo miniCalculadora = new MiniCalculadoraEjemplo();

        // Ejemplo de uso
        double numero = -9.0;

        // Valor absoluto
        double valorAbsoluto = miniCalculadora.valorAbsoluto(numero);
        System.out.println("Valor absoluto de " + numero + ": " + valorAbsoluto);

        // Raíz cuadrada
        try {
            double raizCuadrada = miniCalculadora.raizCuadrada(numero);
            System.out.println("Raíz cuadrada de " + numero + ": " + raizCuadrada);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
