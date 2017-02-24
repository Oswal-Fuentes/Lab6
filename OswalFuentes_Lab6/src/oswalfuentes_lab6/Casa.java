/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

/**
 *
 * @author Oswal
 */
public class Casa extends Lugar {

    public Casa() {
        super();
    }

    public Casa(String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getSeguridad() {
        return seguridad;
    }

    public void setSeguridad(int seguridad) {
        this.seguridad = seguridad;
    }

    @Override
    public String toString() {
        return "Casa{" + '}';
    }

    
    
}
