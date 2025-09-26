/*
    Serie 5 =  (N)!+(N-1)!+(N-2)!+...+(1)!
*/
import javax.swing.JOptionPane;
public class RecFunction_ex5
{
    public static void main ( String args [] )
    {
        double n ;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
        JOptionPane.showMessageDialog(null,"O Resultado da série : "+fserie(n));
    }
    static double fserie ( double num )
    {
     if ( num == 1 )
     {
         return 1;
     }  
     else 
     { 
        return ( fseriefatorial(num) + fserie ( num - 1 ) );
     }
    }
    static double fseriefatorial (double n1)
   {
        if ( n1 == 1 )
        {
            return 1;
        }  
        else 
        {
            return ( n1 * fseriefatorial (n1 - 1) );
        }
    }
}