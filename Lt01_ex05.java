/*
5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). 
Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 */
import javax.swing.JOptionPane;
public class Lt01_ex05
{
    public static void main (String args [ ] )
     {
         double  A, B, C, delta, X1, X2; 
         A = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente A : ")); 
         B = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente B : ")); 
         C = Double.parseDouble(JOptionPane.showInputDialog("Digite o coeficiente C : ")); 
         delta = ( ( B * B ) - 4 * A * C);
        JOptionPane.showMessageDialog(null,"O Delta da equação é: " +delta);
        double raiz = Math.sqrt( delta );        
         X1 = ( (- B + raiz) / 2 * A);
         X2 = ( (- B - raiz) / 2 * A);
        JOptionPane.showMessageDialog(null,"O X1 da equação é: " +X1);
        JOptionPane.showMessageDialog(null,"O X2 da equação é: " +X2);
     }
}

