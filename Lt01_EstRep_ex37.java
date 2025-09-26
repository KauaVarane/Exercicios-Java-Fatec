/*
   37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex37
{
    public static void main (String args [ ] )
    {
        int res, n1, i;
        res = ( 1 );
        n1 = ( 1 );
        while ( res <= 21 ) 
        {
            i=(res);
            res=(n1+res);
            System.out.println( res );
            n1=(i);
        } 
    }
}
    