/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sobrecarga.area;

/**
 *
 * @author Luisf
 */
public class Figuras {
    
    private double altura;
    private double base;
    private double longitud;
    private float radio;
    private double base2;
    private double area;

    public Figuras() {
        altura = 0;
        base = 0;
        longitud = 0;
        radio = 0;
        base2 = 0;
        area = 0;

    }

    public Figuras(double altura, double base, double longitud, float radio, double base2, double area) {
        this.altura = altura;
        this.base = base;
        this.longitud = longitud;
        this.radio = radio;
        this.base2 = base2;
        this.area = area;
    }

    public void area(double base, double altura) {
        this.altura = altura;
        this.base = base;

        if (base != 0 && altura != 0) {
            area = (base * altura) / 2;
            System.out.println("El area del triangulo es: " + area);
        } else {
            System.out.println("Los valores no pueden valer 0");
        }
    }

    public void area(double longitud) {
        this.longitud = longitud;
        
        if (longitud != 0) {
            area = longitud * 4;
            System.out.println("El area del cuadrado es: " + area);

        } else {
            System.out.println("Los valores no pueden valer 0");
        }
    }

    public void area(float radio) {
        this.radio = radio;
        
        if (radio != 0) {
            area = (Math.PI * Math.pow(radio, 2));
            System.out.println("El area del circulo es: " + area);
        }
    }
    
    public void area(double base, double base2, double altura) {
        this.base = base;
        this.base2 = base2;
        this.altura = altura;

        if (base != 0 && base2 != 0 && altura != 0) {
            area = ((base + base2) * altura) / 2;
            System.out.println("El area del trapecio es: " + area);
        }
    }
}
