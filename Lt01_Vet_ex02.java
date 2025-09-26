/*
 2.	Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.
 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex02
{
    public static void main ( String arg [ ] )
    {
        int opc = 0 ;
        int vetor [ ] = new int [100];
        while ( opc != 9 )
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor \n 2 - Calcular Maior e Menor valor \n 3 - Exibir a Média dos valores \n 9 - fim"));
            switch ( opc )
            {
                case 1 :
                    vetor = CarregaVetor(vetor);
                    break;
                case 2 :  
                    String res = CalcularMaioreMenorvalor(vetor);
                    JOptionPane.showMessageDialog(null,res);
                    break;
                case 3 :
                    double media = ExibiraMédiadosvalores(vetor);
                    JOptionPane.showMessageDialog(null,"A Média dos valores é : "+media);
                    break;
                case 9 :
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                    break;
                default : 
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
    public static int[ ] CarregaVetor(int vt [ ] )
    {
        int cta;
        for ( cta = 0 ; cta < 100 ; cta ++)
        {
            vt[cta]=Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
        }
        return vt;
    }
    public static String CalcularMaioreMenorvalor(int vt[ ])
    {
        int i , maior , menor;
        String res = "";
        maior = ( vt[0] );
        menor = ( vt[0] );
        for ( i = 0 ; i < 100 ; i++)
        {
            if ( vt[i] > maior )
            {
                maior = ( vt[i] );
            }
            else if( vt[i]< menor)
            {
                menor = ( vt[i] );
            }
        }
        res = ("O MAIOR valor é : "+maior+" O MENOR é : "+menor);
        return  res ;
    }
    public static double ExibiraMédiadosvalores(int vt[])
    {
     int i, cta;
     double media ;
     cta = ( 0 );
     for ( i = 0;i < 100; i ++)
     {
        cta = ( cta + vt[i] );
     }   
     media = ( cta / 100 );
     return ( media ) ; 
    }
}
