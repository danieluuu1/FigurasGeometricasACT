import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora de Áreas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));

        JLabel labelFigura = new JLabel("Seleccione la figura:");
        JComboBox<String> comboFiguras = new JComboBox<>(new String[] {"Rectángulo", "Triángulo", "Círculo"});
        
        JLabel label1 = new JLabel("Valor 1:");
        JTextField textField1 = new JTextField();
        
        JLabel label2 = new JLabel("Valor 2:");
        JTextField textField2 = new JTextField();
        
        JButton buttonCalcular = new JButton("Calcular Área");
        JLabel labelResultado = new JLabel("Área:");

        panel.add(labelFigura);
        panel.add(comboFiguras);
        panel.add(label1);
        panel.add(textField1);
        panel.add(label2);
        panel.add(textField2);
        panel.add(buttonCalcular);
        panel.add(labelResultado);

        frame.add(panel);
        frame.setVisible(true);

        comboFiguras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboFiguras.getSelectedItem().equals("Círculo")) {
                    label1.setText("Radio:");
                    label2.setVisible(false);
                    textField2.setVisible(false);
                } else if (comboFiguras.getSelectedItem().equals("Rectángulo")) {
                    label1.setText("Ancho:");
                    label2.setText("Alto:");
                    label2.setVisible(true);
                    textField2.setVisible(true);
                } else if (comboFiguras.getSelectedItem().equals("Triángulo")) {
                    label1.setText("Base:");
                    label2.setText("Altura:");
                    label2.setVisible(true);
                    textField2.setVisible(true);
                }
            }
        });

        buttonCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor1 = Double.parseDouble(textField1.getText());
                    FiguraGeometrica figura = null;

                    if (comboFiguras.getSelectedItem().equals("Círculo")) {
                        figura = new Circulo(valor1);
                    } else {
                        double valor2 = Double.parseDouble(textField2.getText());
                        if (comboFiguras.getSelectedItem().equals("Rectángulo")) {
                            figura = new Rectangulo(valor1, valor2);
                        } else if (comboFiguras.getSelectedItem().equals("Triángulo")) {
                            figura = new Triangulo(valor1, valor2);
                        }
                    }

                    if (figura != null) {
                        double area = figura.calcularArea();
                        labelResultado.setText("Área: " + area);
                        JOptionPane.showMessageDialog(frame, figura.toString());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}

