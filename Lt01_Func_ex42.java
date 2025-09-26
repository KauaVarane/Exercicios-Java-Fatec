/*
42.	Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99 
*/
import javax.swing.JOptionPane;
public class Lt01_Func_ex42
{
    public static void main ( String args [ ] )
    {
        double res , i , j ; 
        res = ( 0 );
        i = ( 0 );
        j = ( 0 );
        JOptionPane.showMessageDialog(null,"0 Resultado da Série é : "+FunçãoSerie(res,i,j));
    }
    static double FunçãoSerie ( double r , double ir , double jj )
    {
        for ( ir=1 ; ir <= 50 ; ir++ )
        {
            jj = ( ( ir*2 )-1 );
            r = ( ( ir / jj ) + r );
        }
        return ( r ) ; 
    }
}