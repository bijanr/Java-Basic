import java.awt.Font;

import javax.swing.*;

public class textintro{
    public static void main(String[] args) {
        JFrame jf=new JFrame("Name PRinter");
        final JLabel jl=new JLabel("Bijan Roy",JLabel.CENTER);
        jf.setBounds(600, 200, 100, 50);
        jl.setFont(new Font("Lemon Milk",Font.BOLD,15));
        jf.add(jl);
        jl.setSize(100, 100);
        jf.setSize(400, 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);

    }


}