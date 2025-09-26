/*
 41.	Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex41
{
  public static void main(String args [ ] )
    {
     int dado1, dado2, i, j ;
     dado1 = ( 0 );
     dado2 = ( 0 );
     i = ( 0 );
     j = ( 0 );
     JOptionPane.showMessageDialog(null,FunçãoSerie(dado1, dado2, i, j));
    }
  static String FunçãoSerie ( int d1, int d2, int ir, int jj) 
    {
        String mostra = "";
        for (ir = 1, jj = 6; ir <= 6 && jj >= 1; ir++, jj--) 
        {
            d1 = ( ir );
            d2 = ( jj );
            mostra += ( "Dado1: " + d1 + " | Dado2: " + d2+ " = 7");
        }
        return mostra;
    }
}
