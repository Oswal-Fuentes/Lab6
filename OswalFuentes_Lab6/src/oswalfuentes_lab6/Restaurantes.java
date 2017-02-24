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
public class Restaurantes extends Lugar {

    private String categoria;
    int calificacion;

    public Restaurantes() {
        super();
    }

    public Restaurantes(String categoria, int calificacion, String nombre, String direccion, int seguridad) {
        super(nombre, direccion, seguridad);
        this.categoria = categoria;
        this.calificacion = calificacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
