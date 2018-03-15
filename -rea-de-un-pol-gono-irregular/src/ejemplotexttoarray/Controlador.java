/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotexttoarray;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author david
 */
class Controlador implements ActionListener {
    Interfaz inter;
    Modelo m;

    public Controlador(Interfaz inter, Modelo m) {
        this.inter = inter;
        this.m = m;
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {
          m.x= new double [6];
        m.y= new double [6];
        String s1= inter.txtx1.getText();
        m.x[0]=Double.parseDouble(s1);
        String s2= inter.txtx2.getText();
        m.x[1]=Double.parseDouble(s2);
        String s3= inter.txtx3.getText();
        m.x[2]=Double.parseDouble(s3);
        String s4= inter.txtx4.getText();
        m.x[3]=Double.parseDouble(s4);
        String s5= inter.txtx5.getText();
        m.x[4]=Double.parseDouble(s5);
        String s6= inter.txtx6.getText();
        m.x[5]=Double.parseDouble(s6);
        
        String s7= inter.txty1.getText();
        m.y[0]=Double.parseDouble(s7);
        String s8= inter.txty2.getText();
        m.y[1]=Double.parseDouble(s8);
        String s9= inter.txty3.getText();
        m.y[2]=Double.parseDouble(s9);
        String s10= inter.txty4.getText();
        m.y[3]=Double.parseDouble(s10);
        String s11= inter.txty5.getText();
        m.y[4]=Double.parseDouble(s11);
        String s12= inter.txty6.getText();
        m.y[5]=Double.parseDouble(s12);
         
        if (m.x[0] != m.y[m.y.length-1]) {;
            JOptionPane.showMessageDialog(null, "Para ser un polígono regular, el primer vertice de X debe corresponder con el de Y");
        }
        
        if (evento.getSource()== inter.boton ){
            inter.resul.setText(""+m.calcularArea());
        }    
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa correctamente todos los datos");
        }
                
    }

    
}
