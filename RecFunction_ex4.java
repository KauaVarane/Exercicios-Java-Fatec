/*
 Serie 4 =  ( N / 1 ) + ( N - 1 / 2 ) + ( N - 2 / 3 ) + ... + ( 1 / N )
*/
import javax.swing.JOptionPane;
public class RecFunction_ex4
{
     public static void main ( String args [ ] )
     {
         double n , i;
         n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número : "));
         i = ( 1 );
         JOptionPane.showMessageDialog(null,"O valor da série final é : "+fserie1(n,i));
     }
     static double fserie1 ( double num , double ir )
     {
         if ( num == 1 )
         {
             return num / ir ;
         }
         else 
         {
             return (( num / ir )+ fserie1 ( num - 1 ,ir +1 ));   
             
         }
     }
}