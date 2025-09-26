/*
   39. Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: !!!!!!!!!!!
Casa:  1  2  3  4  ... 64
Qdte:  1  2  4  8  ... N
*/
import javax.swing.JOptionPane;
public class Lt01_EstRep_ex39
{
    public static void main (String args[])
    {
        int n, q, i;
        n = (1);   
        i = (0);
        q = (0);   

        while (i < 64) 
        {
            q = (q + n);   
            n = (n * 2);   
            i = (i + 1);
        }

        JOptionPane.showMessageDialog(null,"Total de grãos é: " + q);
    }
}
