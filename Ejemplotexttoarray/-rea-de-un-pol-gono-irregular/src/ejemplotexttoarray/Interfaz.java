package ejemplotexttoarray;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Interfaz extends JFrame{
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
        Container c= getContentPane();
        c.setLayout(null);
        c.add(resul);
        resul.setBounds(430, 150, 100, 60);
                
        c.add(etqx1);
        etqx1.setBounds(10, 10, 20, 20);
        
        c.add(etqx2);
        etqx2.setBounds(10, 40, 20, 20);
        
        c.add(etqx3);
        etqx3.setBounds(10, 70, 20, 20);
        
        c.add(etqx4);
        etqx4.setBounds(10, 100, 20, 20);
        
        c.add(etqx5);
        etqx5.setBounds(10, 130, 20, 20);
        
        c.add(etqx6);
        etqx6.setBounds(10, 160, 20, 20);
        
        c.add(txtx1);
        txtx1.setBounds(40, 10, 80, 20);
        
        c.add(txtx2);
        txtx2.setBounds(40, 40, 80, 20);
        
        c.add(txtx3);
        txtx3.setBounds(40, 70, 80, 20);
        
        c.add(txtx4);
        txtx4.setBounds(40, 100, 80, 20);
        
        c.add(txtx5);
        txtx5.setBounds(40, 130, 80, 20);
        
        c.add(txtx6);
        txtx6.setBounds(40, 160, 80, 20);
        
        
        c.add(etqy1);
        etqy1.setBounds(220, 10, 20, 20);
        
        c.add(etqy2);
        etqy2.setBounds(220, 40, 80, 20);
        
        c.add(etqy3);
        etqy3.setBounds(220, 70, 80, 20);
        
        c.add(etqy4);
        etqy4.setBounds(220, 100, 80, 20);
        
        c.add(etqy5);
        etqy5.setBounds(220, 130, 80, 20);
        
        c.add(etqy6);
        etqy6.setBounds(220, 160, 80, 20);
        
        c.add(txty1);
        txty1.setBounds(250, 10, 80, 20);
        
        c.add(txty2);
        txty2.setBounds(250, 40, 80, 20);
        
        c.add(txty3);
        txty3.setBounds(250, 70, 80, 20);
        
        c.add(txty4);
        txty4.setBounds(250, 100, 80, 20);
        
        c.add(txty5);
        txty5.setBounds(250, 130, 80, 20);
        
        c.add(txty6);
        txty6.setBounds(250, 160, 80, 20);
        
        c.add(boton);
        boton.setBounds(430, 50, 100, 50);        
    }
    void mostrar (){
        setSize(600,600);
        setVisible(true);
    }
    void asignarOyente(Controlador c){
        boton.addActionListener(c);
    }
    
    
    
    
    
    
    
            
           
    
}
