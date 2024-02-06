

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Clase que representa a un empleado con información sobre su salario bruto, impuestos y salario neto.
 */
public class Empleado {

    /** Salario bruto del empleado. */
    private double salarioBruto;

    /** Impuestos y retenciones aplicados al salario bruto del empleado. */
    private double impuesto;

    /** Salario neto del empleado después de aplicar impuestos y retenciones. */
    private double salarioNeto;

    /**
     * Constructor de la clase Empleado.
     * Crea un nuevo empleado con el salario bruto especificado y calcula automáticamente los impuestos y el salario neto.
     *
     * @param salarioBruto El salario bruto del empleado.
     */
    public Empleado(double salarioBruto) {
        this.salarioBruto = salarioBruto;
        impuesto = round2Decimals(salarioBruto * 0.14);
        salarioNeto = salarioBruto - impuesto;
    }

    /**
     * Método para obtener una representación en cadena del objeto Empleado.
     *
     * @return Una cadena que contiene el salario bruto, los impuestos y el salario neto del empleado.
     */
    @Override
    public String toString() {
        return "Salario Bruto: " + salarioBruto
                + "\nImpuestos y retenciones: " + impuesto
                + "\nSalario neto: " + salarioNeto;
    }

    /**
     * Redondea un valor a dos decimales utilizando el modo de redondeo HALF_EVEN.
     *
     * @param val El valor que se va a redondear.
     * @return El valor redondeado a dos decimales.
     */
    public static Double round2Decimals(Double val) {
        return new BigDecimal(val.toString()).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    /**
     * Método para obtener el salario bruto del empleado.
     *
     * @return El salario bruto del empleado.
     */
    public double getSalarioBruto() {
        return salarioBruto;
    }

    /**
     * Método para establecer el salario bruto del empleado.
     *
     * @param salarioBruto El nuevo salario bruto del empleado.
     */
    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    /**
     * Método para obtener los impuestos y retenciones aplicados al salario bruto del empleado.
     *
     * @return Los impuestos y retenciones aplicados al salario bruto del empleado.
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * Método para establecer los impuestos y retenciones aplicados al salario bruto del empleado.
     *
     * @param impuesto El nuevo monto de impuestos y retenciones.
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * Método para obtener el salario neto del empleado después de aplicar impuestos y retenciones.
     *
     * @return El salario neto del empleado.
     */
    public double getSalarioNeto() {
        return salarioNeto;
    }

    /**
     * Método para establecer el salario neto del empleado después de aplicar impuestos y retenciones.
     *
     * @param salarioNeto El nuevo salario neto del empleado.
     */
    public void setSalarioNeto(double salarioNeto) {
        this.salarioNeto = salarioNeto;
    }
}
