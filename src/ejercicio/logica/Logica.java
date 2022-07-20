package ejercicio.logica;

import java.util.Scanner;

/**
 *
 * @author Daniel Batres
 */

public class Logica {
    private float notaParcialUno;
    private float notaParcialDos;
    private float notaParcialTres;
    private float examenFinal;
    private float trabajo;
    
    Scanner sc = new Scanner(System.in);
    
    public void obtenerNotaFinal() {
        System.out.println("Escribe la nota del primer parcial");
        notaParcialUno = notas(notaParcialUno);
        
        System.out.println("Escribe la nota del segundo parcial");
        notaParcialDos = notas(notaParcialDos);
        
        System.out.println("Escribe la nota del tercer parcial");
        notaParcialTres = notas(notaParcialTres);
        
        System.out.println("Escribe la nota del examen final");
        examenFinal = notas(examenFinal);
        
        System.out.println("Escribe la nota de tu trabajo ex-aula");
        trabajo = notas(trabajo);
        
        float notasParcialesFinales = notasParciales();
        float notaExamen = promedios(examenFinal, 30);
        float notaTrabajo = promedios(trabajo, 15);
        
        float notaFinal = Math.round(notasParcialesFinales + notaExamen + notaTrabajo);
        
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
    
    public float notas(float nota) {
        try {
            nota = sc.nextFloat();
        } catch (Exception e) {
            System.out.println("La nota es invalida");
            System.out.println("Excepción: " + e);
            System.exit(0);
        }
        
        return nota;
    }
    
    public float notasParciales() {
        float notaTotal = (notaParcialUno + notaParcialDos + notaParcialTres);
        return notaTotal / 3 * 55 / 100;
    }
    
    public float promedios(float nota, int promedio) {
        return nota * promedio / 100;
    }
}
