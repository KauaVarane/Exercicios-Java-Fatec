/*
6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 */
import javax.swing.JOptionPane;
public class Lt01_ex06
{
    public static void main (String args [ ] )
     {
         double  X, X1, Y, Y1; 
         X = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de X : ")); 
         Y = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Y : ")); 
         X1 = ( X );       
         Y1 = ( Y );
         X = ( Y1 );
         Y = ( X1 );
        JOptionPane.showMessageDialog(null,"O X agora vale : " +X);
        JOptionPane.showMessageDialog(null,"O Y agora vale : " +Y);
     }
}

