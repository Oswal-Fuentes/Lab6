/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oswalfuentes_lab6;

import java.util.ArrayList;

/**
 *
 * @author Oswal
 */
public class Lugar {

    protected String nombre, direccion;
    protected int seguridad;
    Carretera c_entrada; 
    Carretera c_salida;

    public Lugar() {
    }

    public Lugar(String nombre, String direccion, int seguridad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.seguridad = seguridad;
        this.c_salida = c_salida;
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

    public Carretera getC_entrada() {
        return c_entrada;
    }

    public void setC_entrada(Carretera c_entrada) {
        this.c_entrada = c_entrada;
    }

    public Carretera getC_salida() {
        return c_salida;
    }

    public void setC_salida(Carretera c_salida) {
        this.c_salida = c_salida;
    }

    @Override
    public String toString() {
        return "Lugar{" + "nombre=" + nombre + ", direccion=" + direccion + ", seguridad=" + seguridad + ", c_entradas=" + c_entrada + ", c_salida=" + c_salida + '}';
    }

    
    
}
