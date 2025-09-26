/*
24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec_ex24
{
    public static void main (String args [ ] )
    {
        int n1;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        if ( n1 % 2 == 0 && n1 % 3 == 0 )
        {
            JOptionPane.showMessageDialog(null, "O "+n1+" é Divisível por 2 e 3.");
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "O "+n1+" Não é ivisível por 2 e 3.");
        }
    }
}

    