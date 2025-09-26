
/*
   40. Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles. 
*/
import javax.swing.JOptionPane;

public class Lt01_EstRep_ex40 {
    public static void main(String args[]) {
        int inicio, fim, temp, num, primo, i;

        inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));

        if ( inicio > fim ) 
        {
            temp = ( inicio );
            inicio = ( fim );
            fim = ( temp );
        }
        num = ( inicio + 1 ); 
        JOptionPane.showMessageDialog(null, "Números primos entre " + inicio + " e " + fim + " :");
        while (num < fim) 
        {
            if (num >= 2) 
            {
                i = ( 2 );
                primo = ( 1 );
                while ( i * i <= num ) 
                {
                    if ( num % i == 0 ) 
                    {
                        primo = 0;
                        break;
                    }
                    i = ( i + 1 );
                }
                if ( primo == 1 ) 
                {
                    JOptionPane.showMessageDialog(null, num);
                }
            }
            num = ( 1 + num );
        }
    }
}
