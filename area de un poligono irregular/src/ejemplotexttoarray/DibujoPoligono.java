
package ejemplotexttoarray;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JComponent;

/**
 *
 * @author david
 */
public class DibujoPoligono extends JComponent{
    Modelo m;

    public DibujoPoligono() {
        
    }
    
    
    
    @Override
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        //convierte los arreglos double a int
        int[] x = new int[m.x.length];
        for (int i=0; i<x.length; i++)
            x[i] = (int) m.x[i];
        int[] y = new int[m.y.length];
        for (int j=0; j<y.length; j++)
            y[j] = (int) m.y[j];
        
        
        Polygon poli = new Polygon (x,y,6);
            g.drawPolygon(poli);
        /*
        poli.addPoint(x[0],y[0]);
        poli.addPoint(x[1],y[1]);
        poli.addPoint(x[2],y[2]);
        poli.addPoint(x[3],y[3]);
        poli.addPoint(x[4],y[5]);
        poli.addPoint(x[5],y[5]);
        poli.addPoint(x[6],y[6]);
        g.fillPolygon(poli);
        */
    }
    
}
