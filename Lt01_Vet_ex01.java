/*
 1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
    a.	A média dos valores entre 10 e 200;
    b.	A soma dos números ímpares

 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex01 
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int vetor[ ] = new int[50];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Média entre 10 e 200 \n 3 - Soma dos números ímpares \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    vetor = CarregaVetor(vetor);
                    break;
                case 2:
                    double media = Mediaentre10e200(vetor);
                    JOptionPane.showMessageDialog(null,"Média entre 10 e 200 = "+ media);
                    break;
                case 3:              
                    int soma = somadosnúmerosímpares(vetor);
                    JOptionPane.showMessageDialog(null,"A soma dos números impares é = "+ soma);
                    break;
                case 9:
                     JOptionPane.showMessageDialog(null,"FIM");
                     System.exit(0);
                     break;
                default: 
                    JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }

    public static int[ ] CarregaVetor(int vt[ ])
    {
        int cta;
        for ( cta = 0 ; cta < 50 ; cta++ )
        {
            vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
          return vt;
    }
    public static double Mediaentre10e200(int vt[ ])  
    {
        int i, cont, soma;
        double media;
        soma = ( 0 );
        cont = ( 0 );

        for ( i = 0 ; i < 50 ; i++ )
        {
            if ( vt[i] >= 10 && vt[i] <= 200 )
            {
                soma = ( soma + vt[i] );
                cont = ( cont + 1 );
            }
        }
        media = ( soma / cont );
        return media;   
    }
    public static int somadosnúmerosímpares(int vt[ ])
    {
        int i, soma ;
        soma = ( 0 );
        for ( i = 0 ; i < 50 ; i++ )
        {
            if ( vt[i]%2==0)
            {
                soma = ( soma + 0 );
            }
            else
            {
                soma = (soma +vt[i]);
            }
        }
    return soma;
    }
} 

