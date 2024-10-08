/*import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Calculator implements ActionListener {
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];

    JButton divButton, mulButton, addButton, subButton;
    JButton decButton, equalsButton, delButton, clrButton;

    JPanel panel;

    Font myFont = new Font("Ink Freee",Font.BOLD, 30);
    double num1 = 0,num2 = 0, result = 0;
    char operation;
    Calculator()
    {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);


        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equalsButton = new JButton("=");
        clrButton = new JButton("CLR");
        delButton = new JButton("DEL");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equalsButton;
        functionButtons[6] = clrButton;
        functionButtons[7] = decButton;

        for(int i = 0; i<8; i++){
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(true);
        }

        for(int i=0; i<10; i++)
        {
            numberButtons[i] = new JButton(String.valueOf(i)); 
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(true);

        }

        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);



        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textfield);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
}
*/