/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mi.parque;
import java.io.Serializable;
/**
 *
 * @author owner
 */
public class Vehiculo implements Serializable{
    //variables miembro de la clase
    public boolean averia;
    
    public Vehiculo(){
        averia = false;
    }
    
    public void inducirAveria(){
        averia = true;
    }
    
    public void repararAveria(){
        averia = false;
    }
}