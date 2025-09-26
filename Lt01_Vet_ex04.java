/**
 4.	Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A média do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posições dos valores abaixo da média do grupo.

 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex04 
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int vetor[ ] = new int[30];
        double media = 0 ;
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Calcular e exibir Média  \n 3 - Mostrar Notas Acima da Média \n 4 - Mostrar Notas Abaixo da Média \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                case 2:
                    media = CalculareexibirMédia(vetor);
                    JOptionPane.showMessageDialog(null,"A Média é : "+media);
                    break;
                case 3:
                    MostrarNotasAcimadaMédia(vetor, media );
                    break;
                case 4:
                    MostrarNotasAbaixodaMédia(vetor, media );
                    break;
                case 9:
                     JOptionPane.showMessageDialog(null,"FIM");
                     System.exit(0);
                     break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }  
    public static int[ ] CarregaVetor(int vt[ ])
    {
        int cta;
        for ( cta = 0 ; cta < 30 ; cta++ )
        {
            vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
        return vt;
    }
    public static double CalculareexibirMédia(int vt[ ])  
    {
        int i;
        double soma ,media;
        soma = ( 0 );
        media = ( 0 );
        for ( i = 0 ; i < 30 ; i++ )
        {
           soma = ( vt[i] + soma );
        }
        media = ( soma / 30 );
        return media;   
    }
    public static void MostrarNotasAcimadaMédia(int vt[ ] , double media )
    {
        int i ;
        for ( i = 0 ; i < 30 ; i++)
        {
            if ( vt[i] > media )
            {
                JOptionPane.showMessageDialog(null,"O valor : "+vt[i]+", Do vetor [ "+i+" ] é Acima da Média .");
            }
        }
    }
    public static void MostrarNotasAbaixodaMédia(int vt[ ] , double media )
    {
        int i ;
        for ( i = 0 ; i < 30;  i++)
        {
            if ( vt[i] < media )
            {
                JOptionPane.showMessageDialog(null,"O valor : "+vt[i]+", Do vetor [ "+i+" ] é Abaixo da Média .");
            }
        }
    }
} 