/*
8.	Receba o valor de um depósito em poupança.
        Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 */
import javax.swing.JOptionPane;
public class Lt01_ex08
{
    public static void main (String args [ ] )
     {
         double  deposito_poupanca, rendimento; 
         deposito_poupanca = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Depósito na Poupança : "));
         rendimento = ( deposito_poupanca * 1.3 );
        JOptionPane.showMessageDialog(null,"O volume do paralelepipedo é : " +rendimento);
     }
}

