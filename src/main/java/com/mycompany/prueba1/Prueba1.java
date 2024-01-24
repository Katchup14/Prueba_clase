

package com.mycompany.prueba1;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prueba1 {

    public static void main(String[] args) {
        System.out.println("PEPE PECA PICA PAPAS");
        JFrame frame = new JFrame("Calculadora Simple");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);
        JButton sumButton = new JButton("Sumar");
        JLabel resultLabel = new JLabel("Resultado: ");

        sumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(num1Field.getText());
                    double num2 = Double.parseDouble(num2Field.getText());
                    double resultado = num1 + num2;
                    resultLabel.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Error: Ingresa números válidos");
                }
            }
        });

        panel.add(num1Field);
        panel.add(num2Field);
        panel.add(sumButton);
        panel.add(resultLabel);

        frame.add(panel);
        frame.setVisible(true);
        
    }
}
