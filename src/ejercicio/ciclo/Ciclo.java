package ejercicio.ciclo;
import java.util.Scanner;

/**
 *
 * @author Daniel Batres
 */

public class Ciclo {
    private float parcialUno;
    private float parcialDos;
    private float parcialTres;
    private float notaTarea;
    
    Scanner sc = new Scanner(System.in);
        
    public void obtenerNotaFinal() {
        System.out.println("Digite la nota de su primer parcial");
        this.parcialUno = calculo(this.parcialUno, 20);
            
        System.out.println("Digite la nota de su segundo parcial");
        this.parcialDos = calculo(this.parcialDos, 25);
            
        System.out.println("Digite la nota de su tercer parcial");
        this.parcialTres = calculo(this.parcialTres, 40);
            
        System.out.println("Ingrese la nota de la tarea");
        this.notaTarea = calculo(this.notaTarea, 15);
            
        float notaFinal = Math.round(this.parcialUno + this.parcialDos + this.parcialTres + this.notaTarea);
        
        if (notaFinal > 10) {
            System.out.println("Datos incorrectos, tu nota no puede ser mayor a 10.0");
            System.exit(0);
        }
            
        System.out.println("Tu nota final es: " + notaFinal);
        
        if (notaFinal >= 7) {
            System.out.println("Aprobado, Felicitaciones");
        } else if (notaFinal == 6) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
    }
    
    public float calculo(float nota, int porcentaje) {
        try {
            nota = sc.nextFloat() * porcentaje / 100;
        } catch (Exception e) {
            System.out.println("La nota es invalida");
            System.out.println("Excepción: " + e);
            System.exit(0);
        }
        
        return nota;
    }
}
