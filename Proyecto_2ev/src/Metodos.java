
import com.proyecto.preguntas.*;
import java.util.concurrent.ThreadLocalRandom;


public class Metodos {
    
    private static int vidas;
        
    // Arrays con las preguntas, respuesta y opciones
    Pregunta[] array_local_m = preguntas_m.crear_Array_preguntas_m();   
    Pregunta[] array_local_f = preguntas_f.crear_Array_preguntas_f();        
    Pregunta[] array_local_d = preguntas_d.crear_Array_preguntas_d();
    

    /** 
     * Método que genera un numero aleatorio del 0 al x
     * que no se repita.
    */ 
    /*
    public int numero_random(int x){
        
        int i = 0;
        
        do{
            
            int randomNum = ThreadLocalRandom.current().nextInt(0, x);
        
            if(randomNum z ){
            
                //d
            
            }else{
                
                //d
                    
            }
                
        }while(i<1);
        
        return randomNum; 
        
    }    
    */
    
    // Modo de juego principal 
    public void principal(Pregunta[] array_local_m, Pregunta[]array_local_f, Pregunta[] array_local_d){
        
        vidas = 3;
        
        int i = 0;
        
        // Preguntas medias
        while(i<5){
        
            //pregunta random 
            
            
            // Comprobacion de la pregunta
            // else
            // pregunta_f.random
            
            /*if fallo, pregunta facil, if fallas la facil otra facil*/
                       
            
        }
        
        // Pregunta final dificil
        
        // Pedir respuesta
        
        // Si es correcto tal
        // else ns
        
    }
    
    public void endless(Pregunta[] array_local_m, Pregunta[]array_local_f, Pregunta[] array_local_d){
        
        vidas = 10;
        
        
        
    }
        
    
}
