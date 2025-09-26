/*
 25. Receba a hora de início e de final de um jogo (HH,MM) sabendo 
    que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 */
import javax.swing.JOptionPane;
public class Lt01_Proced_ex25
{
    static int hi, mi, hf, mf, inicio_min, fim_min,duracao,horas,min;
    public static void main(String args[]) 
    {
        hi = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de inicio : "));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de inicio : "));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final : "));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Digite os minutos de fim : "));
        ProcedureHoras();
        JOptionPane.showMessageDialog(null, +horas+":"+min );
    }
    
    static void ProcedureHoras()
    {
        inicio_min = ( ( hi * 60 ) + mi );
        fim_min = ( ( hf * 60 ) + mf );
        if (fim_min < inicio_min )
        {
            fim_min = ( fim_min + ( 24 * 60 ) );
            duracao = ( fim_min - inicio_min );
            horas = ( duracao / 60 );
            min = ( duracao - ( horas * 60 ) );
        }
  
        else 
        {
            duracao = ( fim_min - inicio_min );
            horas = ( duracao / 60 );
            min = ( duracao - ( horas * 60 ) );
        }
    }
}
