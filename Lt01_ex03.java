/*
 3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 */
import javax.swing.JOptionPane;
public class Lt01_ex03 
{
    public static void main (String args [ ] )
     {
         int  base, altura, area; 
         altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura do triangulo : ")); 
         base = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base do triangulo : ")); 
         area = ((base * altura) / 2);
        JOptionPane.showMessageDialog(null,"A area do triangulo é : " +area);
     }
}

