/*
13.	Receba a quantidade de alimento em quilos. 
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 */
import javax.swing.JOptionPane;
public class Lt01_ex13
{
    public static void main (String args [ ] )
     {
        int  qakg, g, cd, d ; 
         qakg = Integer.parseInt(JOptionPane.showInputDialog("Digite quantidade de alimentos(kg) : "));  
         g = ( qakg * 1000 );
         cd = ( 50 );
         d = ( g / cd );
        JOptionPane.showMessageDialog(null,"Os alimentos ira durar : "+d+" Dias");
     }
}

