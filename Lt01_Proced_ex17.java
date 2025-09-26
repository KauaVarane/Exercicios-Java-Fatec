/*
17.	Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class Lt01_Proced_ex17
{
    static int tp, vm, dt, lg; 
    public static void main ( String args [ ] )
    {
        tp = Integer.parseInt(JOptionPane.showInputDialog(" Tempo de percurso(horas) : "));
        vm = Integer.parseInt(JOptionPane.showInputDialog(" Velocidade média : "));
        ProcedureVelocidadeMédia();
        JOptionPane.showMessageDialog(null,"A quantidade de Litros gastos será : "+lg);
    }
    static void ProcedureVelocidadeMédia ()
    {
        dt = ( tp * vm ); 
        lg = ( dt / 12 );
    }
}