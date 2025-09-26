/*
 38. Receba 100 números inteiros reais. 
       Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex38
{
  public static void main(String args [ ] )
    {
     int menor, maior, i, n;
     i = 1;
     n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro positivo:"));
     maior = n;
     menor = n;
     JOptionPane.showMessageDialog(null,"O Maior valor é "+ FunçãoSerie(menor, maior, i, n));
     JOptionPane.showMessageDialog(null,FunçãoSerie(menor, maior, i, n));
    }
  static String FunçãoSerie (int small,int big, int ir, int num) 
  {
    while (ir < 100 ) 
        {
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro positivo:"));
            if (num > big)
            {
                big = num;
            }
            if (num < small)
            {
                small = num;
            }
            ir = ir + 1;
        }
        return "Maior = " + big + ", Menor = " + small ;
  }
}
