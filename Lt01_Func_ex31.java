/*
31.	Calcule e mostre o quadrado dos números entre 10 e 150.
*/

import javax.swing.JOptionPane;
public class Lt01_Func_ex31 
{
  public static void main(String args [ ] )
    {
     int cta , quadrado;
     cta = ( 10 ) ; 
     quadrado = ( 0 );
     JOptionPane.showMessageDialog(null,"A AREA É " + FunçãoQuadrado(cta,quadrado));
    }
  static int FunçãoQuadrado (int c , int q) 
  {
    int resultado = ( 0 );
    for (c = 10; c <=150; c++ )
    {
        q = ( c * c );
        resultado = ( q );
    } 
    return ( resultado );
  }
}
