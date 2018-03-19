/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotexttoarray;

/**
 *
 * @author david
 */
public class Modelo extends Calculo{
    double sum;

    public Modelo(){        
    }
    @Override
    public double calcularArea(double[] x, double[] y) {
        if (x.length != y.length) {
            return 0.0;
        } else {
            double area = 0.0;
            for (int i = 0; i < y.length-1; i+=2) {
                area += x[i]*y[i+1]- x[i+1]*y[i];
            }
            return area/2;
        }
    }
    
}
