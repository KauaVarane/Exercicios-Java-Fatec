/*
   38. Receba 100 números inteiros reais. 
       Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
*/
import javax.swing.JOptionPane;

public class Lt01_EstRep_ex38
{
    public static void main (String args[])
    {
        int menor, maior, i, n;
        i = 1;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro positivo:"));
        maior = n;
        menor = n;

        while (i < 5) 
        {
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro positivo:"));
            if (n > maior)
            {
                maior = n;
            }
            if (n < menor)
            {
                menor = n;
            }
            i = i + 1;
        }

        JOptionPane.showMessageDialog(null, "O Maior valor é: " + maior);
        JOptionPane.showMessageDialog(null, "O Menor valor é: " + menor);
    }
}
