/*
24.	Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex24
{
    static int n1;
    public static void main(String args[]) 
    {
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número : "));
        
        ProcedureDiv();
    }
    
    static void ProcedureDiv()
    {
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
