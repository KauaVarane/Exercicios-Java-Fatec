/*
 Receba a partir do programa principal um valor positivo maior que 3 e menor ou igual a 18, 
caso não esteja no intervalo emitir mensagem de erro "VALOR DEVE SER MAIOR QUE 3 E MENOR IGUAL A 18" 
e voltar a coletar novo dado até que seja válido. Após validado, faça a chamada: Função(ões) Recursiva(s) que receba o valor(es), 
calcule a soma da série, retorne e mostre no programa principal o resultado:

Série = (2)^(N) + (2)^(N-1) + (2)^(N-2) + ... + (2)^1

Não será considerado outro tipo de solução: Ex: 2 * 2 * 2..., Math.pow(2, N), 2^N ...
 */
import javax.swing.JOptionPane;
public class RecFunction_ex6 
{
    public static void main (String args [ ] )
    {
      int n ;
      n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
      while ( n <=3 || n > 18 )
      {
          JOptionPane.showMessageDialog(null,"VALOR DEVE SER MAIOR QUE 3 E MENOR IGUAL A 18");
          n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
      }
      JOptionPane.showMessageDialog(null,"O Resultado da série é igual a : "+fserie(n));
    }    
    public static int fserie ( int num )
    {
        if ( num == 1 )
            return 2 ;
        else 
            return ( fseriepotencia(num) + fserie(num - 1) ); 
    }
    public static int fseriepotencia (int num )
    {
        if ( num == 1 )
        {
            return 2 ;
        }
        else 
        {
            return 2 * fseriepotencia ( num  - 1);
        }
    }
}
