/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio56_versao_thiago;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author SILVANACOLLING
 */
public class exercicio56_versao_thiago {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ArrayList<Veiculo> comboio = new ArrayList<>();
        
        System.out.print("Quantos veiculos pretende cadastrar? ");
        String quantidade = leitor.nextInt();
        leitor.nextLine();
        
        for (int i = 0; i < quantidade; i++ ){
            System.out.println("--- Cadastro do Veiculo " +  (i + 1) + "---");
            System.out.print("Modelo: ");
            String modelo = leitor.nextLine();
            
            System.out.print("Tipo [1-Carro | 2-Caminao]:  ");
            int tipo = leitor.nextInt();
            leitor.nextLine();
            
            if (tipo == 1){
                comboio.add(new Carro(modelo));
            }else if (tipo == 2){
                comboio.add(new Caminhao(modelo));
            }else {
                System.out.println("Opção Invalida, pule o cadastro: ");
            }
        }
        
        System.out.print("Digite a quantidade de combustivel: ");
        double litrosTeste = leitor.nextDouble();
        
        System.out.print("----RELATORIO GERAL----: ");
        for (Veiculo v : comboio) {
            double autonomia = v.calcularAutonomia(litrosTeste);
            System.out.printf("Modelo: %s | Com % 1fL percorreria: %.2f km ", v.getModelo(), litrosTeste, autonomia);
            
        }
        leitor.close();
    }
}