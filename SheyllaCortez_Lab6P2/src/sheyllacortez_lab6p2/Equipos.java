/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sheyllacortez_lab6p2;

/**
 *
 * @author DELL
 */
public class Equipos {
    private String nombre = "";
    private String pais = "";
    private String ciudad = "";
    private String estadio = "";

    public Equipos() {
    }

    public Equipos(String nombre, String pais, String ciudad, String estadio) {
        this.nombre = nombre; 
        this.pais = pais;
        this.ciudad = ciudad; 
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", pais=" + pais + ", ciudad=" + ciudad + ", estadio=" + estadio + '}';
    }
    
    

}
