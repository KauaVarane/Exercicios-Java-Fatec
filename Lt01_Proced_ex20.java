/*
20. Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
Verifique e mostre a existência de raízes reais e, se existirem, calcule e mostre.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex20
{
    static double A, B, C, delta, x1, x2;
    public static void main(String args[]) 
    {
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o Coeficiente A:"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o Coeficiente B:"));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite o Coeficiente C:"));
        
        Procedure2Grau();
        
    }
    
    static void Procedure2Grau()
    {
       delta = (B * B) - (4 * A * C);

        if (A == 0) 
        {
            JOptionPane.showMessageDialog(null, "Isso não é uma equação do 2º grau.");
        }
        else if (delta < 0) 
        {
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "A equação não possui raízes reais.");
        } 
        else if (delta == 0) 
        {
            x1 = -B / (2 * A);
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "A equação possui uma raiz real: " + x1);
        } 
        else if ( delta > 0 )
        { 
            double raiz = Math.sqrt(delta);
            x1 = (-B + raiz) / (2 * A);
            x2 = (-B - raiz) / (2 * A);
            JOptionPane.showMessageDialog(null, "Delta = " + delta);
            JOptionPane.showMessageDialog(null, "A equação possui duas raízes reais:\nX1 = " + x1 + "\nX2 = " + x2);
        }
    }
}
