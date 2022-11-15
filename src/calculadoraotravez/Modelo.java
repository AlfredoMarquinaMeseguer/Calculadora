/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadoraotravez;

/**
 *
 * @author Alfre
 */
public class Modelo {

    private double acumulador = 0;

    public double sumar(double num) {
        acumulador += num;
        return acumulador;
    }

    public double restar(double num) {
        acumulador -= num;
        return acumulador;
    }

    public double multiplicar(double num) {
        acumulador *= num;
        return acumulador;
    }

    public double dividir(double num) {
        acumulador = acumulador / num;
        return acumulador;
    }

    //Setter y Getter
    public double getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(double acumulador) {
        this.acumulador = acumulador;
    }

    //Interfaz y lambdas de las funciones
    public interface Operacion {

        double op(double num);
    }

    public Operacion suma = (num) -> {
        return sumar(num);
    };

    public Operacion resta = (num) -> {
        return restar(num);
    };

    public Operacion multiplicacion = (num) -> {
        return multiplicar(num);
    };

    public Operacion division = (num) -> {
        return dividir(num);
    };

    public Operacion inicial = (num) -> {
        setAcumulador(num);
        return num;
    };
}
