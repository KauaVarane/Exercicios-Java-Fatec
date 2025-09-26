/*
19.	Receba 2 valores reais. Calcule e mostre o maior deles.
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec_ex19 
{
    public static void main (String args [ ] )
    {
        double n1, n2, maior, menor;
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número :"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número :"));
        if ( n1 > n2 )
        {
            maior = ( n1 );
            menor = ( n2 ); 
        }
        else 
        {
            maior = ( n2 );
            menor = ( n1 );
        }
    }
}
