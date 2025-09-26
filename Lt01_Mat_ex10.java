/**
 * 
 */
import javax.swing.JOptionPane;
public class Lt01_Mat_ex10
{
    public static void main (String arg [ ]) 
    {
        int opc = 0;
        int matriz[ ][ ] = new int [30][30];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Matriz \n 2 - Classificar Matriz \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    CarregaMatriz(matriz);
                    break;
                case 2:
                    ClassificarMatriz(matriz);
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
    public static void CarregaMatriz(int mat[ ][ ])
    {
        int i, j, valor ;
        valor = ( 20 );
        for ( i = 0 ; i < 30 ; i++ )
        {
            for ( j = 0 ; j < 30 ; j++ )
            {
                mat[i][j] = valor;
                valor = ( valor + 20 );
            }
        }
        JOptionPane.showMessageDialog(null,"A Matriz foi carregada com sucesso ! ");
    }
    public static void ClassificarMatriz (int mat [ ] [ ] )  
    {
        int i, j, aux, cont, k ;
        int vetor [] = new int [900];
        aux = ( 0 );
        k = ( 0 );
            for ( i = 0 ; i < 30 ; i++ )
            {
                for ( j = 0 ; j < 30 ; j++ )
                {
                    vetor [k] =( mat[i][j] );
                    k = ( k + 1 );
                }
            }
            for ( cont = 0 ; cont < 1000 ; cont ++ ) 
            {
                for ( k = 0 ; k < 899 ; k++ )
                {
                    if ( vetor [ k ] > vetor [ k + 1 ] )
                    {
                        aux = ( vetor [k] );
                        vetor [ k ] = ( vetor [k+1] );
                        vetor [ k+ 1 ] = ( aux );
                    }
                }
            }
            k = ( 0 );
            for ( i = 0 ; i < 30 ; i++ )
            {
                for ( j = 0 ; j < 30 ; j++ )
                {
                    mat[i][j] = ( vetor[k] );
                    k = ( k + 1 );
                }
            }
            
        JOptionPane.showMessageDialog(null,"A Matriz foi classificada");
        for ( i = 0 ; i < 30 ; i++ )
        {
            for ( j = 0 ; j < 30 ; j++ )
            {
                JOptionPane.showMessageDialog(null,"mat[" + i + "][" + j + "] = " + mat[i][j]);            
            }
        }
    }    
}