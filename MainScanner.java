
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        
        System.out.println("ingrese salario sin ajustar: ");
        float salarioInicial = consola.nextFloat();
        System.out.println("ingrese el porcentaje de aumento(por ejemplo 0.1 para 10%): ");
        float porcentajeAumento = consola.nextFloat();
        Ejercicioif pruebaScanner = new Ejercicioif(porcentajeAumento, salarioInicial, 0);
        float salarioAjustado = pruebaScanner.calcularSalario();
        System.out.println("el salario ajustado es: " +salarioAjustado);
        consola.close();
       
    }
}
