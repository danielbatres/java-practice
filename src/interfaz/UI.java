package interfaz;
import ejercicio.ciclo.Ciclo;
import ejercicio.circunferencia.Circunferencia;
import ejercicio.logica.Logica;
import java.util.Scanner;

/**
 *
 * @author Daniel Batres
 */

public class UI {
    Ciclo ciclo = new Ciclo();
    Circunferencia circunferencia = new Circunferencia();
    Logica logica = new Logica();
    Scanner sc = new Scanner(System.in);
    
    public void interfaz() {
        int respuesta = 0;
        
        System.out.println("Bienvenido a la aplicación de consola.");
         
        do {
            System.out.println("\n Escoge el ejercicio que deseas realizar \n"
            + "1.- Datos de una circunferencia \n"
            + "2.- Obtener la nota final \n"
            + "3.- Calificación final, lógica computacional \n"
            + "0.- Salir \n");
            
            try {
                respuesta = sc.nextInt();
            } catch (Exception e) {
                System.out.println("El tipo de dato ingresado no es valido");
                System.out.println("Excepción: " + e + "\n");
            }
            
            switch (respuesta) {
                case 1:
                    circunferencia.setRadio();
                    
                    if (circunferencia.getRadio() != 0) {
                        circunferencia.calcularArea();
                        circunferencia.calcularDiametro();
                        circunferencia.calcularPerimetro();
                    } else {
                        System.out.println("El numero es invalido \n");
                    }
                    break;
                case 2:
                    ciclo.obtenerNotaFinal();
                    break;
                case 3:
                    logica.obtenerNotaFinal();
                    break;
                case 0:
                    System.out.println("¡Que tengas un buen día!");
                    break;
                default:
                    System.out.println("Porfavor ingresa una respuesta correcta \n");
                    break;
            }
        } while (respuesta != 0);
    }
}
