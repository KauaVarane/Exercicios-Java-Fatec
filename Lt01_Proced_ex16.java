/*
16. Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de dependentes. 
Calcule o salário bruto = horas trabalhadas x valor por hora. 
Calcule o salário líquido = Salário Bruto – desconto. 
A cada dependente será acrescido R$ 100 no Salário Líquido. 
Exiba o salário a receber.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex16
{
    static double ht, vh, pd, dependentes, salario, salario_liquido, salario_final;
    public static void main(String args[]) 
    {
        ht = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:"));
        vh = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora:"));
        pd = Double.parseDouble(JOptionPane.showInputDialog("Digite o percentual de desconto:"));
        dependentes = Double.parseDouble(JOptionPane.showInputDialog("Digite o número de dependentes:"));
        
        ProcedureSalario();
        
        JOptionPane.showMessageDialog(null,"O salário a receber é: R$ " + salario_final);
    }
    
    static void ProcedureSalario()
    {
        salario = ht * vh; 
        salario_liquido = salario - (salario * (pd / 100)); 
        salario_final = salario_liquido + (dependentes * 100); 
    }
}
