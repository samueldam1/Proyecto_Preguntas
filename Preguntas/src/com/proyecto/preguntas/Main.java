
package com.proyecto.preguntas;

public class Main {

    public static void main(String[] args) {
        
        preguntas_m obj = new preguntas_m();
        
        Pregunta[] array_local = obj.crear_Array_preguntas_m();
        /*
        System.out.print("[ ");
        for (int i = 9; i < array_local.length; i++) {
            System.out.println(array_local.getPregunta());
            System.out.println(array_local.getRespuesta()+ "\n");
        } 
        
        System.out.println("]");
        */
    }
    
}
