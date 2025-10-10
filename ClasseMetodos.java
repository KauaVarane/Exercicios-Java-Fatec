/*
 3) Criar ClasseMetodos conforme:
* exibir em todos os campos: código, nome, quantidade 
1) Cadastrar 10 registros a partir do método                       - FCADRASTRAESTATISTICA (função);
2) Consulta por quantidade de acidentes > 100 e < 500; - PQTDACIDENTES (procedimento);
3) Consultar por:                                                                        - PMAIORMENOR (procedimento);
    menor número de acidentes; 
    maior número de acidentes;
4) Cidades com qtd de acidentes acima da média das 10 cidades -PACIMA (procedimento);   

 */
package RegistroLogico_Transito;
import javax.swing.JOptionPane;

public class ClasseMetodos 
{  
  public ClasseAbstrata[] FCADRASTRAESTATISTICA(ClasseAbstrata[] classeabstrata)
  {
    int i;
    for (i = 0 ; i < 10 ; i++)
    {
      classeabstrata[i].pcodigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade:"));
      classeabstrata[i].pnomecidade = JOptionPane.showInputDialog("Digite o nome da cidade:");
      classeabstrata[i].pacidentes =Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes:"));
    }
    return classeabstrata;
  }  
  public void PQTDACIDENTES( ClasseAbstrata[] classeabstrata) //Consulta por quantidade de acidentes > 100 e < 500; - PQTDACIDENTES (procedimento)
  {
    int i;
    for (i = 0 ; i < 10; i++) 
    {
        if ( classeabstrata[i].pacidentes > 100 && classeabstrata[i].pacidentes < 500 )
        {
            System.out.println("O código "+classeabstrata[i].pcodigo+" da cidade de "+classeabstrata[i].pnomecidade+" tem : "+classeabstrata[i].pacidentes+" acidentes");
        }
        else if ( classeabstrata[i].pacidentes < 100)
        {
            System.out.println("O código "+classeabstrata[i].pcodigo+" da cidade de "+classeabstrata[i].pnomecidade+" tem Menos de 100 acidentes acidentes."+classeabstrata[i].pacidentes+" acidentes");
        }
        else
        {
            System.out.println("O código "+classeabstrata[i].pcodigo+" da cidade de "+classeabstrata[i].pnomecidade+" tem Mais de 500 acidentes acidentes."+classeabstrata[i].pacidentes+" acidentes");
        }
    }
  }
    public void PMAIORMENOR( ClasseAbstrata[] classeabstrata)//Consultar por:menor número de acidentes;maior número de acidentes;
    {
        int i=0,maior,menor;
        String cidademaior="",cidademenor="";
        maior = (classeabstrata[i].pacidentes);
        menor = (classeabstrata[i].pacidentes);
        for(i = 0 ; i < 10 ; i++)
        {
            if ( classeabstrata[i].pacidentes > maior )
            {
                maior = ( classeabstrata[i].pacidentes  );
                cidademaior = (classeabstrata[i].pnomecidade);
            }
            else if ( classeabstrata[i].pacidentes < menor )
            {
                menor = ( classeabstrata[i].pacidentes  );
                cidademenor = (classeabstrata[i].pnomecidade);
            }
        }
        System.out.println("A cidade com Maior número de acidentes é : "+cidademaior+" com "+maior+" acidentes");
        System.out.println("A cidade com Menor número de acidentes é : "+cidademenor+" com "+menor+" acidentes");
    }   
    public void PACIMA( ClasseAbstrata[] classeabstrata)// Cidades com qtd de acidentes acima da média das 10 cidades 
    {
        int i, media, cnt=0;
        for ( i = 0; i < 10 ; i++)
        {
            cnt = ( cnt + classeabstrata[i].pacidentes );
        }
        media = ( cnt / 10 );
        for ( i = 0; i < 10 ; i++)
        {
           if ( classeabstrata[i].pacidentes > media )
           {
              System.out.println("A cidade de "+classeabstrata[i].pnomecidade+" tem o número de acidentes Acima da média. "+classeabstrata[i].pacidentes+" acidentes"); 
           }
           System.out.println("A média dos acidentes é:"+media);
        }
    }  
} 
