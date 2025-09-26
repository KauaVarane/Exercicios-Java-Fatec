/**
 5.	Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
∑ (A[1] – A[21–1])
i = 1


 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex05
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int A[ ] = new int[20];
        int soma = 0 ;
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Calcular  \n 3 - Exibir  \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    A = CarregaVetor(A);
                    break;
                case 2:
                    soma = Calcular(A);
                    JOptionPane.showMessageDialog(null,"Vetor Calculado");
                    break;
                case 3:
                    Exibir(soma);
                    break;
                case 9:
                     JOptionPane.showMessageDialog(null,"FIM");
                     System.exit(0);
                     break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }  
    public static int[ ] CarregaVetor(int a[ ])
    {
        int cta;
        for ( cta = 0 ; cta < 20 ; cta++ )
        {
            a[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
        }
        return a;
    }
    public static int Calcular(int a[ ])  
    {
        int i, soma;
        soma = ( 0 );
        for ( i = 0 ; i < 11 ; i++ )
        {
           soma = ( soma + ( a [ i ] - a [ 19 - i ] ) );
        }
        return soma;   
    }
    public static void Exibir(int soma)
    {
        JOptionPane.showMessageDialog(null,"O Resultado é : "+soma);
    }
} 