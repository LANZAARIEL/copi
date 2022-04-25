package com.example.registrounivalle;

// Clases POJO
public class estudiante {
    private String nombre;
    private String apellido;
    private String email;
    private int celular;
    private int nota;

    public estudiante(String nombre,String apellido,String email,int celular,int nota){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.nota = nota;
        this.celular = celular;
    }


}
