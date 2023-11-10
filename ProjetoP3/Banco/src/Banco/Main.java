package Banco;

import javax.swing.*;
import java.awt.*;



public class Main {
    public static void main(String[] args) {

        String[] array = {"Expoente da variavel", "Multiplicação da variavel",
                "Soma", "Exponte soma",
                "Multiplicação soma","Intervalo A", "Intervalo B", "Numero de Partições" };




        // Cria uma janela
        JFrame frame = new JFrame("Calculadora de Integrais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria um painel para os campos de entrada
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(8, 2)); // 8 linhas, 2 colunas

        // Adiciona os campos de entrada
        JTextField[] textFields = new JTextField[8];
        for (int i = 0; i < 8; i++) {
            JLabel label = new JLabel(array[i] + ":");
            textFields[i] = new JTextField(10);
            inputPanel.add(label);
            inputPanel.add(textFields[i]);
        }

        // Cria um botão para calcular a integral
        JButton calcularButton = new JButton("Calcular Integral");
        calcularButton.addActionListener(e -> {
            // Pega os valores dos campos de entrada e os armazena nas variáveis
            double expoenteVariavel = Double.parseDouble(textFields[0].getText());
            double multiplicacaoVariavel = Double.parseDouble(textFields[1].getText());
            double soma = Double.parseDouble(textFields[2].getText());
            double expoenteSoma = Double.parseDouble(textFields[3].getText());
            double multiplicacaoSoma = Double.parseDouble(textFields[4].getText());
            double intervaloA = Double.parseDouble(textFields[5].getText());
            double intervaloB = Double.parseDouble(textFields[6].getText());
            int numParticoes = Integer.parseInt(textFields[7].getText());

            // Chama a função para calcular a integral
            calcularIntegral(expoenteVariavel, multiplicacaoVariavel, soma, expoenteSoma, multiplicacaoSoma, intervaloA, intervaloB, numParticoes);
        });


        // Adiciona os componentes à janela
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(calcularButton, BorderLayout.SOUTH);

        // Exibe a janela
        frame.setVisible(true);
    }


    private static void calcularIntegral(double expoenteVariavel, double multiplicacaoVariavel,
                                         double soma, double expoenteSoma, double multiplicacaoSoma,double intervaloA,
                                         double intervaloB, int numParticoes) {

        double riemann = 0.0;

        double delta_x = (intervaloB - intervaloA) / numParticoes;

        for (int i = 0; i < numParticoes; i++) {

            double x_i = intervaloA + i * delta_x;

            riemann += calcularFx(x_i, expoenteVariavel, multiplicacaoVariavel, soma, expoenteSoma, multiplicacaoSoma);
        }

        riemann *= delta_x;

        // O valor da integral calculada é armazenado em 'resultado'
        System.out.println("O valor da integral definida é: " + riemann);
    }
    private static double calcularFx(double x, double expoenteVariavel, double multiplicacaoVariavel,
                                     double soma, double expoenteSoma, double multiplicacaoSoma) {

        double resultado = Math.pow(x, expoenteVariavel) * multiplicacaoVariavel + Math.pow(soma, expoenteSoma)*multiplicacaoSoma;

        resultado = Math.pow(resultado, expoenteSoma) ;
        return resultado;
    }

}  