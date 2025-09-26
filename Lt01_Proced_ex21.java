/*
21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.


*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex21
{
    static double n1, n2, n3, n4, media;
    public static void main(String args[]) 
    {
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N1 :"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N2 :"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N3 :"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da N4 :"));
        
        ProcedureNota();
        
        if ( media >= 6 )
        {
            JOptionPane.showMessageDialog(null, "Você foi APROVADO , sua média é : "+media);
        }
        else if ( media < 3 )
        {
            JOptionPane.showMessageDialog(null, "Você foi RETIDO , sua média é : "+media);
        }
        else 
        {
            JOptionPane.showMessageDialog(null, "Você está de EXAME , sua média é : "+media);
        } 
    }
    
    static void ProcedureNota()
    {
        media = ( ( n1+ n2 + n3 + n4 ) / 4 );      
    }
}
