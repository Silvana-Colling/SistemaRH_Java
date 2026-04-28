/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio56_versao_thiago;

/**
 *
 * @author SILVANACOLLING
 */
public abstract class Veiculo {
    private String modelo;
    
    public Veiculo(String modelo) {
        this.modelo = modelo;
    }
    
    public abstract double calcularAutonomia(double litros);
    
    public String getModelo(){
        return modelo;
    }
    
}
