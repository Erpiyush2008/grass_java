import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Swing Complete Example");

        frame.setSize(400, 300);

     
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Your Name:");
        JTextField textField = new JTextField(15);
        JButton button = new JButton("Click Me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = textField.getText();
                JOptionPane.showMessageDialog(frame,
                        "Hello " + name + " 😊");
            }
        });

        frame.add(label);
        frame.add(textField);
        frame.add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
    }
}