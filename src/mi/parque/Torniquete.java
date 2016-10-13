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
public class Torniquete implements Serializable {
    public String semaforo;
    public int personas_dentro;
    
    public Torniquete(){
        semaforo="verde";
        personas_dentro=0;
    }
    
    public String ver_semaforo(){
        return semaforo;
    }
    
    public int personas_dentro(){
        return personas_dentro;
    }

}
