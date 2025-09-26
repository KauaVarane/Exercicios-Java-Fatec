/*
  Serie 3 =  ( ( 1 / 1 ) + ( 1 / 2 ) + ( 1 / 3 ) + ... + ( 1 / N ) )
 */
import javax.swing.JOptionPane;
public class RecFunction_ex3
{
    public static void main ( String args [ ] )
    {
        double n , i ;
        i = ( 1 );
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        JOptionPane.showMessageDialog(null,"O Resultado será : "+fserie(n,i));
    }
    static double fserie ( double num , double ir )
    {
        if (ir == num)
        {
            return 1/ir ;
        }
        else
        {
           
            return ((1  / ir ) + fserie(num,ir + 1)) ;
        }
    }
}

