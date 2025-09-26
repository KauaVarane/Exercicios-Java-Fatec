/*
10.	Receba 2 números reais. Calcule e mostre a diferença desses valores
 */
import javax.swing.JOptionPane;
public class Lt01_ex10
{
    public static void main (String args [ ] )
     {
         double  n1, n2, diferença; 
         n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um Número : "));
         n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro Número : "));
         diferença = ( n1 - n2 );
        JOptionPane.showMessageDialog(null,"A Diferença dos valores é : " +diferença);
     }
}

