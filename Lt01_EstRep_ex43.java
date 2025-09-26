/*
    43.Calcule e mostre quantos anos serão necessários para que Ana seja maior que 
    Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
*/
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex43
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
        while ( Ana <= Maria )
        {
            Ana = ( anos1 + Ana );
            Maria = ( anos2 + Maria );
            i = ( i + 1 );
        }
        if ( Ana > Maria )
        {
            JOptionPane.showMessageDialog(null,"Depois de "+i+" Ana terá : "+Ana+" e Maria terá : "+Maria);
        }
    }
}