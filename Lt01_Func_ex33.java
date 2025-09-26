/*
    33.Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex33
{
  public static void main(String args [ ] )
    {
     double numero,resultado, i;
     numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
     resultado = ( 0 );
     i = ( 0 );
     JOptionPane.showMessageDialog(null,"O Resultado da sequencia  é : "+FunçãoSerie(numero,resultado,i));
    }
  static double FunçãoSerie (double n ,double res ,double ir) 
  {
    for ( ir=1 ; ir <= n ; ir ++ )
        {
            res = ((1/ir)+res);
        }
    return( res );
  }
}
