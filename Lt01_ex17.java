/*
17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class Lt01_ex17
{
    public static void main (String args [ ] )
     {
        int  tp, vm, dt, lg; 
         tp = Integer.parseInt(JOptionPane.showInputDialog("Tempo de percurso(horas) : ")); 
         vm = Integer.parseInt(JOptionPane.showInputDialog("Velocidade média : ")); 
         dt=(tp*vm);
         lg=(dt/12);
         JOptionPane.showMessageDialog(null,"A quantidade de Litros gastos será : "+lg);
     }
}

