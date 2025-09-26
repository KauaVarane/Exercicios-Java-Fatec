/*
 35. Receba 2 números inteiros, verifique qual o maior entre eles. 
     Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
*/

import javax.swing.JOptionPane;

public class Lt01_Func_ex35
{
    public static void main(String args[])
    {
        int n1, n2, maior, menor, resultado;
        resultado = 0;
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));
        maior = 0;
        menor = 0;
        JOptionPane.showMessageDialog(null, "A soma dos ímpares é = " + FunçãoMaior(n1, n2, maior, menor, resultado));
    }

    static int FunçãoMaior(int num1, int num2, int big, int small, int res)
    {
        if (num1 > num2)
        {
            big = num1;
            small = num2;
        }
        else
        {
            big = num2;
            small = num1;
        }

        while (small <= big)
        {
            if (small % 2 != 0)
            {
                res += small; 
            }
            small++;
        }
        return res;
    }
}
