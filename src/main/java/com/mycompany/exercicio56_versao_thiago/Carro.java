/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio56_versao_thiago;

/**
 *
 * @author THIAGOARTURSILVADARO
 */
class Carro extends Veiculo {
    public Carro(String modelo) {
        super(modelo);
    }
    @Override
    public double calcularAutonomia(double litros){
        return litros * 12;
    }
    
}