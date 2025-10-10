/*
.......................................................................................	
.		Estatística		                         . 
.......................................................................................
.   CodigoCidade   :    NomeCidade  :  QtdAcidentes      .
.......................................................................................
.       int	                 :         String           :     int                      .
.......................................................................................

 */
package Transito_io;
public class ClasseAbstrata 
{
    int CodigoCidade ;String NomeCidade ; int QtdAcidentes ;
    ClasseAbstrata()
    {
        this(0, " ", 0);
    }
    ClasseAbstrata( int pcodigocidade, String pnomecidade, int pqtdacidentes )
    {
        CodigoCidade = ( pcodigocidade ) ; 
        NomeCidade = ( pnomecidade ) ;
        QtdAcidentes = ( pqtdacidentes ) ;
    }
}
