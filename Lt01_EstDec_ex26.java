/*
26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec_ex26
{
    public static void main (String args [ ] )
    {
        int n1, n2, maior, menor;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        if ( n2 < n1 )
        {
           maior = ( n1 );
           menor = ( n2 );
           if ( maior % menor == 0 )
           {
               JOptionPane.showMessageDialog(null,"O "+maior+" é divisivel pelo "+menor);   
           }
           else 
           {
               JOptionPane.showMessageDialog(null,"O "+maior+" não é divisivel pelo "+menor);
           }
        }
  
        else 
        {
           maior = ( n2 );
           menor = ( n1 );
           if ( maior % menor == 0)
           {
               JOptionPane.showMessageDialog(null,"O "+maior+" é divisivel pelo "+menor);   
           }
           else 
           {
               JOptionPane.showMessageDialog(null,"O "+maior+" não é divisivel pelo "+menor);
           }
        }
    }
}

    