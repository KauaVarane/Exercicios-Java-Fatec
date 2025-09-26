/*
28.	Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal	Preço Atual	Preço Novo
< 500	< 30	+ 10%
>= 500 e < 1000	>= 30 e < 80	+15%
>= 1000	>= 80	- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 */
import javax.swing.JOptionPane;
public class Lt01_EstDec_ex28
{
    public static void main (String args [ ] )
    {
        int venda_mensal;
        double preco_atual;
        venda_mensal = Integer.parseInt(JOptionPane.showInputDialog("Digite o Valor da venda Mensal: "));
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do preço Atual:"));
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
        JOptionPane.showMessageDialog(null,"O novo Preço será : "+preco_atual);
    }
}

    