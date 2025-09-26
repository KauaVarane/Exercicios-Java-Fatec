/*
19.	Receba 2 valores reais. Calcule e mostre o maior deles.

*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex19
{
    static double n1, n2, maior, menor;
    public static void main(String args[]) 
    {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número :"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite outro número :"));
        
        ProcedureValores();
        
        JOptionPane.showMessageDialog(null, "O Maior valor é :"+maior);
        JOptionPane.showMessageDialog(null, "O Menor valor é :"+menor);
    }
    
    static void ProcedureValores()
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
