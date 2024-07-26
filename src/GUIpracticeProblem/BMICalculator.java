package src.GUIpracticeProblem;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {

    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("BMI Calculator");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Create components
        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(50, 50, 100, 30);
        frame.add(weightLabel);

        JTextField weightField = new JTextField();
        weightField.setBounds(150, 50, 150, 30);
        frame.add(weightField);

        JLabel heightLabel = new JLabel("Height (cm):");
        heightLabel.setBounds(50, 100, 100, 30);
        frame.add(heightLabel);

        JTextField heightField = new JTextField();
        heightField.setBounds(150, 100, 150, 30);
        frame.add(heightField);

        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.setBounds(100, 150, 150, 30);
        frame.add(calculateButton);

        JLabel resultLabel = new JLabel("BMI:");
        resultLabel.setBounds(50, 200, 300, 30);
        frame.add(resultLabel);

        // Add button click event
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText())/100; // Convert cm to m
                    double bmi = weight / (height * height);

                    // Determine the BMI category
                    String category;
                    if (bmi < 18.5) {
                        category = "Underweight";
                    } else if (bmi < 24.9) {
                        category = "Normal weight";
                    } else if (bmi < 29.9) {
                        category = "Overweight";
                    } else {
                        category = "Obesity";
                    }

                    resultLabel.setText(String.format("BMI:%.2f - %s", bmi, category));
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Please enter valid numbers.");
                }
            }
        });

        // Set frame visibility
        frame.setVisible(true);
    }
}

