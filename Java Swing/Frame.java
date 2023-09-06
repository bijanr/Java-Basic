import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Frame {
    public static void main(String[] args) {
        
        
        JLabel label = new JLabel();    //creates a new label object from jLabel class
        label.setText("Literally me");    //sets the text  
        
        ImageIcon nImageIcon1 = new ImageIcon("thorfinn.jpg");   //create an image icon
        label.setIcon(nImageIcon1);
        label.setForeground(new Color(0xffffff));
        label.setHorizontalTextPosition(JLabel.CENTER); //sets the horizontal text 
        label.setVerticalTextPosition(JLabel.TOP);      //sets the vertical text
        label.setHorizontalAlignment(JLabel.CENTER);    //set font color of text
        label.setFont(new Font("Arial", Font.BOLD, 15));   //set font of text
        label.setIconTextGap(5);    //set gap between text and image
        label.setBackground(new Color(0x3B3B3B));
        label.setOpaque(true);



        JFrame frame = new JFrame();
        frame.setTitle("DHARAMPAL");    
        frame.setSize(420, 420);  //sets the x and y dimension 
        //frame.setResizable(false);
        ImageIcon nImageIcon = new ImageIcon("thorfinn.jpg");   //create an image icon
        frame.setIconImage(nImageIcon.getImage());          //change the icon of frame
        //frame.getContentPane().setBackground(new Color(0x3B3B3B));      //sets background colour
        frame.add(label);               //adds label to the frame
        frame.setVisible(true);   //makes frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exits on close also "DO_NOTHING_ON_CLOSE" and "HIDE_ON_CLOSE"
        
    
}
}
