/*
    41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
*/
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex41
{
    public static void main ( String args [ ] )
    {
        int dado1, dado2, i, j;
        for (i = 1, j = 6; i <= 6 && j >= 1; i++, j--) 
        {
            dado1 = ( i );
            dado2 = ( j );
            JOptionPane.showMessageDialog(null, "Dado1: " + dado1 + " | Dado2: " + dado2+ " = 7");
        }
    }
}