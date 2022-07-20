package ejercicio.circunferencia;
import java.util.Scanner;

/**
 *
 * @author Daniel Batres
 */

public class Circunferencia {
    private double radio;
    private double area;
    private double diametro;
    private double perimetro;
    final public double PI = Math.PI;
    
    Scanner sc = new Scanner(System.in);
    
    public void setRadio() {
        System.out.println("Escribe el radio de la circunferencia");
        
        try {
            this.radio = sc.nextDouble();
        } catch (Exception e) {
            System.out.println("El tipo de dato es invalido");
            System.out.println("Excepción: " + e + "\n");
            System.exit(0);
        }
    }

    public double getRadio() {
        return radio;
    }
    
    public void calcularArea() {
        this.area = Math.round(PI * Math.pow(radio, 2));
        
        System.out.println("El area de la circunferencia es: " + this.area);
    }
    
    public void calcularDiametro() {
        this.diametro = this.radio * 2;
        
        System.out.println("El diametro de la circunferencia es: " + this.diametro);
    }
    
    public void calcularPerimetro() {
        this.perimetro = Math.round(2 * PI * this.radio);
        
        System.out.println("El perimetro de la cirunferencia es: " + this.perimetro);
    }
}
