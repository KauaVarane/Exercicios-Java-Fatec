/*
.......................................................................................	
.		Estatística		                         . 
.......................................................................................
.   CodigoCidade   :    NomeCidade  :  QtdAcidentes      .
.......................................................................................
.       int	                 :         String           :     int                      .
.......................................................................................

 */
package RegistroLogico_Transito;
class ClasseAbstrata 
{
    int pcodigo;
    String pnomecidade;
    int pacidentes;
    ClasseAbstrata()
    {
        this (0, "", 0);
    }
    ClasseAbstrata (int pcodigoclasse, String pnomecidadeclasse, int pacidentesclasse )
    {
        pcodigo = pcodigoclasse;
        pnomecidade = pnomecidadeclasse;
        pacidentes = pacidentesclasse;       
    }
}
    

