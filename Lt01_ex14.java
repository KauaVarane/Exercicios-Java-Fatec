/*
14.	Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo



a1=int(input("Digite Ângulo 1:"))
a2=int(input("Digite Ângulo 2:"))
a3=((a1+a2)-180)
print("O valor do Ângulo 3 será:",a3)
 */
import javax.swing.JOptionPane;
public class Lt01_ex14
{
    public static void main (String args [ ] )
     {
        int  a1, a2, a3; 
         a1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ângulo 1 : "));  
         a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o Ângulo 2 : ")); 
         a3 = ( ( a1 + a2 ) - 180 ) ;
        JOptionPane.showMessageDialog(null,"O valor do Ângulo 3 será : "+a3);
     }
}

