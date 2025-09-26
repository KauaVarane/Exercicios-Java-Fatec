/*
42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99    
*/
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex42
{
    public static void main ( String args [ ] )
    {
        double res, i, j;
        res = ( 0 );
        for ( i=1 ; i <= 50 ; i++ )
        {
            j = ( ( i*2 )-1 );
            res = ( ( i / j ) + res );
        }
        JOptionPane.showMessageDialog(null,+res);
    }
}