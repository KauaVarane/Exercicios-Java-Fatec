/*
 39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: !!!!!!!!!!!
Casa:  1  2  3  4  ... 64
Qdte:  1  2  4  8  ... N
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex39
{
  public static void main(String args [ ] )
    {
     int n, q, i;
        n = (1);   
        i = (0);
        q = (0);   
     JOptionPane.showMessageDialog(null,FunçãoGraos(n, q, i));
    }
  static int FunçãoGraos (int num, int qr, int ir) 
  {
    while (ir < 64) 
    {
        qr = (qr + num);   
        num = (num * 2);   
        ir = (ir + 1);
    }
        return qr ;
  }
}
