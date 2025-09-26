/*
    45.	Calcule e mostre a série 1 + 2/4 + 3/9 + 4/16 + 5/25 + ... + 15/225
*/
import javax.swing.JOptionPane ;
public class Lt01_EstRep_ex45
{
    public static void main ( String args [ ] )
    {
        double i, j, res;
        res = ( 0 );
        for ( i = 1 ; i <= 15 ; i++ )
        {
            j = ( i*i );
            res = ( ( i / j ) + res);
        }
        JOptionPane.showMessageDialog(null,"O Resultado da série é : "+res);
    } 
}