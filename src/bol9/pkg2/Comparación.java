
package bol9.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Comparación {
     public void calcular() {
        int calS=0;
        double calP=1;
        
        for (int i = 10; i < 90; i++) {
            calS = i + calS; 
            calP = i * calP;
        }
        JOptionPane.showMessageDialog(null,"Suma= "+calS);
        JOptionPane.showMessageDialog(null,"Producto= "+calP);        
    }
    
}
