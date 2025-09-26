/*
Serie 2 = ( ( N ) + ( N - 1 ) + ( N - 2 ) + ... + ( 1 ) )
*/
import javax.swing.JOptionPane;
public class RecFunction_ex2 
{
    public static void main ( String args [ ] )
    {
        int n ;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        JOptionPane.showMessageDialog(null,"O Resultado é : "+fserie (n));
    }
    static int fserie(int num)
    {
        int serie ; 
        if ( num > 1 )
        {
            serie = ( num + fserie ( num - 1 ));
            return serie ;
        }
        else 
        {
            return num ;
        }
    }
}