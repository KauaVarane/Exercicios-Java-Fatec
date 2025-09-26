/*
22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.


 */
import javax.swing.JOptionPane;
public class Lt01_EstDec_ex22
{
    public static void main (String args [ ] )
    {
        int n1, n2,menor, maior;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (Diferente do primeiro) : "));
        if ( n1 > n2 )
        {
            maior = ( n1 );
            menor = ( n2 );
            JOptionPane.showMessageDialog(null, "O Menor valor é : "+menor);
            JOptionPane.showMessageDialog(null, "O Maior valor é : "+maior);
        }
        else 
        {
            maior = ( n2 );
            menor = ( n1 );
            JOptionPane.showMessageDialog(null, "O Menor valor é : "+menor);
            JOptionPane.showMessageDialog(null, "O Maior valor é : "+maior);
        }      
    }
}
