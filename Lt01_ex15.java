/*
15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.

c1=int(input("Digite Cateto 1:"))
c2=int(input("Digite Cateto 2:"))
h=((c1*c1)+(c2*c2))
print("O valor da Hipotenusa será:",h)
 */
import javax.swing.JOptionPane;
public class Lt01_ex15
{
    public static void main (String args [ ] )
     {
        int  c1, c2, h; 
         c1 = Integer.parseInt(JOptionPane.showInputDialog("Digite Cateto 1 : "));  
         c2 = Integer.parseInt(JOptionPane.showInputDialog("Digite Cateto 2 : "));
         h = ( ( c1 * c1 ) + ( c2 * c2 ) ) ;
        JOptionPane.showMessageDialog(null,"O valor da Hipotenusa será : "+h);
     }
}

