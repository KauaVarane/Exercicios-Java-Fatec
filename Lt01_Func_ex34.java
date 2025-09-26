/*
34.	Receba um número. Calcule e mostre os resultados da tabuada desse número. !!!!!!
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex34
{
  public static void main(String args [ ] )
    {
     int numero,n1,resultado;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
     n1 = ( 1 );
     resultado = ( 0 );
     JOptionPane.showMessageDialog(null,"Resultado = "+FunçãoQuadrado(numero,n1,resultado));
    }
  static int FunçãoQuadrado (int n , int n2, int res) 
  {
    while ( n2 <= 10)
        {
            res = ( n2 * n );
            n2 = ( n2 + 1 );
        }
    return ( res );
  }
}
