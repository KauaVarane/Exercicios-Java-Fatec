/*
32.	Receba um número inteiro. Calcule e mostre o seu fatorial.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex32
{
  public static void main(String args [ ] )
    {
     int numero,i,resultado;
     numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
     resultado = ( 1 );
     i = ( 0 );
     JOptionPane.showMessageDialog(null,"O Fatorial de "+numero+" = "+ FunçãoQuadrado(numero,i,resultado));
    }
  static int FunçãoQuadrado (int n , int ir , int res) 
  {
    for ( ir = 1 ; n >= ir ; ir++)
        {
        res = ( ir * res );
        }
    return ( res );
  }
}
