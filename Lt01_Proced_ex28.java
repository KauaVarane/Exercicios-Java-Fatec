/*
28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	< 30	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 */
import javax.swing.JOptionPane;
public class Lt01_Proced_ex28
{
    static int venda_mensal;
    static double preco_atual;
    public static void main (String args [ ] )
    {
        venda_mensal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da venda Mensal: "));
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do preço Atual:"));
        ProcedurePreco ();
        JOptionPane.showMessageDialog(null,"O novo Preço será : "+preco_atual);
    } 
    static void ProcedurePreco ()
    {
        if ( venda_mensal<500 && preco_atual<30 )
        {
           preco_atual = ( preco_atual + ( preco_atual * 0.10 ) );
        }
  
        else
        {
           if ( venda_mensal>=500 && venda_mensal<1000 && preco_atual>=30 && preco_atual<80 )
           {
               preco_atual = ( preco_atual + ( preco_atual * 0.15 ) );
           }
      
           else
           {
                preco_atual = ( preco_atual - ( preco_atual * 0.5 ) );
           }
        }
    }
}