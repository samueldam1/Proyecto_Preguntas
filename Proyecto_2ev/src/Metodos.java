
import com.proyecto.preguntas.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Metodos {
    
    private final Scanner scnr = new Scanner(System.in);
    
    private final ArrayList<Integer>Usados = new ArrayList<>();
    
    // Arrays con las preguntas, respuesta y opciones
    private final Pregunta[] array_local_m = preguntas_m.crear_Array_preguntas_m();   
    private final Pregunta[] array_local_f = preguntas_f.crear_Array_preguntas_f();        
    private final Pregunta[] array_local_d = preguntas_d.crear_Array_preguntas_d();
    
    private static int vidas;
    
    private static int randomNum;
    
    private static String respuesta = null;
    
    /**
     * Método que genera un numero aleatorio del 0 al x
     * que no se repita.
    */
    
    public void test(){
    
        System.out.println("");
    
    }
    
    
    public int numero_random(int x){
        
        int num;
        
        int y;
        
        do{
            
            y = 1;
            
            // Numero aleatorio entre 0 y x
            num = ThreadLocalRandom.current().nextInt(0, x);
                        
            for(Integer i: Usados){
                if (i == num) {
                    y = 0;
                }
            }
            
        }while(y<1);
        
        // Añadirlo al ArrayList de numeros que ya se han usado
        Usados.add(num);
        
        return num;
        
    }
    
    // Modo de juego principal 
    public void principal(){
        System.out.println("INICIAMOS");
        vidas = 3;
        
        int i = 0;
        
        int rondas = 3;
        
        // Preguntas medias
        while(i<rondas){
            System.out.println("EMPIEZA EL BUCLE");
            i++;
            
            // Conseguir numero random.
            int x = numero_random(rondas);
            
            {
            // TEMPORAL
            // Mostrar pregunta random por pantalla
            System.out.println("VIDAS RESTANTES: [" + vidas + "]");
            System.out.println("PREGUNTA MEDIA");
            System.out.println(array_local_m[x].toString());
            // Pedir respuesta
            respuesta = scnr.nextLine();
            // TEMPORAL
            }
            
            if (array_local_m[x].getRespuesta().equals(respuesta)){
                System.out.println("CORRECTO");
            }else{
                System.out.println("INCORRECTO");
                
                vidas--;
                
                // Bucle infinito
                while(true){
                    
                    if (vidas==0){
                        System.out.println("GAME OVER");
                        return;
                    }
                    
                    System.out.println("VIDAS RESTANTES: [" + vidas + "]");
                    
                    {
                    // TEMPORAL
                    // Mostrar pregunta random por pantalla
                    System.out.println("PREGUNTA FACIL");    
                    System.out.println(array_local_f[x].toString());            
                    // Pedir respuesta
                    respuesta = scnr.nextLine();
                    // TEMPORAL
                    }
                    
                    if (array_local_f[x].getRespuesta().equals(respuesta)){
                        System.out.println("CORRECTO");
                        i++;
                        break;
                    }else {
                        System.out.println("INCORRECTO");
                        
                        vidas--;
                    }
                }            
            }            
        }
        
        System.out.println("PREGUNTA FINAL SI LA FALLAS PIERDES\n");
        
        // Pregunta final
        int d = ThreadLocalRandom.current().nextInt(0, 1);
        System.out.println(array_local_d[d]);
        
        {
        // TEMPORAL
        // Mostrar pregunta random por pantalla
        System.out.println(array_local_d[d].toString());
            
        // Pedir respuesta
        respuesta = scnr.nextLine();
        // TEMPORAL
        }        
        
        if (array_local_d[d].getRespuesta().equals(respuesta)){
            System.out.println("GANASTE");
        }else {
            System.out.println("PERDISTE");
        }
        
        
        
    }
    
    // Modo de juego sin fin
    public void endless(Pregunta[] array_local_m, Pregunta[]array_local_f, Pregunta[] array_local_d){
        
        vidas = 10;
        
    }    
    
}
