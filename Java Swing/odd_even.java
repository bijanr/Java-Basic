import javax.swing.*;
import java.awt.event.*;
public class odd_even {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Odd Even Calculator");
        JButton button = new JButton("Enter");
        button.setBounds(050, 100, 95, 30);
        
        final JTextField textfield = new JTextField();
        textfield.setBounds(50, 50, 95, 30);
        JTextField textField2 = new JTextField();    
        textField2.setBounds(200, 50, 95, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                String Strval = textfield.getText();
                Double value = Double.parseDouble(Strval);
                boolean b = check(value);
                if(b == true)
                textField2.setText("Even Number");
                else
                textField2.setText("Odd number");
            }
        });


        frame.add(button);
        frame.add(textField2);
        frame.add(textfield);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private static boolean check(double value)
    {
        if(value % 2 ==0)
        return true;
        else
        return false;
    }
    
}
