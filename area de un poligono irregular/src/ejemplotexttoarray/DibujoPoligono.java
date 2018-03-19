
package ejemplotexttoarray;

import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author david
 */
public class DibujoPoligono {
    Modelo m;
    
    
    public void paintComponent (Graphics g){
        int[] x = new int[m.x.length];
        for (int i=0; i<x.length; i++)
            x[i] = (int) m.x[i];
        int[] y = new int[m.y.length];
        for (int j=0; j<y.length; j++)
            y[j] = (int) m.y[j];
        
        //super.paintComponent(g);
        Polygon poli = new Polygon ();
        poli.addPoint(x[0],y[0]);
        poli.addPoint(x[1],y[1]);
        poli.addPoint(x[2],y[2]);
        poli.addPoint(x[3],y[3]);
        poli.addPoint(x[4],y[5]);
        poli.addPoint(x[5],y[5]);
        poli.addPoint(x[6],y[6]);
        g.fillPolygon(poli);
        
    }
    
}
