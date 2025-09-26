/**
9.	Criar e carregar uma matriz [4][4] com valores aleatórios, 
* sendo que a diagonal principal terá seus dados carregados no programa segundo:
 
.

 */
import javax.swing.JOptionPane;
public class Lt01_Mat_ex09
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int matriz[ ][ ] = new int [4][4];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Classificar Matriz  \n 3 - Exibir Matriz \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    matriz = CarregaMatriz(matriz);
                    break;
                case 2:
                    matriz = ClassificarMatriz(matriz);
                    JOptionPane.showMessageDialog(null,"Matriz Calssificada");
                    break;
                case 3:
                    ExibirMatriz(matriz);
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
            for ( j = 0 ; j < 4 ; j++ )
            {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
        }
        return mat;
    }
    public static int [][] ClassificarMatriz (int mat [ ] [ ] )  
    {
        int i,j, soma = 1;
        for ( i = 0 ; i < 4 ; i++ )
        {
            for ( j = 0 ; j < 4 ; j++ )
            {
                if ( i == j )
                {
                    mat[i][j]=(soma);
                    soma = ( soma * 4 );
                }
            } 
        }
        return mat ;
    }
    public static void ExibirMatriz(int mat [ ] [ ]  )
    {
        int i,j;
        for ( i = 0 ; i < 4 ; i++ )
        {
            for ( j = 0 ; j < 4 ; j++ )
            {
                JOptionPane.showMessageDialog(null,"O valor da Matriz é [" +i+ "] [" +j+ "]"+mat[i][j]);
            }
        }
    }
} 