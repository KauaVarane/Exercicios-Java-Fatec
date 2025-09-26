/*
23.	Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
        Mostre os 4 números em ordem crescente.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex23
{
    static int n1, n2, n3, n4;
    public static void main(String args[]) 
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (MAIOR que o primeiro) : "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (MAIOR que o segundo) : "));
        n4 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número aleatório : "));
        
        ProcedureOrdem();
    }
    
    static void ProcedureOrdem()
    {
        if ( n3 < n4 )
        {
            JOptionPane.showMessageDialog(null, "A ordem Crescente : "+n1+n2+n3+n4);
        }
        // n1, n2, n4, n3
        else if ( n2 < n4 && n4 < n3 )
        {
            JOptionPane.showMessageDialog(null, "A ordem Crescente : "+n1+n2+n4+n3);
        }
        // n1, n4, n2, n3
        else if ( n1 < n4 && n4 < n2 )
        {
            JOptionPane.showMessageDialog(null, "A ordem Crescente : "+n1+n4+n2+n3);
        }
        // n4, n1, n2, n3
        else
        {
            JOptionPane.showMessageDialog(null, "A ordem Crescente : "+n4+n1+n2+n3);
        }
    }
}
