/*
   35.	Receba 2 números inteiros, verifique qual o maior entre eles. 
        Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex35
{
    public static void main (String args [ ] )
    {
        int n1,n2,maior,menor;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        if ( n1 > n2 )
        {
            maior = ( n1 );
            menor = ( n2 );
            while ( maior >= menor)
            {
                if (menor % 2 == 0)
                {
                  System.out.println("O numero :"+menor+" Nao e impar.");  
                }
                else 
                {
                  System.out.println("O numero :"+menor+" e um numero impar.");
                }
                 
                menor = ( menor + 1 );        
            }
        }
        else
        {
            maior = ( n2 );
            menor = ( n1 );
            while ( maior >= menor)
            {
                if (menor % 2 == 0)
                {
                  System.out.println("O numero :"+menor+" Nao e impar.");  
                }
                else 
                {
                  System.out.println("O numero :"+menor+" e um numero impar.");
                }
                 
                menor = ( menor + 1 );        
            }
        }
        
        
    }
}
    