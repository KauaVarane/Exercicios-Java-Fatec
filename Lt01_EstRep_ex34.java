/*
   34.	Receba um número. Calcule e mostre os resultados da tabuada desse número.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex34
{
    public static void main (String args [ ] )
    {
        int numero,n1,resultado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n1 = ( 1 );
        resultado = ( 0 );
        while ( n1 <= 10)
        {
            resultado = ( n1 * numero );
            System.out.println(+n1+" X "+numero+" = "+resultado);
            n1 = ( n1 + 1 );
        }
    }
}
    