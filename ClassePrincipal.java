/*
       2)   ClassePrincipal
---------------------------------------------------------------
|	MENU ESTATÍSTICA	               	|
| Estatísticas de acidentes em 2020		|
| 1 - Cadastro Estatística			|
| 2 - Consulta por quantidade de acidentes	|
| 3 - Consulta por estatísticas de acidentes	|
| 4 - Acidentes acima da média das 10 cidades   |
| 9 - Finaliza 		   		              |
----------------------------------------------------------------

 */
package Transito_io;
import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassePrincipal 
{
    public static void main ( String args [ ] ) throws IOException
    {
        ClasseAbstrata [ ] classeabstrata = new ClasseAbstrata [10];
        ClasseMetodos m = new ClasseMetodos ();
        int opc = 0;
        while ( opc!= 9)
        {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Cadastro Estatística \n 2 - Consulta por quantidade de acidentes  \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades  \n 9 - Fim"));
            switch ( opc )
            {
                case 1 : classeabstrata = m.FCADRASTRAESTATISTICA(classeabstrata);
                break;
                case 2 : m.PQTDACIDENTES(classeabstrata);
                break;
                case 3 : m.PMAIORMENOR(classeabstrata);
                break;
                case 4 : m.PACIMA(classeabstrata);
                break;
                case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO");
                break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
}
