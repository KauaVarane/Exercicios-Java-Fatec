/*
22.	Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex22
{
    static int n1, n2,menor, maior;
    public static void main(String args[]) 
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número (Diferente do primeiro) : "));
        
        ProcedureInt();
        
        JOptionPane.showMessageDialog(null, "O Menor valor é : "+menor);
        JOptionPane.showMessageDialog(null, "O Maior valor é : "+maior);
    }
    
    static void ProcedureInt()
    {
        if ( n1 > n2 )
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
