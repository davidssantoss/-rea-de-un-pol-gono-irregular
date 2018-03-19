package ejemplotexttoarray;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Interfaz extends JFrame{
    DibujoPoligono dp;
    
    JLabel etqx1 = new JLabel ("x1");
    JLabel etqx2 = new JLabel ("x2");
    JLabel etqx3 = new JLabel ("x3");
    JLabel etqx4 = new JLabel ("x4");
    JLabel etqx5 = new JLabel ("x5");
    JLabel etqx6 = new JLabel ("x6");
    JLabel etqy1 = new JLabel ("y1");
    JLabel etqy2 = new JLabel ("y2");
    JLabel etqy3 = new JLabel ("y3");
    JLabel etqy4 = new JLabel ("y4");
    JLabel etqy5 = new JLabel ("y5");
    JLabel etqy6 = new JLabel ("y6");
    JLabel resul= new JLabel("Resultado");
    JTextField txtx1 = new JTextField ();
    JTextField txtx2 = new JTextField ();
    JTextField txtx3 = new JTextField ();
    JTextField txtx4 = new JTextField ();
    JTextField txtx5 = new JTextField ();
    JTextField txtx6 = new JTextField ();
    JTextField txty1 = new JTextField ();
    JTextField txty2 = new JTextField ();
    JTextField txty3 = new JTextField ();
    JTextField txty4 = new JTextField ();
    JTextField txty5 = new JTextField ();
    JTextField txty6 = new JTextField ();
    JButton boton = new JButton ("Calcular");

    public Interfaz() {
        this.setTitle("Hallar el area de un poligono");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Container c= getContentPane();
        c.setLayout(null);
        c.add(resul);
        resul.setBounds(830, 150, 100, 60);
                
        c.add(etqx1);
        etqx1.setBounds(430, 10, 20, 20);
        
        c.add(etqx2);
        etqx2.setBounds(430, 40, 20, 20);
        
        c.add(etqx3);
        etqx3.setBounds(430, 70, 20, 20);
        
        c.add(etqx4);
        etqx4.setBounds(430, 100, 20, 20);
        
        c.add(etqx5);
        etqx5.setBounds(430, 130, 20, 20);
        
        c.add(etqx6);
        etqx6.setBounds(430, 160, 20, 20);
        
        c.add(txtx1);
        txtx1.setBounds(480, 10, 80, 20);
        
        c.add(txtx2);
        txtx2.setBounds(480, 40, 80, 20);
        
        c.add(txtx3);
        txtx3.setBounds(480, 70, 80, 20);
        
        c.add(txtx4);
        txtx4.setBounds(480, 100, 80, 20);
        
        c.add(txtx5);
        txtx5.setBounds(480, 130, 80, 20);
        
        c.add(txtx6);
        txtx6.setBounds(480, 160, 80, 20);
        
        
        c.add(etqy1);
        etqy1.setBounds(650, 10, 20, 20);
        
        c.add(etqy2);
        etqy2.setBounds(650, 40, 80, 20);
        
        c.add(etqy3);
        etqy3.setBounds(650, 70, 80, 20);
        
        c.add(etqy4);
        etqy4.setBounds(650, 100, 80, 20);
        
        c.add(etqy5);
        etqy5.setBounds(650, 130, 80, 20);
        
        c.add(etqy6);
        etqy6.setBounds(650, 160, 80, 20);
        
        c.add(txty1);
        txty1.setBounds(690, 10, 80, 20);
        
        c.add(txty2);
        txty2.setBounds(690, 40, 80, 20);
        
        c.add(txty3);
        txty3.setBounds(690, 70, 80, 20);
        
        c.add(txty4);
        txty4.setBounds(690, 100, 80, 20);
        
        c.add(txty5);
        txty5.setBounds(690, 130, 80, 20);
        
        c.add(txty6);
        txty6.setBounds(690, 160, 80, 20);
        
        c.add(boton);
        boton.setBounds(830, 50, 100, 50); 
        
    }
    void mostrar (){
        setSize(1000,1000);
        setVisible(true);
    }
    
        
        
    
    void asignarOyente(Controlador c){
        boton.addActionListener(c);
    }
    
    
    
    
    
    
    
            
           
    
}
