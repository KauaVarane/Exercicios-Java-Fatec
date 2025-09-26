/*
26.	Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 */
import javax.swing.JOptionPane;
public class Lt01_Proced_ex26
{
    static int n1, n2, maior, menor;
    public static void main ( String args [] )
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número:"));
        ProcedureNumero ();
        if ( maior % menor == 0 )
        {
            JOptionPane.showMessageDialog(null,"O "+maior+" é divisivel pelo "+menor);   
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"O "+maior+" não é divisivel pelo "+menor);
        }    
    }
    static void ProcedureNumero ()
    {
        if ( n2 < n1 )
        {
           maior = ( n1 );
           menor = ( n2 );
           
        }
  
        else 
        {
           maior = ( n2 );
           menor = ( n1 );
        }
    }
}
