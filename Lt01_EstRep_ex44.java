/*
44.	Receba o número da base e do expoente. Calcule e mostre o valor da potência.
*/
import javax.swing.JOptionPane ;
public class Lt01_EstRep_ex44 
{
    public static void main ( String args [ ] )
    {
        int base , expoente, j, i ;
        base =  Integer.parseInt(JOptionPane.showInputDialog("Digite o Número da Base : "));
        expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o Número do Expoente :"));
        j = ( base );
        if ( expoente != 1 )
        {
          for ( i=1 ; i < expoente ; i++)
            {
                base = ( base * j );
            }
          if ( expoente == 0 )
          {
              base = ( 1 );
          }
        }
        
        JOptionPane.showMessageDialog(null,"O Resultado é : "+base);
    }
}