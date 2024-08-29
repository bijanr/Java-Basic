import javax.swing.*;
import java.awt.event.*;
public class message {
    public static void main(String[] args) {
        JFrame frame  = new JFrame();
        frame.setTitle("HEllo everynyan");
        JButton button = new JButton("Click ");
        button.setBounds(50,100,95,30); 
        final JTextField textField = new JTextField();
        textField.setBounds(50, 50, 95, 30);
        final JTextField textField1 = new JTextField();
        textField1.setBounds(200, 50, 95, 30);
        textField1.setEditable(false);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String value = textField.getText();
                double x = Double.parseDouble(value);
                textField1.setText(String.valueOf(x));
            }
        });

        frame.add(button);
        frame.add(textField);
        frame.add(textField1);
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }
    
}
