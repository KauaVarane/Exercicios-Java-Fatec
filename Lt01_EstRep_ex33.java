/*
   33.	Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex33
{
    public static void main (String args [ ] )
    {
        double numero,resultado, i;
        numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        resultado = ( 0 );
        for ( i=1 ; i <= numero ; i ++ )
        {
            resultado = ((1/i)+resultado);
            System.out.println("1/"+i+"="+resultado);
        }
        
        
    }
}
    