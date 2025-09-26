/*
   36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex36
{
    public static void main (String args [ ] )
    {
        double n, n2, i, r, res ;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
        i = ( 1 );
        res = ( 0 );
        n2 = ( 1 );
        r = ( 1 );
        while (i <= n && r <= n)
        {
            n2 = ( i * n2 );
            res=( ( r / n2 ) + res );
            JOptionPane.showMessageDialog(null, res);
            i = ( i + 1 );
            r = ( r + 1 );
        }
    }
}
    