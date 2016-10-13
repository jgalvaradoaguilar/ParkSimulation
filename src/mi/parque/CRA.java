/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mi.parque;
import java.util.*;
import java.io.Serializable;
/**
 *
 * @author owner
 */
public class CRA implements Serializable{
    // definición de variables miembro de la clase
    public ArrayList operarios =new ArrayList();
    //Puede haber 10 operarios como máximo
    
    public CRA(){       //por defecto comienza con 5 operarios
        Operario operario =new Operario();
        int j;
        for( j=1; j <= 5; j++ ) {       //de 1 a 5
        operarios.add(operario);
        }
    }
    
    public void busca_operario_noria(){
        for (int j=0; j<operarios.size(); j++){
            boolean operario_ocupado =((Operario)(operarios.get(j))).ocupado;
            if (!operario_ocupado){
                ((Operario)(operarios.get(j))).ocupado=true;
                ((Operario)(operarios.get(j))).ident_atraccion=1; //noria
                ((Operario)(operarios.get(j))).contador_averias_reparadas++;
            }           
        }
    } 
    
    public void busca_operario_montania(){
        for (int j=0; j<operarios.size(); j++){
            boolean operario_ocupado =((Operario)(operarios.get(j))).ocupado;
            if (!operario_ocupado){
                ((Operario)(operarios.get(j))).ocupado=true;
                ((Operario)(operarios.get(j))).ident_atraccion=2; //montania
                ((Operario)(operarios.get(j))).contador_averias_reparadas++;
            }           
        }
    }
    
    public void libera_operario_noria(){        //solo se libera uno en este metodo
        boolean liberado=false;
        for (int j=0; j<operarios.size() && !liberado; j++){
            boolean operario_ocupado =((Operario)(operarios.get(j))).ocupado;
            int ident_atraccion =((Operario)(operarios.get(j))).ident_atraccion;
            if (operario_ocupado && ident_atraccion==1){
                ((Operario)(operarios.get(j))).ocupado=false;
                ((Operario)(operarios.get(j))).ident_atraccion=0;
                liberado=true;
            }           
        }   
    }
    
    public void libera_operario_montania(){     //solo se libera uno en este método
        boolean liberado=false;
        for (int j=0; j<operarios.size() && !liberado; j++){
            boolean operario_ocupado =((Operario)(operarios.get(j))).ocupado;
            int ident_atraccion =((Operario)(operarios.get(j))).ident_atraccion;
            if (operario_ocupado && ident_atraccion==2){
                ((Operario)(operarios.get(j))).ocupado=false;
                ((Operario)(operarios.get(j))).ident_atraccion=0;
                liberado=true;
            }           
        }   
    }
    
}