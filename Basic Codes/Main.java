
import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double perp=Double.parseDouble(JOptionPane.showInputDialog("Enter The Perpendicular"));

        double base=Double.parseDouble(JOptionPane.showInputDialog("Enter The Base"));
        double hypo=Math.sqrt((Math.pow(perp,2))+(Math.pow(base,2)));
        JOptionPane.showMessageDialog(null,"The hypotenuse is "+hypo);
    }
}
