/*
3.	Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6

 */
import javax.swing.JOptionPane;
public class Lt01_Vet_ex03 
{
    public static void main ( String arg [])
    {
        int opc = 0 ;
        int vetor1 [ ] = new int [ 3 ];
        int vetor2[ ] = new int [ 3 ];
        int vetor3 [ ]= new int [ 6 ];
        while ( opc != 9 )
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega Vetor 1 \n 2 - Carrega Vetor 2 \n 3 - Classifica Vetores \n 9 - FIM"));
            switch ( opc )
            {
                case 1 :
                    vetor1 = CarregaVetor1(vetor1);
                    break;
                case 2 :
                    vetor2 = CarregaVetor2(vetor2);
                    break;
                case 3 :
                    ClassificaVetores(vetor1, vetor2, vetor3);
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
    public static int [ ] CarregaVetor1 ( int vt1 [ ])
    {
        int cta;
        for ( cta = 0 ; cta < 3 ; cta ++)
        {
            vt1 [cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro :")); 
        }
        return vt1;
    }
    public static int [ ] CarregaVetor2(int vt2 [ ] )
    {
        int cta;
        for ( cta = 0 ; cta < 3 ; cta++)
        {
            vt2 [cta]= Integer.parseInt(JOptionPane.showInputDialog("Digite um Número inteiro :"));
        }
        return vt2;
    }
    public static void ClassificaVetores ( int vt2 [ ] , int vt1 [] , int vt3 [])
    {
        int j, i, cta;
        j = ( 0 );
        vt3[0] = vt1[0];
        vt3[1] = vt1[1];
        vt3[2] = vt1[2];
        vt3[3] = vt2[0];
        vt3[4] = vt2[1];
        vt3[5] = vt2[2];
        while ( j < 12 )
        {
            for (i = 0 ; i < 5; i ++)
            {
                if ( vt3[i] > vt3[i+1])
                {
                    cta = ( vt3[i]);
                    vt3[i] = ( vt3[i+1]);
                    vt3[i+1] = ( cta );
                }
            }
            j = ( j + 1 );
        }    
        for ( i = 0 ; i < 6 ; i ++ )
        {
            JOptionPane.showMessageDialog(null, "Os Vetor concatenado fica VET ["+i+"] O número do vetor é : "+vt3[i] );
        }
    }
}
