
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
    Controlador c;

    public DibujoPoligono(Controlador c) {
        this.setBackground(Color.lightGray);
        this.setBounds(500, 220, 600, 600);
        this.c=c;
        
    }
    @Override
    public void paint (Graphics g){
        super.paint(g);
        //convierte los arreglos double a int
        
        int[] x = new int[c.m.x.length];
        for (int i=0; i<x.length; i++)
            x[i] = (int) c.m.x[i];
        int[] y = new int[c.m.y.length];
        for (int j=0; j<y.length; j++)
            y[j] = (int) c.m.y[j];
        System.out.println("valor "+ y[5]);
        
        Polygon poli = new Polygon ();
        //g.drawPolygon(poli);
        //*/
        
        g.setColor(Color.RED);
        /*
        g.drawLine(5, 5, 10, 10);
        g.fillOval(10, 10, 25, 25);
        */
        
        poli.addPoint(x[0],y[0]);
        poli.addPoint(x[1],y[1]);
        poli.addPoint(x[2],y[2]);
        poli.addPoint(x[3],y[3]);
        poli.addPoint(x[4],y[4]);
        poli.addPoint(x[5],y[5]);        
        g.drawPolygon(poli);
        //g.fillPolygon(poli);
        
        
        
        //g.fillPolygon(x, y, 6);
        
    }
    
}
