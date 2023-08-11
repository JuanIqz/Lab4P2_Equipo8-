/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

/**
 *
 * @author Jorge Ramirez
 */
public class MEspecial extends Movimiento {
    int ppoder;
    int ppresicion;

    public MEspecial() {
        super();
    }
    
    
    public MEspecial(int ppoder, int ppresicion) {
        this.ppoder = ppoder;
        this.ppresicion = ppresicion;
    }

    public int getPpoder() {
        return ppoder;
    }

    public void setPpoder(int ppoder) {
        this.ppoder = ppoder;
    }

    public int getPpresicion() {
        return ppresicion;
    }

    public void setPpresicion(int ppresicion) {
        this.ppresicion = ppresicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "MEspecial{" + "ppoder=" + ppoder + ", ppresicion=" + ppresicion + '}';
    }
    
    
}
