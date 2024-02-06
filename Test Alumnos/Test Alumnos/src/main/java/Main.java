

/**
 * Clase principal que realiza operaciones matemáticas básicas.
 */
public class Main {

	/**
	 * Método principal que realiza la operación especificada y muestra el resultado.
	 *
	 * @param args Los argumentos de la línea de comandos: valor1, valor2 y operación (+, -, x, /).
	 * @throws Exception Si ocurre un error durante la ejecución.
	 */
	public static void main(String[] args) throws Exception {
		try {
			int valor1 = 0;
			int valor2 = 0;
			String op = "";
			int res = 0;

			valor1 = Integer.parseInt(args[0]);
			valor2 = Integer.parseInt(args[1]);
			op = args[2];

			if ("+".equals(op)) {
				res = suma(valor1, valor2);
			} else if ("-".equals(op)) {
				res = resta(valor1, valor2);
			} else if ("x".equals(op)) {
				res = multiplica(valor1, valor2);
			} else if ("/".equals(op)) {
				res = divide(valor1, valor2);
			} else {
				throw new IllegalArgumentException("Valor inesperado: " + op);
			}
			System.out.print("El resultado de " + valor1 + " " + op + " " + valor2 + " = " + res);
		} catch (Exception e) {
			System.out.print("Ocurrió un error durante la ejecución: " + e.getMessage());
			throw e;
		}
	}

	/**
	 * Método para sumar dos valores enteros.
	 *
	 * @param valor1 El primer valor entero.
	 * @param valor2 El segundo valor entero.
	 * @return El resultado de la suma.
	 */
	public static int suma(int valor1, int valor2) {
		return valor1 + valor2;
	}

	/**
	 * Método para restar dos valores enteros.
	 *
	 * @param valor1 El primer valor entero.
	 * @param valor2 El segundo valor entero.
	 * @return El resultado de la resta.
	 */
	public static int resta(int valor1, int valor2) {
		return valor1 - valor2;
	}

	/**
	 * Método para multiplicar dos valores enteros.
	 *
	 * @param valor1 El primer valor entero.
	 * @param valor2 El segundo valor entero.
	 * @return El resultado de la multiplicación.
	 */
	public static int multiplica(int valor1, int valor2) {
		return valor1 * valor2;
	}

	/**
	 * Método para dividir dos valores enteros.
	 *
	 * @param valor1 El dividendo (primer valor entero).
	 * @param valor2 El divisor (segundo valor entero).
	 * @return El resultado de la división.
	 */
	public static int divide(int valor1, int valor2) {
		return valor1 / valor2;
	}
}
