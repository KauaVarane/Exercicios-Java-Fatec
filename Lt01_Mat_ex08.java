/**
8.	Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.

 */
import javax.swing.JOptionPane;
public class Lt01_Mat_ex08
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int matriz[ ][ ] = new int [4][3];
	int x,y;
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Quantidade de Produtos Vendido  \n 3 - Quantidade de produtos Vendidos na Semana \n 4 - Soma total  \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    matriz = CarregaMatriz(matriz);
                    break;
                case 2:
                    QuantidadedeProdutosVendido(matriz);
                    break;
                case 3:
                    QuantidadedeprodutosVendidosnaSemana(matriz);
                    break;
                case 4 :
                    Somatotal(matriz);
                    break;
                case 9:
                     JOptionPane.showMessageDialog(null,"FIM");
                     System.exit(0);
                     break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }  
    public static int[ ][ ] CarregaMatriz(int mat[ ][ ])
    {
        int i, j ;
        for ( i = 0 ; i < 4 ; i++ )
        {
            for ( j = 0 ; j < 3 ; j++ )
            {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
        }
        return mat;
    }
    public static void QuantidadedeProdutosVendido (int mat [ ] [ ] )  
    {
        int i,j, soma = 0;
        for ( j = 0 ; j < 3 ; j++ )
        {
            for ( i = 0 ; i < 4 ; i++ )
            {
                soma = ( soma + mat[ i ][ j ] );
            }
            JOptionPane.showMessageDialog(null,"A quantidade de produto "+(j+1)+" Vendido é : "+soma );
            soma = ( 0 );
        }
    }
    public static void QuantidadedeprodutosVendidosnaSemana(int mat [ ] [ ]  )
    {
        int i,j, soma = 0;
        for ( i = 0 ; i < 4 ; i++ )
        {
            for ( j = 0 ; j < 3 ; j++ )
            {
                soma = ( soma + mat[ i ][ j ] );
            }
            JOptionPane.showMessageDialog(null,"A quantidade de produtos na Semana "+(i+1)+" é : "+soma );
            soma = ( 0 );
        }
    }
    public static void Somatotal(int mat [ ] [ ] )
    {
        int i,j, soma = 0;
        for ( i = 0 ; i < 4 ; i++ )
        {
            for ( j = 0 ; j < 3 ; j++ )
            {
                soma = ( soma + mat[ i ][ j ] );
            }
        }
        JOptionPane.showMessageDialog(null,"A soma Total é : "+soma );
    }
} 