/*
    43.Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
    Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/
import javax.swing.JOptionPane;
public class Lt01_Func_ex43
{
    public static void main ( String args [ ] )
    {
        double Ana, Maria, anos1, anos2;
        int i ; 
        Ana = ( 1.10 );
        Maria = ( 1.50 );
        anos1 = ( 0.03 );
        anos2 = ( 0.02 );
        i = ( 0 );
        JOptionPane.showMessageDialog(null,FuncaoIdade(Ana, Maria, anos1, anos2 , i));
    }
    static String FuncaoIdade (double An, double Ma, double a1, double a2 , int ir )
    {
        String resultado = "";
        while ( An <= Ma )
        {
            An = ( a1 + An );
            Ma = ( a2 + Ma );
            ir = ( ir + 1 );
        }
        if ( An > Ma )
        {
            resultado = "Depois de "+ir+" Ana terá : "+An+" e Maria terá : "+Ma ;
        }
        return ( resultado );
    }
}