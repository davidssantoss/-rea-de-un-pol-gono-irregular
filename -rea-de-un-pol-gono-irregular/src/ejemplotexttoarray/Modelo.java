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
    //double m[][]=(x[]y[]);
    @Override
    public double calcularArea() {
        
        
        sum= x[0]*y[1]-x[1]*y[0];
        for (int i = 0; i <= sum; i++) {
            sum += x[i+1]*y[i]-x[i]*y[i+1];
            res= sum/2;
            
        }
        /*
        sum = x[0]*y[n-1] - x[n-1]*y[0] 
        for i in range(n-1): 
            sum += x[i+1]*y[i] - x[i]*y[i+1] 
            area = sum/2*/
        return res;
    }
    
}
