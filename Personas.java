/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exportarexcel2;

/**
 *
 * @author MARTHA
 */
public class Personas {
    private String seccion,nombre,precio,direccion;

    public Personas(String seccion,String nombre,String precio, String direccion) {
        this.seccion = seccion;
        this.nombre = nombre;
        this.precio = precio;
        this.direccion = direccion;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String toString(){
        
        return this.seccion;
        
    }
   
}
