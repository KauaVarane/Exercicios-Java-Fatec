/*
29.	Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
Demais tipos não serão considerados.
*/
import javax.swing.JOptionPane;
public class Lt01_Proced_ex29
{
    static double poupanca, renda_fixa, lucro, valor_final;
    public static void main ( String args [ ] )
    {
        poupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto investiu em poupança(Se não investiu digite ,0)"));
        renda_fixa = Double.parseDouble(JOptionPane.showInputDialog("Digite o quanto investiu em Renda fixa(Se não investiu digite ,0)"));
        ProcedureInvestimento ();
        JOptionPane.showMessageDialog(null,"O valor final é : "+valor_final);
    }
    static void ProcedureInvestimento ()
    {
        if ( renda_fixa < poupanca )
        {
            lucro = ( ( poupanca * 3 ) / 100 );
            poupanca = ( poupanca + lucro );
            valor_final = ( poupanca );
        }
        else
        {
            lucro= ( ( renda_fixa * 5 ) / 100 );
            renda_fixa = ( renda_fixa + lucro );
            valor_final = ( renda_fixa );
        }
    }
}