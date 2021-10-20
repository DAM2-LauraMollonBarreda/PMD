package com.lauramb.practica6_quizzes;

public class Pregunta {
    private int numero;
    private String pregunta;
    private String[] respuesta = new String[3];
    private int respuestaCorrecta;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public int getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(int respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }



    public Pregunta(int numero, String pregunta, String rb1, String rb2, String rb3, int respuestaCorrecta) {
        this.numero = numero;
        this.respuesta [0] = rb1;
        this.respuesta [1] = rb2;
        this.respuesta[2] = rb3;
        this.respuesta = respuesta;
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
