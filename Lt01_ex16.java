/*
16.	Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
A cada dependente será acrescido R$ 100 no Salário Líquido. 
Exiba o salário a receber.
 */
import javax.swing.JOptionPane;
public class Lt01_ex16
{
    public static void main (String args [ ] )
     {
        double ht, vh, pd, dependentes, salario, salario_liquido, d;
        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite quantidade de horas trablhadas :"));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor por hora :"));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o Percentual de desconto :"));
        dependentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de Dependentes :"));
        salario = ( ht * vh );
        salario_liquido = ( salario - pd );
        d = ( salario_liquido + ( dependentes * 100 ));
        JOptionPane.showMessageDialog(null,"O Salário a Receber é : "+d);
     }
}

