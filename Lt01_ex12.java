/*
12.	Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 */
import javax.swing.JOptionPane;
public class Lt01_ex12
{
    public static void main (String args [ ] )
     {
        int  ano_nascimento, ano_atual, idade, idade_17anos ; 
         ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano de Nascimento : ")); 
         ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ano de Atual :")); 
         idade = (ano_atual - ano_nascimento);
         idade_17anos = (idade + 17);
        JOptionPane.showMessageDialog(null,"Sua idade atual : " +idade);
        JOptionPane.showMessageDialog(null,"Daqui 17 anos sua idade será : " +idade_17anos);
     }
}

