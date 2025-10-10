package RegistroLógico_Aluno;
import javax.swing.JOptionPane;
public class ClasseMetodos 
{  
  public Aluno[] FCadastra(Aluno[] aluno)
  {
    int i;
    for (i = 0 ; i < 3 ; i++)
    {
      aluno[i].pnome = JOptionPane.showInputDialog("Entre o nome do aluno:");
      aluno[i].unome = JOptionPane.showInputDialog("Entre o sobrenome do aluno:");
      aluno[i].pontos =Integer.parseInt(JOptionPane.showInputDialog("Pontos do aluno:"));
    }
    return aluno;
  }  
  public void FConsulta(Aluno[] aluno)
  {
    int i;
    for (i = 0 ; i < 3; i++) 
    {
        System.out.println(aluno[i].pnome + " " + aluno[i].unome + " pontos: " + aluno[i].pontos);
    }
  }             
} 
