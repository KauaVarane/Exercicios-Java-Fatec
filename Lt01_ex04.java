/*
4.	Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.

F = (9*C+160) /5
 */
import javax.swing.JOptionPane;
public class Lt01_ex04
{
    public static void main (String args [ ] )
     {
         double  graus_celsius, fahrenheit; 
         graus_celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a Temperatura e Graus Celsius : ")); 
         fahrenheit = ((9*graus_celsius+160) /5);
        JOptionPane.showMessageDialog(null,"A Temperatura em fahrenheit é : " +fahrenheit);
     }
}

