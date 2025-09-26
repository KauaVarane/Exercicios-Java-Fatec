/*
   31.	Calcule e mostre o quadrado dos números entre 10 e 150.
 */
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex31
{
    public static void main (String args [ ] )
    {
        int cta = 10, quadrado;
        for (cta = 10; cta <=150; cta++ )
        {
          quadrado = ( cta * cta );
          System.out.println(" O valor e "+cta+ " quadrado e "+quadrado);  
        }
    }
}