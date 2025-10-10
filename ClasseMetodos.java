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
package Transito_io;
import java.io.*;
import javax.swing.*;
public class ClasseMetodos 
{
    public ClasseAbstrata [ ] FCADRASTRAESTATISTICA (ClasseAbstrata[] classeabstrata)throws IOException
    {
        int i; String fileName = "ArquivoEstatistica.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
        for ( i=0 ; i < 10 ; i++)
        {
            classeabstrata[i] = new ClasseAbstrata();
        }
        for ( i=0 ; i < 10; i++)
        {
            classeabstrata[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Cidade:"));
            gravar.write(Integer.toString(classeabstrata[i].CodigoCidade));
            gravar.newLine();
            classeabstrata[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da Cidade:");
            gravar.write(classeabstrata[i].NomeCidade);
            gravar.newLine();
            classeabstrata[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Acidentes :"));
            gravar.write(Integer.toString(classeabstrata[i].QtdAcidentes));
            gravar.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        gravar.close();
        return classeabstrata;
    } 
    public void PQTDACIDENTES ( ClasseAbstrata[ ] classeabstrata )throws IOException
    {
        int i;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader Quantidade = new BufferedReader(new FileReader(fileName));
        for ( i = 0 ; i < 10 ; i++)
        {
            classeabstrata[i] = new ClasseAbstrata();
        }
        for ( i = 0 ; i < 10 ; i ++ )
        {
           classeabstrata[i].CodigoCidade = Integer.parseInt(Quantidade.readLine());
           classeabstrata[i].NomeCidade = Quantidade.readLine(); 
           classeabstrata[i].QtdAcidentes = Integer.parseInt(Quantidade.readLine()); 
        }
        for (i = 0 ; i < 10; i++) 
        {
            if ( classeabstrata[i].QtdAcidentes > 100 && classeabstrata[i].QtdAcidentes< 500 )
            {
                System.out.println("O código "+classeabstrata[i].CodigoCidade+" da cidade de "+classeabstrata[i].NomeCidade+" tem : "+classeabstrata[i].QtdAcidentes+" acidentes");
            }
            else if ( classeabstrata[i].QtdAcidentes < 100)
            {
                System.out.println("O código "+classeabstrata[i].CodigoCidade+" da cidade de "+classeabstrata[i].NomeCidade+" tem Menos de 100 acidentes acidentes."+classeabstrata[i].QtdAcidentes+" acidentes");
            }
            else
            {
                System.out.println("O código "+classeabstrata[i].CodigoCidade+" da cidade de "+classeabstrata[i].NomeCidade+" tem Mais de 500 acidentes acidentes."+classeabstrata[i].QtdAcidentes+" acidentes");
            }
        }
        Quantidade.close();
    }
    public void PMAIORMENOR(ClasseAbstrata[] classeabstrata) throws IOException
    {
        int i=0,maior,menor;
        String cidademaior=" ",cidademenor=" ";
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader MaiorMenor = new BufferedReader ( new FileReader(fileName));
        for ( i = 0 ; i < 10 ; i++)
        {
            classeabstrata[i] = new ClasseAbstrata();
        }
        for ( i = 0 ; i < 10 ; i ++ )
        {
           classeabstrata[i].CodigoCidade = Integer.parseInt(MaiorMenor.readLine());
           classeabstrata[i].NomeCidade = MaiorMenor.readLine(); 
           classeabstrata[i].QtdAcidentes = Integer.parseInt(MaiorMenor.readLine()); 
        }
        maior = (classeabstrata[0].QtdAcidentes);
        menor = (classeabstrata[0].QtdAcidentes);
        cidademaior = classeabstrata[0].NomeCidade;
        cidademenor = classeabstrata[0].NomeCidade;
        for(i = 0 ; i < 10 ; i++)
        {
            if ( classeabstrata[i].QtdAcidentes > maior )
            {
                maior = ( classeabstrata[i].QtdAcidentes  );
                cidademaior = (classeabstrata[i].NomeCidade);
            }
            else if ( classeabstrata[i].QtdAcidentes< menor )
            {
                menor = ( classeabstrata[i].QtdAcidentes  );
                cidademenor = (classeabstrata[i].NomeCidade);
            }
        }
        System.out.println("A cidade com Maior número de acidentes é : "+cidademaior+" com "+maior+" acidentes");
        System.out.println("A cidade com Menor número de acidentes é : "+cidademenor+" com "+menor+" acidentes");
        MaiorMenor.close();
    }
    
    public void PACIMA( ClasseAbstrata[] classeabstrata) throws IOException
    {
        int i, media, cnt=0;
        String fileName = "ArquivoEstatistica.txt";
        BufferedReader Acima = new BufferedReader (new FileReader(fileName));
        for ( i = 0 ; i < 10 ; i++)
        {
            classeabstrata[i] = new ClasseAbstrata();
        }
        for ( i = 0 ; i < 10 ; i ++ )
        {
           classeabstrata[i].CodigoCidade = Integer.parseInt(Acima.readLine());
           classeabstrata[i].NomeCidade = Acima.readLine(); 
           classeabstrata[i].QtdAcidentes = Integer.parseInt(Acima.readLine()); 
        }
        for ( i = 0; i < 10 ; i++)
        {
            cnt = ( cnt + classeabstrata[i].QtdAcidentes );
        }
        media = ( cnt / 10 );
        for ( i = 0; i < 10 ; i++)
        {
           if ( classeabstrata[i].QtdAcidentes > media )
           {
              System.out.println("A cidade de " + classeabstrata[i].NomeCidade + " tem o número de acidentes acima da média (" + classeabstrata[i].QtdAcidentes + " acidentes)");

           }
        }
        System.out.println("A média dos acidentes é:"+media);
        Acima.close();
    }  
}
