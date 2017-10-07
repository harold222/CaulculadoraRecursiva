package calculadora;

import java.io.IOException;

/**Declaracion de la clase Operaciones.
 *@author Harold Pedraza
 *@version 16/09/2017
 */

public class Operaciones {

	public int suma(int numerador, int denominador) throws IOException {
        return numerador + denominador;
    }
    
    public int resta(int minuendo, int sustraendo) throws IOException {
        return minuendo - sustraendo;
    }
    
    public int modulo(int numer1, int numer2) throws IOException {
        return numer1 % numer2;
    }
    
    public double division(int numer1, int numer2) throws IOException {
        if (numer2 != 0) {
            return numer1 / numer2;
        } else {
            return Double.NaN;
        }

    }
    
    public int factorial(int x) throws IOException {
        if (x < 1) {
            return 1;
        } else {
            return multi(x, factorial(x - 1));
        }
    }
     
    public int potencia(int base, int exponente) throws IOException {
        if (exponente == 1) {
            return (int) base;
        } else {
            if (exponente == 0) {
                return 1;
            } else {
                if (exponente > 1) {
                    return (int) (base * potencia(base, exponente - 1));
                } else {
                    return 1 / potencia(base, exponente * (-1));
                }
            }
        }
    }
    
    public double seno(double x) throws IOException {
        int i;
        double operacion = 0;
        int signo = 1;
        //CICLO IMPAR
        for (i = 1; i < 10; i += 2) {
            operacion += signo * potencia((int) x, i) / factorial(i);
            signo *= -1;
        }
        return operacion;
    }
    
    public double coseno(double x) throws IOException {
        int i;
        double operacion = 0;
        int signo = 1;
        //CICLO PAR
        for (i = 0; i < 10; i += 2) {
            operacion += signo * potencia((int) x, i) / factorial(i);
            signo = signo * -1;
        }
        return operacion;
    }
    
    public int multi(int numer1, int numer2) throws IOException {
        int result = 0;
        for (int i = 0; i < numer2; i++) {
            result = suma(result, numer1);
        }
        return result;
    }

    public double integral(int valor, int inicio, int fin) throws IOException {
        //suma de raymmon es suma de cuadrados  
        int acum = 0;
        for (double i = inicio; i < fin; i += valor) {
            acum += valor * potencia((int) i, 2);
        }
        return acum;
    }

    public double[] cuadratica(double numer1, double numer2, double numer3) throws IOException {
        double operacion;
        double[] resultados = new double[2];
        operacion = (numer2 * numer2) - ((numer1 * numer3) * 4);
        if (operacion < 0) {
            resultados[0] = Double.NaN;
            resultados[1] = Double.NaN;
        }
        if (operacion == 0) {
            //La ecuacion tiene solo una raiz real
            resultados[0] = (-numer2) / (2 * numer1);
            resultados[1] = Double.NaN;
        }
        if (operacion > 0) {
            resultados[0] = (-numer2) + Math.sqrt(operacion) / (2 * numer1);
            resultados[1] = (-numer2) - Math.sqrt(operacion) / (2 * numer1);
            //posee dos soluciones reales
        }
        return resultados;
    }
}
