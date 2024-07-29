package src.GUIpracticeProblem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class currencyConverter {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Currency Converter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        JLabel USD = new JLabel("Amount in USD");
        USD.setBounds(50, 50, 100, 30);
        frame.add(USD);

        JTextField usdField = new JTextField();
        usdField.setBounds(150, 50, 150, 30);
        frame.add(usdField);

        JLabel INR = new JLabel("Amount in INR");
        INR.setBounds(50, 100, 100, 30);
        frame.add(INR);

        JTextField inrField = new JTextField();
        inrField.setBounds(150, 100, 150, 30);
        frame.add(inrField);

        JButton calculateButton = new JButton("Convert");
        calculateButton.setBounds(100, 150, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel1 = new JLabel(" ");
        resultLabel1.setBounds(50, 200, 300, 30);
        frame.add(resultLabel1);

        JLabel resultLabel2 = new JLabel(" ");
        resultLabel2.setBounds(50, 220, 300, 30);
        frame.add(resultLabel2);


        // Add button click event
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inr = Double.parseDouble(inrField.getText());
                    double usd = Double.parseDouble(usdField.getText());

                    if (inr!= 0.0) {

                        resultLabel1.setText("Amount in INR "+String.format("%.2f",usd*83.73));
                    }
                    if (usd != 0.0) {

                        resultLabel2.setText("Amount in USD "+String.format("%.2f",inr*0.012));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Please enter valid numbers", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

