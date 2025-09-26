/*
  40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex40
{
  public static void main(String args [ ] )
    {
     int inicio, fim, temp, num, primo, i;
     temp = ( 0 );
     num = ( 0 );
     primo = ( 0 );
     i = ( 0 );
     inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
     fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
     JOptionPane.showMessageDialog(null,"Números primos entre " + inicio + " e " + fim + " : "+FunçãoSerie(inicio, fim, temp, num, primo, i));
    }
  static String FunçãoSerie ( int ini, int f, int t, int n, int p , int ir) 
    {
        String mostra = "";
        while (n < f) 
        {
            if (n >= 2) 
            {
                ir = ( 2 );
                p = ( 1 );
                while ( ir * ir <= n ) 
                {
                    if ( n % ir == 0 ) 
                    {
                        p = 0;
                        break;
                    }
                    ir = ( ir + 1 );
                }
                if ( p == 1 ) 
                {
                   mostra += " | "+n+" | ; ";
                }
            }
            n = ( 1 + n );
        }
        return ( mostra );
    }
}
