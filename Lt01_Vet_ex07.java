/**
 7.	A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor 
 *      (utilizar pesquisa binária).
 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex07
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int vetor[ ] = new int[20];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classificar Vetor  \n 3 - Exibir o Vetor \n 4 - Verificar se um Número existe no Vetor  \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                case 2:
                    vetor = ClassificaVetor(vetor);
                    JOptionPane.showMessageDialog(null,"Vetor Classificado");
                    break;
                case 3:
                    Exibir(vetor);
                    break;
                case 4 :
                    VerificarseumNúmeroexistenoVetor(vetor);
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
        for ( cta = 0 ; cta < 20 ; cta++ )
        {
            vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
        return vt;
    }
    public static int [ ] ClassificaVetor(int vt[ ])  
    {
        int i,j, aux;
        aux = ( 0 );
        j = ( 0 );
        while ( j < 40 )
        {
            for ( i = 0 ; i < 19 ; i++ )
            {
                if ( vt [ i ] > vt [ i + 1 ] )
                {
                    aux = ( vt [ i ] );
                    vt [ i ] = ( vt [ i + 1 ] );
                    vt [ i + 1 ] = ( aux );
                }
            }
        j = ( 1 + j );
        }
        return vt;   
    }
    public static void Exibir(int vt [ ] )
    {
        int i;
        JOptionPane.showMessageDialog(null,"O Vetor Classificado fica");
        for( i = 0 ; i < 20 ; i ++ )
        {
            JOptionPane.showMessageDialog(null,"O Vetor [" +i+ "] tem o valor de : "+vt[i]);
        }
    }
    public static void VerificarseumNúmeroexistenoVetor(int vt [ ] )
    {
        int i, num;
        num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um número"));
        for( i = 0 ; i < 20 ; i ++ )
        {
            if ( num == vt [i])
            {
                JOptionPane.showMessageDialog(null,"O Número existe e está  no Vetor [" +i+ "] com o valor de : "+vt[i]);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"O Número não existe no Vetor [" +i+ "] com o valor de : "+vt[i]);
            }
        }
    }
} 