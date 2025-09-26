/*
7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 */
import javax.swing.JOptionPane;
public class Lt01_ex07
{
    public static void main (String args [ ] )
     {
         double  comprimento, largura, altura, volume; 
         comprimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o Comprimento do Paralelepipedo : "));
         largura = Double.parseDouble(JOptionPane.showInputDialog("Digite o Largura do Paralelepipedo : "));
         altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o Altura do Paralelepipedo : "));
         volume = (comprimento * largura * altura);
        JOptionPane.showMessageDialog(null,"O volume do paralelepipedo é : " +volume);
     }
}

