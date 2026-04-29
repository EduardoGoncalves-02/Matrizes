/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.computador;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Adri
 */
public class Computador {

    public static void main(String[] args) {
        String computador[][] = new String[5][2];

        for (int i = 0; i < 5; i++) {
            computador[i][0] = JOptionPane.showInputDialog("Informe o computador: ");
            computador[i][1] = JOptionPane.showInputDialog("Informe o preço: ");
        }

        double imposto = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual do imposto?"));
        double comissao = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de comissão?"));
        double revenda = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual de lucro de revenda?"));
        String desconto = JOptionPane.showInputDialog("Gostaria de adicionar desconto percentual? S - para Sim | N - para não");
        char descontoCHAR = desconto.charAt(0);

        switch (descontoCHAR) {
            case 's':
                Double descontoPercentual = Double.parseDouble(JOptionPane.showInputDialog("Qual o percentual do desconto? "));
                for (int i = 0; i < 5; i++) {
                    double preco = Double.parseDouble(computador[i][1]);
                    double precoImposto = preco * imposto / 100;
                    double precoComissao = preco * comissao / 100;
                    double precoRevenda = preco * revenda / 100;
                    double precoDesconto = preco * descontoPercentual / 100;
                    DecimalFormat aproximador = new DecimalFormat(" 0.00 ");
                    JOptionPane.showMessageDialog(null, "O preço final do computador " + computador[i][0] + " é de: R$" + aproximador.format(preco + precoImposto + precoComissao + precoRevenda - precoDesconto));
                }
                break;
            case 'n':
               for (int i = 0; i < 5; i++) {
                    double preco = Double.parseDouble(computador[i][1]);
                    double precoImposto = preco * imposto / 100;
                    double precoComissao = preco * comissao / 100;
                    double precoRevenda = preco * revenda / 100;
                    DecimalFormat aproximador = new DecimalFormat(" 0.00 ");
                    JOptionPane.showMessageDialog(null, "O preço final do computador " + computador[i][0] + " é de: R$" + aproximador.format(preco + precoImposto + precoComissao + precoRevenda));
                } 
        }

    }
}
