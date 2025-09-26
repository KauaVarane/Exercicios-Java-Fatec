/*
12.	Carregar códigos das peças em um tabuleiro de xadrez, onde:
 
Calcular e mostrar a soma das peças do tabuleiro.
Não pode utilizar estrutura de decisão e Escolha Caso na contagem das peças

*/
import javax.swing.JOptionPane;
public class Lt01_Mat_ex12 {
    public static void main(String arg[]) {
        int opc = 0;
        int tabuleiro[][] = new int[8][8];
        int cont[] = new int[7]; // contadores: [0]=Peão, [1]=Torre, ..., [6]=Vazio

        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Carregar Tabuleiro\n2 - Exibir Contagem das Peças\n9 - Fim"));

            switch (opc) {
                case 1:
                    tabuleiro = CarregaTabuleiro(tabuleiro, cont);
                    break;
                case 2:
                    ExibirContagem(cont);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA");
            }
        }
    }

    public static int[][] CarregaTabuleiro(int tab[][], int cont[]) {
        int i, j, codigo;
        for (i = 0; i < 8; i++) {
            for (j = 0; j < 8; j++) {
                codigo = Integer.parseInt(JOptionPane.showInputDialog(
                        "Digite o código da peça para posição [" + i + "][" + j + "] (1-6 peça, 7 vazio)"));
                tab[i][j] = codigo;
                cont[codigo - 1]++; 
            }
        }
        return tab;
    }

    public static void ExibirContagem(int cont[]) {
        String[] pecas = {"Peão", "Torre", "Bispo", "Cavalo", "Rainha", "Rei", "Vazio"};
        String msg = "Contagem das Peças:\n";
        for (int i = 0; i < cont.length; i++) {
            msg += pecas[i] + ": " + cont[i] + "\n";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
