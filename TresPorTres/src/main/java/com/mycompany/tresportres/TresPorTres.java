/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tresportres;

import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class TresPorTres {

    public static void main(String[] args) {
        int[][] Matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a linha " + i + " e coluna " + j + ":"));
            }
        }

        String controle = JOptionPane.showInputDialog("""
                                                      A - Calcule e mostre a soma dos elementos da primeira coluna;
                                                      B - Calcule e mostre a soma dos elementos de cada coluna;
                                                      C - Calcule e mostre o produto dos elementos da primeira linha;
                                                      D - Calcule e mostre a soma de todos os elementos da matriz;
                                                      E - Calcule e mostre a média dos elementos da matriz;
                                                      F - Calcule e mostre os elementos que são maiores que a média;
                                                      G - Calcule e mostre o maior elemento da matriz e sua posição;
                                                      H - Calcule e mostre o menor elemento da matriz e sua posição;
                                                      I - Calcule e mostre a soma dos elementos da diagonal principal da matriz;
                                                      J - Calcule e mostre a soma dos elementos da diagonal secundária da matriz;
                                                      """);
        char controlCHAR = controle.charAt(0);

        switch (controlCHAR) {
            case 'a': {
                int soma = 0;
                for (int i = 0; i < 3; i++) {
                    soma += Matriz[i][0];
                }
                JOptionPane.showMessageDialog(null, "A soma da primeira coluna é: " + soma);
                break;
            }
            case 'b': {
                int soma0 = 0;
                int soma1 = 0;
                int soma2 = 0;
                for (int i = 0; i < 3; i++) {
                    soma0 += Matriz[i][0];
                    soma1 += Matriz[i][1];
                    soma2 += Matriz[i][2];
                }
                JOptionPane.showMessageDialog(null, "A soma da coluna 1 é: " + soma0 + "\nA soma da coluna 2 é: " + soma1 + "\nA soma da coluna 3 é: " + soma2);
                break;
            }
            case 'c': {
                int produto = 1;
                for (int i = 0; i < 3; i++) {
                    produto = produto * Matriz[0][i];
                }
                JOptionPane.showMessageDialog(null, "Resultado do produto da primeira linha: " + produto);
                break;
            }
            case 'd': {
                int soma = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        soma += Matriz[i][j];
                    }
                }
                JOptionPane.showMessageDialog(null, "Soma de todos os números da matriz: " + soma);
                break;
            }
            case 'e': {
                int soma = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        soma += Matriz[i][j];
                    }
                }
                JOptionPane.showMessageDialog(null, "Média de todos os números da matriz: " + soma / 9);
                break;
            }
            case 'f': {
                int soma = 0;
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        soma += Matriz[i][j];
                    }
                }
                int media = soma / 9;
                String texto = "";
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if(Matriz[i][j] > media){
                            texto += " | " + Matriz[i][j] + " | "; 
                        }
                    }
                }
                JOptionPane.showMessageDialog(null,texto);
            }

        }
    }
}
