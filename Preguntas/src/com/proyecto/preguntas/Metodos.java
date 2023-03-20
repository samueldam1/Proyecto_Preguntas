
package com.proyecto.preguntas;

import java.util.concurrent.ThreadLocalRandom;


public class Metodos {
    
    // Método que genera un numero aleatorio del 0 al 9
    public int numero_random(){
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, 10);
        
        return randomNum; 
        
    }
    
}
