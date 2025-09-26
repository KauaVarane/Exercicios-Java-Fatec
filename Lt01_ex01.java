/*
 1.	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
 */
import javax.swing.JOptionPane;
public class Lt01_ex01 
{
    public static void main (String args [ ] )
     {
         int  lado, area; 
         
         
         lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o Lado do quadrado : ")); 
         area = (lado * lado);
        JOptionPane.showMessageDialog(null,"A area do quadrado é : " +area);
     }
}

