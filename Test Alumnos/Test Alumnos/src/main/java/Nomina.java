

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Clase que calcula la nómina de un grupo de empleados.
 * Esta clase toma como entrada el número de empleados y el salario inicial, luego calcula y muestra la nómina total.
 * La nómina incluye los salarios brutos, las retenciones y los salarios netos de cada empleado.
 */
public class Nomina {

    /**
     * Método principal que calcula la nómina de los empleados.
     *
     * @param args Los argumentos de la línea de comandos: número de empleados y salario inicial.
     */
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(args[0]); // número de empleados
            double salario = Double.parseDouble(args[1]); // salario en euros
            Empleado[] empleados = new Empleado[n];
            empleados[0] = new Empleado(salario);
            for (int i = 1; i < empleados.length; i++) {
                salario *= 1.10; // incremento del salario en un 10% para cada empleado adicional
                empleados[i] = new Empleado(salario);
            }
            double salariosBrutos = 0;
            double retenciones = 0;
            double salariosNetos = 0;
            for (int i = 0; i < empleados.length; i++) {
                salariosBrutos += empleados[i].getSalarioBruto();
                retenciones += empleados[i].getImpuesto();
                salariosNetos += empleados[i].getSalarioNeto();
                System.out.println("Empleado #" + (i + 1) + ":\n" + empleados[i]);
            }
            System.out.println("\n\nTotal en retenciones: " + retenciones
                    + "\nTotal en salarios netos: " + salariosNetos
                    + "\nTotal a pagar en nómina: " + salariosBrutos);
        } catch (Exception e) {
            System.out.println("Ocurrió un error durante la ejecución: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

 
