/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheyllacortez_lab6p2;

/**
 *
 * @author DELL
 */
public class Jugadores {
    private String nombre = "";
    private int edad = 0;
    private String posicion = "";

    public Jugadores() {
    }
    
    public Jugadores(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad; 
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
