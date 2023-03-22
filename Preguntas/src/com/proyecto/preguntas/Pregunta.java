
package com.proyecto.preguntas;

public class Pregunta {
       
    private final String pregunta;
    private final String respuesta;
    private final String opcionA;
    private final String opcionB;
    private final String opcionC;
    private final String opcionD;

    public Pregunta(String pregunta, String respuesta, String opcionA, String opcionB, String opcionC, String opcionD) {
        this.pregunta = pregunta;
        this.respuesta = respuesta;
        this.opcionA = opcionA;
        this.opcionB = opcionB;
        this.opcionC = opcionC;
        this.opcionD = opcionD;
    }

    @Override
    public String toString() {
        
        return pregunta + "\nA) " + opcionA + "\nB) " + opcionB + "\nC) " + opcionC + "\nD) " + opcionD + "\n";
    
    }
    
    
}
