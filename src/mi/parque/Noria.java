/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mi.parque;
import java.util.*;

/**
 *
 * @author owner
 */
public class Noria extends Atraccion{
    // definición de variables miembro de la clase
    public boolean averiada;    //no accedere a averiada directamente
    public int velocidad,cola,contador_tiempo;
    public ArrayList vehiculos =new ArrayList();
    //solo puede haber 10 vehiculos
    
    public Noria(){
        velocidad=4;
        cola=30;        //Comienza con 30 personas en cola
        contador_tiempo=0;  //Al llegar a 2 se llamara a un tecnico por si acaso
        averiada=false; 
        Vehiculo c =new Vehiculo();
        int j;
        for( j=1; j <= 3; j++ ) {       //de 1 a 3
        vehiculos.add(c);
        }
    }
    
    public boolean tieneAveria(){
        // recorrer los coches e ir comprobando
        int j;
        boolean tiene_fallo = false;
        averiada = false;
        for( j=0; j<vehiculos.size(); j++){
            tiene_fallo =((Vehiculo)(vehiculos.get(j))).averia;
            if (tiene_fallo) {
                averiada=true;
            }
        }
        return averiada;
    }
    
}