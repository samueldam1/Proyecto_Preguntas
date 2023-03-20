
package com.proyecto.preguntas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class preguntas_m {
    
    public static Pregunta[] crear_Array_preguntas_m(){
        
        // Rango de 0 a 9
        int i = 10;
                
        Pregunta []preguntas_m = new Pregunta [i];
          
        File fichero = new File("");
            
        Scanner scnr = null;
        
        try {
            
            scnr = new Scanner(fichero);
            
            while (scnr.hasNextLine()) {   
                
                String linea = scnr.nextLine();
                
                // array temporal
                String[] campos = linea.split(",");
                
                String pregunta = campos[0];
                String respuesta = campos[1];
                
                Pregunta x = new Pregunta(pregunta, respuesta);
                preguntas_m[0] = x;
                
                
            }
            
        } catch (FileNotFoundException e) {
            
            System.out.println("El fichero no se ha encontrado");
            
        } finally {
            
            //scnr.close();
            
        }  
        
        preguntas_m[0] = new Pregunta("YOW","YOW");
        
        return preguntas_m;        
    
    }
    
    
}
