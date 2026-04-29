/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atleta;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Atleta {

    public static void main(String[] args) {
        
        int matriz [][] = new int [3][2];
        
        for(int i = 0; i < 3; i++){
        matriz[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do atleta: "));
        matriz[i][1] = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do atleta: "));
        }
        
        int numero = matriz[0][0];
        int altura = matriz[0][1];
        
        for(int i = 1; i<3; i++){
            if(altura <= matriz [i][1]){
                numero = matriz[i][0];
                altura = matriz[i][1];
            }
        }
        JOptionPane.showMessageDialog(null,"O maior atleta é o número: " + numero + " e sua altura é: " + altura);
        
        double soma = 0;
        for(int i = 0; i < 3; i++){
            soma += matriz[i][1];
        }
        JOptionPane.showMessageDialog(null, "A média das alturas dos atletas são: " + (soma/3));
        
        int contador = 0;
        for(int i = 0; i < 3; i++){
            if(matriz[i][1] > 178){
                contador ++;
            }
        }
        JOptionPane.showMessageDialog(null, "A quantidade de alunos com mais de 178cm são: "  + contador);
    }
}
