/*
   32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex32
{
    public static void main (String args [ ] )
    {
        int numero,i,resultado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        resultado = ( 1 );
        for ( i= 1 ; numero >= i ; i++)
        {
            resultado = ( i * resultado );
            System.out.println("resultado "+resultado);
        }
        
        
    }
}
    