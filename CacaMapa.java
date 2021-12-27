public class CacaMapa {
    private final short qtdLinha = 10;
    private final short qtdColuna = 5;
    private char[][] mapa = new char[qtdLinha][qtdColuna];

    public CacaMapa() {
        mapaEntrada();
    }

    private void mapaLinha() {
        for (short c = 0; c < qtdColuna; c++) {
            System.out.println("----");          
        }
        System.out.println("-");
        System.out.println();
        }

    public void imprimir() {
        mapaLinha();
        for (short l = 0; l < qtdLinha; l++) {
            for (short c = 0; c < qtdColuna;c++) {
                System.out.println("| " + mapa[l][c] + " ");
            }
            System.out.println("|");
            mapaLinha();
        }
    }
    //percorre as palavras de busca
    public void pesquisa(String[][] palavras) {
       short caracterAtual;

       for (short palavraAtual = 0; palavraAtual < palavras.length; palavraAtual++) {
           //mapa: busca na horizontal da esquerda para direita
           caracterAtual = 0;
           for (short l = 0; l < qtdLinha; l++) {
               for (short c = 0; c < qtdColuna; c++) {
                   if (mapa[l][c] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                       caracterAtual++;
                       if (caracterAtual == palavras[palavraAtual][0].length()) {
                           palavras[palavraAtual][1] = "[" + l + "," + (c - palavras[palavraAtual][0].length() + 1) + "]";
                           caracterAtual = 0;
                       }
                   } else {
                       caracterAtual = 0;
                   }
               }
           }
           //mapa: busca na horizontal da direita para esquerda
           caracterAtual = 0;
           for (short l = 0; l < qtdLinha; l++) {
               for (short c = qtdColuna - 1; c >= 0; c--) {
                   if (mapa[l][c] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                       caracterAtual++;
                       if (caracterAtual == palavras[palavraAtual][0].length()) {
                           palavras[palavraAtual][1] = "[" + l + "," + (c + palavras[palavraAtual][0].length() - 1) + "]";
                           caracterAtual = 0;
                       }
                   } else {
                       caracterAtual = 0;
                   }
               }
           }
           //mapa: busca na vertical de cima para baixo
           caracterAtual = 0;
           for (short c = 0; c < qtdColuna; c++) {
               for (short l = 0; l < qtdLinha; l++) {
                   if (mapa[l][c] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                       caracterAtual++;
                       if (caracterAtual == palavras[palavraAtual][0].length()) {
                        palavras[palavraAtual][1] = "[" + (l - palavras[palavraAtual][0].length() + 1) + "," + c + "]";
                        caracterAtual = 0;                     
                   }
               } else {
                   caracterAtual = 0;
               }
           }
       }
       //mapa: busca na vertical de baixo para cima
       caracterAtual = 0;
       for (short c = 0; c < qtdColuna; c++) {
           for (short l = qtdLinha - 1; l >= 0; l--) {
               if (mapa[l][c] == palavras[palavraAtual][0].charAt(caracterAtual)) {
                   caracterAtual++;
                   if (caracterAtual == palavras[palavraAtual][0].length()) {
                       palavras[palavraAtual][1] = "[" + (l + palavras[palavraAtual][0].length() - 1) + "," + c + "]";
                       caracterAtual = 0;
                   }
               } else {
                   caracterAtual = 0;
               }
           }
       }
    }
}
    //mapas de exemplo
private void mapaEntrada() {
    mapa[0][0]='C';  mapa[0][1]='C';  mapa[0][2]='Q';  mapa[0][3]='W';  mapa[0][4]='E';
    mapa[1][0]='I';  mapa[1][1]='X';  mapa[1][2]='F';  mapa[1][3]='O';  mapa[1][4]='R';
    mapa[2][0]='F';  mapa[2][1]='F';  mapa[2][2]='R';  mapa[2][3]='G';  mapa[2][4]='F';
    mapa[3][0]='E';  mapa[3][1]='L';  mapa[3][2]='I';  mapa[3][3]='H';  mapa[3][4]='W';
    mapa[4][0]='L';  mapa[4][1]='S';  mapa[4][2]='F';  mapa[4][3]='O';  mapa[4][4]='U';
    mapa[5][0]='S';  mapa[5][1]='D';  mapa[5][2]='G';  mapa[5][3]='T';  mapa[5][4]='S';
    mapa[6][0]='E';  mapa[6][1]='J';  mapa[6][2]='H';  mapa[6][3]='E';  mapa[6][4]='T';
    mapa[7][0]='I';  mapa[7][1]='I';  mapa[7][2]='I';  mapa[7][3]='J';  mapa[7][4]='M';
    mapa[8][0]='X';  mapa[8][1]='C';  mapa[8][2]='K';  mapa[8][3]='B';  mapa[8][4]='G';
    mapa[9][0]='V';  mapa[9][1]='E';  mapa[9][2]='T';  mapa[9][3]='O';  mapa[9][4]='R';
  }

}




    

     
              
           
    