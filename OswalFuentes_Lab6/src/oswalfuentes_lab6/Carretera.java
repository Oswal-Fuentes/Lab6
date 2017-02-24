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
public class Carretera {
    
    private int numero,distancia;
    private Lugar lugar_inicio,lugar_final;

    public Carretera() {
    }

    public Carretera(int numero, int distancia, Lugar lugar_inicio, Lugar lugar_final) {
        this.numero = numero;
        this.distancia = distancia;
        this.lugar_inicio = lugar_inicio;
        this.lugar_final = lugar_final;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugar getLugar_inicio() {
        return lugar_inicio;
    }

    public void setLugar_inicio(Lugar lugar_inicio) {
        this.lugar_inicio = lugar_inicio;
    }

    public Lugar getLugar_final() {
        return lugar_final;
    }

    public void setLugar_final(Lugar lugar_final) {
        this.lugar_final = lugar_final;
    }

    @Override
    public String toString() {
        return "Carretera{" + "numero=" + numero + ", distancia=" + distancia + ", lugar_inicio=" + lugar_inicio + ", lugar_final=" + lugar_final + '}';
    }
}
