/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication5;

import java.util.ArrayList;

/**
 *
 * @author Jorge Ramirez
 */
public class Pokemon {
    String especie;
    int vida;
    int ataque;
    int defensa;
    int experiencia;
    int experienciaNecesaria;
    int especial;
    int velocidad;
    String estado;

    public Pokemon(String especie, int vida, int ataque, int defensa, int experiencia, int experienciaNecesaria, int especial, int velocidad, String estado) {
        this.especie = especie;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.experiencia = experiencia;
        this.experienciaNecesaria = experienciaNecesaria;
        this.especial = especial;
        this.velocidad = velocidad;
        this.estado = estado;
    }
 
}
