/*
45.	Calcule e mostre a série 1 + 2/4 + 3/9 + 4/16 + 5/25 + ... + 15/225
*/
import javax.swing.JOptionPane;
public class Lt01_Func_ex45
{
    public static void main ( String args [ ] )
    {
        double i, j, res;
        i = ( 0 );
        j = ( 0 );
        res = ( 0 );
        JOptionPane.showMessageDialog(null,FuncaoSerie(i, j, res));
    }
    static String FuncaoSerie (double ir, double jj, double r)
    {
        String mostra = "" ;
        for ( ir = 1 ; ir <= 15 ; ir++ )
        {
            jj = ( ir*ir );
            r = ( ( ir / jj ) + r);
        }
        mostra += ( " O Resultado da série é : "+r);
        return ( mostra ) ;
    }
}