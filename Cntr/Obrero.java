public class Obrero {
    public static void main(String[] args) {

        final int HORAS_DIARIAS = 8;
        final int DIAS_QUINCENA = 15;
        final double PAGO_POR_HORA = 50.0;
        final double COMPENSACION = 0.02; 
        final double DESCUENTO_IMSS = 0.015; 
        final double DESCUENTO_ISPT = 0.012; 


        int horasTotales = HORAS_DIARIAS * DIAS_QUINCENA;

      
        double salarioBase = horasTotales * PAGO_POR_HORA;

 
        double montoCompensacion = salarioBase * COMPENSACION;

        double descuentoIMSS = salarioBase * DESCUENTO_IMSS;
        double descuentoISPT = salarioBase * DESCUENTO_ISPT;

        double salarioNeto = salarioBase + montoCompensacion - descuentoIMSS - descuentoISPT;

        System.out.println("Cálculo de salario quincenal");
        System.out.println("Salario base: $" + salarioBase);
        System.out.println("Compensación: $" + montoCompensacion);
        System.out.println("Descuento IMSS: $" + descuentoIMSS);
        System.out.println("Descuento ISPT: $" + descuentoISPT);
        System.out.println("Salario neto: $" + salarioNeto);
    }
}
