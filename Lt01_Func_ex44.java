
/*
44.	Receba o número da base e do expoente. Calcule e mostre o valor da potência.
*/
import javax.swing.JOptionPane;
public class Lt01_Func_ex44
{
    public static void  main (String args [ ] )
    {
        int base , expoente, j, i ;
        base =  Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da Base : "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Expoente :"));
        j = ( 0 );
        i = ( 0 );
        JOptionPane.showMessageDialog(null,FuncaoBase(base , expoente, j, i ));
    }
    static String FuncaoBase(int b, int e, int jj, int ir)
    {
        String resultado = "";
        jj = ( b );
        if ( e != 1 )
        {
          for ( ir=1 ; ir < e ; ir++)
            {
                b = ( b * jj );
            }
          if ( e == 0 )
          {
              b = ( 1 );
          }
        }
        resultado = ( "O Resultado é : "+b );
        return ( resultado ) ; 
    }
}