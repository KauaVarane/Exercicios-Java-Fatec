/*
9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 */
import javax.swing.JOptionPane;
public class Lt01_ex09 
{
    public static void main (String args [ ] )
     {
         int  n1, n2, resultado; 
         n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número : ")); 
         n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro Número : ")); 
         resultado = ( ( n1 * n1 ) + ( n2 * n2 ) );
        JOptionPane.showMessageDialog(null,"A soma dos quadrados é : " +resultado);
     }
}

