/*
36.	Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex36
{
  public static void main(String args [ ] )
    {
     double n, n2, i, r, res ;
     n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
     i = ( 1 );
     res = ( 0 );
     n2 = ( 1 );
     r = ( 1 );
     JOptionPane.showMessageDialog(null,"O resultado da sequencia é : "+ FunçãoFatorial(n, n2, i, r, res));
    }
  static double FunçãoFatorial(double num, double num2, double ir, double rr, double resultado ) 
    {
        while (ir <= num && rr <= num)
        {
            num2 = ( ir * num2 );
            resultado=( ( rr / num2 ) + resultado );
            ir = ( ir + 1 );
            rr = ( rr + 1 );
        }
       return ( resultado ); 
    }
}
