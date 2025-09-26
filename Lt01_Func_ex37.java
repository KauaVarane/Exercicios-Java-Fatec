/*
 37.	Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex37
{
  public static void main(String args [ ] )
    {
     int res, n1, i;
     res = ( 1 );
     n1 = ( 1 );
     i = ( 0 );
     JOptionPane.showMessageDialog(null,"A o N’nésimo termo da seuqnecia de Fibonacci é : "+ FunçãoFibonacci(res,n1,i));
    }
  static int FunçãoFibonacci (int resultado , int num , int ir) 
  {
    while ( resultado <= 21 ) 
    {
        ir=(resultado);
        resultado=(num+resultado);
        num=(ir);
    } 
    return ( resultado );
  }
}
