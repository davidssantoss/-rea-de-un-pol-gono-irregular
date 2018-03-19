
package ejemplotexttoarray;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class DibujoPoligono extends JPanel{
    Modelo m;

    public DibujoPoligono() {
        this.setBackground(Color.BLACK);
        this.setBounds(0, 0, 400, 300);
    }
    
    
    
    @Override
    public void paint (Graphics g){
        super.paint(g);
        //convierte los arreglos double a int
        
        int[] x = new int[m.x.length];
        for (int i=0; i<x.length; i++)
            x[i] = (int) m.x[i];
        int[] y = new int[m.y.length];
        for (int j=0; j<y.length; j++)
            y[j] = (int) m.y[j];
        
        /*
        System.out.println("valor: "+ y[1]);*/
        Polygon poli = new Polygon (x,y,6);
        g.drawPolygon(poli);
        g.setColor(Color.RED);
        /*
        //g.drawLine(5, 5, 10, 10);
        //g.fillOval(10, 10, 25, 25);
        
        
        poli.addPoint(x[0],y[0]);
        poli.addPoint(x[1],y[1]);
        poli.addPoint(x[2],y[2]);
        poli.addPoint(x[3],y[3]);
        poli.addPoint(x[4],y[5]);
        poli.addPoint(x[5],y[5]);        
        g.fillPolygon(poli);
        */
    }
    
}
