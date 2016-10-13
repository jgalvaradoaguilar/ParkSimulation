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
public class Operario implements Serializable{
    //defino las variables miembro
    //String Nombre
    boolean ocupado;
    int ident_atraccion;
    int contador_averias_reparadas;

    //defino constructor
    public Operario(){
        ocupado=false;
        ident_atraccion=0;
        contador_averias_reparadas=0;
    }
}
