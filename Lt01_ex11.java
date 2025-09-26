/*
11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class Lt01_ex11
{
    public static void main (String args [ ] )
    {
        double c, r;
        r = Double.parseDouble(JOptionPane.showInputDialog("Digite o Raio da Circuferência:"));
        c = ( 2 * 3.14 * r );
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null,"O Comprimento da Circuferência :" + df.format(c));
        
    }
}        
        
        
