/*
    Serie 1 = ( 1 + 2 + 3 + ... + 100 )
    resultado = 5050
*/
import javax.swing.JOptionPane ; 
public class RecFunction_ex1
{
    public static void main (String args[ ])
    {
        int n = 1 ;
        JOptionPane.showMessageDialog(null,"O resultado é :" +fserie (n));
    }
    static int fserie ( int num )
    {
        int serie ;
        if ( 100 > num )
        {
            serie = ( num + fserie ( num + 1 ));
            return serie ; 
        }
        else 
        {
            return 100 ; 
        }
    }
}