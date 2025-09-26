/**
11.	Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 

 

 */
import javax.swing.JOptionPane;
public class Lt01_Mat_ex11
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int matriz[ ][ ] = new int [8][8];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Classificar Matriz \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    matriz = CarregaMatriz(matriz);
                    break;
                case 2:
                    ClassificarMatriz(matriz);
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
        for ( i = 0 ; i < 8 ; i++ )
        {
            for ( j = 0 ; j < 8 ; j++ )
            {
                mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            }
        }
        return mat;
    }
        public static void ClassificarMatriz (int mat [ ] [ ] )  
    {
        int i, j;
        int n = 8;

        for ( i = 0 ; i < n ; i++ )
        {
            for ( j = 0 ; j < n ; j++ )
            {
                int min = Math.min(Math.min(i, j), Math.min(n - 1 - i, n - 1 - j));
                mat[i][j] = min + 1; 
                JOptionPane.showMessageDialog(null,"mat[" + i + "][" + j + "] = " + mat[i][j]);
            }
        }
    }
}