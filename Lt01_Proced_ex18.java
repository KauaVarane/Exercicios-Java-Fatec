/*
 18.	Receba 2 valores inteiros.
Calcule e mostre o resultado da diferença do maior pelo menos valor.
 */
import javax.swing.JOptionPane;
public class Lt01_Proced_ex18
{
    static int valor_1, valor_2, maior, menor, diferença ;
    public static void main (String args [ ] )
    {
       valor_1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1 :"));
       valor_2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2 :"));
       ProcedureDif ();
       JOptionPane.showMessageDialog(null,"O Maior valor é : "+maior+" e o Menor é : "+menor);
       JOptionPane.showMessageDialog(null,"A Diferença entre eles é : "+diferença );
    }
    static void ProcedureDif () 
    {
        if(valor_1 > valor_2)
        {
            maior = ( valor_1 );
            menor = ( valor_2 );
            diferença = ( maior - menor );
        }
        else 
        {
            menor = ( valor_1 );
            maior = ( valor_2 );
            diferença = ( maior - menor );
        }
    }
}