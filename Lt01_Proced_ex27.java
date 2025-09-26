/*
27. Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
Calcule e mostre a velocidade média em km/h.
*/
import javax.swing.JOptionPane;

public class Lt01_Proced_ex27
{
    static int numero_de_voltas, extensao_circuito, tempo;
    static double total_metros, total_km, tempo_horas, velocidade_media;
    
    public static void main(String args[])
    {
        numero_de_voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas: "));
        extensao_circuito = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (metros): "));
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite a duração (minutos): "));
        
        ProcedureCircuito();
        
        JOptionPane.showMessageDialog(null, "A velocidade média é: " + velocidade_media + " km/h");
    }
    
    static void ProcedureCircuito()
    {
        total_metros = numero_de_voltas * extensao_circuito;
        total_km = total_metros / 1000.0;
        tempo_horas = tempo / 60.0;
        velocidade_media = total_km / tempo_horas;
    }
}
